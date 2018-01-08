package designpattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//定义可供client调用的接口
interface Subject{
    void sayHello();
    void rpcMethod(String args);
}
//实际方法的实现体
class RealSubject implements Subject{

    public void sayHello() {
        System.out.println("-----Today is a fantastic day.-----");
    }

    public void rpcMethod(String args) {
        System.out.println("-----Execute the rpc method with arguments(args = " + args + ").-----");
    }
}
//定义代理对象
class MyDynamicProxy implements InvocationHandler {
    //我们要代理的真实对象，毕竟最终的方法调用是要通过真实的对象来调用的，也就是我们上面定义的RealSubject这个对象
    private Object subject;

    //构造方法，给我们要代理的真实对象赋初值
    public MyDynamicProxy(Object obj){
        this.subject = obj;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("**********Before execute the real method**********");

        System.out.println("Method:" + method);

        //    当代理对象调用真实对象的方法时，其会自动的跳转到代理对象关联的handler对象的invoke方法来进行调用
        method.invoke(subject, args);

        //　　在代理真实对象后我们也可以添加一些自己的操作
        System.out.println("********** After finish the real method execution **********");

        return null;
    }
}
//客户端，测试我们的代理类，对于RPC来说，这个就相当于是执行rpc调用的一端
class Client{
    public void test(){
        //    我们要代理的真实对象
        Subject realSubject = new RealSubject();

        //我们要代理哪个真实对象，就将该对象传进去，最后是通过该真实对象来调用其方法的
        InvocationHandler handler = new MyDynamicProxy(realSubject);

        /*
         * 通过Proxy的newProxyInstance方法来创建我们的代理对象，我们来看看其三个参数
         * 第一个参数 handler.getClass().getClassLoader() ，我们这里使用handler这个类的ClassLoader对象来加载我们的代理对象
         * 第二个参数realSubject.getClass().getInterfaces()，我们这里为代理对象提供的接口是真实对象所实行的接口，表示我要代理的是该真实对象，这样我就能调用这组接口中的方法了
         * 第三个参数handler， 我们这里将这个代理对象关联到了上方的 InvocationHandler 这个对象上
         */
        Subject subject = (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(), realSubject
                .getClass().getInterfaces(), handler);

        System.out.println(subject.getClass().getName());
        subject.sayHello();
        subject.rpcMethod(" exec a RPC method");
    }
}
public class DynamicProxyPattern {
    public static void main(String[] args){
        new Client().test();
    }
}
