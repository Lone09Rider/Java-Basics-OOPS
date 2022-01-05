
class X
{
    public X()
    {
        System.out.println("In X");
    }
    public X(int i)
    {
        System.out.println("In X Int");
    }
}

class Y extends X
{
    public Y()
    {
        // For That if we add any Integer in Super Method
        super(5);
        System.out.println("In Y");
    }
}
public class Super_Method_in_Deep {
    public static void main(String[] args) {
        Y obj = new Y();
        // Call B Constructor and A Parameterized Constructor

    }
}
