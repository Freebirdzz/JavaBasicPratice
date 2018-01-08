package sxfspring.ioc;

public class ITestInterfaceImpl implements ITestInterface {
    public String sayHello(String name) {
        return "Hello" + name;
    }

    public void sayHello() {
        System.out.println("Hello Kevin, do you have a nice day?");
    }

    public int add(int n1, int n2) {
        return (n1 + n2);
    }
}
