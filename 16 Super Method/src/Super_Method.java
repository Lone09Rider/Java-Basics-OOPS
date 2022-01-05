
class A
{
    public A()
    {
        System.out.println("In A");
    }
    public A(int i)
    {
        System.out.println("In A Int");
    }
}

class B extends A
{
    public B()
    {
        super(); // By Default, it is called if no Parameters are there
        System.out.println("In B");
    }
    public B(int i)
    {
        super(i); // This Calls the parametrized Constructor of A
        System.out.println("In B Int");
    }
}

public class Super_Method {
    public static void main(String[] args) {
//        A obj1 = new A();
        B obj2 = new B();
        System.out.println();
        System.out.println();
        B obj3 = new B(5);
    }
}
