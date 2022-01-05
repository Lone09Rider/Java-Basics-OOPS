
class A
{
    public void show()
    {
        System.out.println("In A");
    }
}

class B extends A
{
    @Override
    public void show()
    {
        System.out.println("In B");
    }

    public void config()
    {
        System.out.println("CONFIG");
    }
}

class C extends A
{
    @Override
    public void show()
    {
        System.out.println("In C");
    }
}

public class Dynamic_Method_Dispatch {

    // Compile Time and Run Time
    public static void main(String[] args) {
        B obj = new B();
        obj.show();

        System.out.println();

        A obj1 = new B();  // During Runtime this works hence RUNTIME POLYMORPHISM
        obj1.show();
//        obj1.config(); // Error Because Not In A config method obj1 is referring A

        System.out.println();

        obj1 = new C();
        obj1.show();

    }
}
