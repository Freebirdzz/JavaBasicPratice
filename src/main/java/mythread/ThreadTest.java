package mythread;

class Thread1 extends Thread{
    private int counter = 20;
    public void run(){
        while (counter > 0) {
            System.out.println("Count = " + counter);
            counter--;
        }
    }
}

class Thread2 implements Runnable{
    private int counter = 20;
    @Override
    public void run() {
        while(counter > 0){
            System.out.println("Counter = " + counter);
            counter--;
        }
    }
}
public class ThreadTest {
    public static void main(String[] args){
        Thread1 t1 = new Thread1();
        Thread1 t2 = new Thread1();
        t1.start();
        t2.start();
        System.out.println("-------------上面的例子，两个独立的线程，没有实现资源共享，因为是各自独立的资源------------");

        Thread2 th = new Thread2();
        Thread t11 = new Thread(th);
        Thread t12 = new Thread(th);
        t11.start();
        t12.start();
    }
}
