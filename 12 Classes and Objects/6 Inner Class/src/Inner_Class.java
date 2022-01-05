/*
* Inner Class
* Member Class
* Static Class
* Anonymous Class
*
* */

class Outer
{
    static int a; // Member Variable
    public static void show() // Member Method
    {
        System.out.println("In Outer Method");
    }
    static class Inner  // Member Class
    {
        public void display()
        {
            System.out.println("In Display");
        }
    }
}

public class Inner_Class
{
    // Variable, methods

    public static void main(String[] args)
    {
//        class name = constructor
        Outer obj = new Outer();
        obj.show();
        // For Inner Class not static
//        Outer.Inner obj1 = obj.new Inner();
        // For Static Class
        Outer.Inner obj1 = new Outer.Inner();
        obj1.display();
    }
}
