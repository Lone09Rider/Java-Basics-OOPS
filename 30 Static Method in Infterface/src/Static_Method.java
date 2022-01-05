
interface Demo
{
    void abc();
    int i = 9; // A variable inside a interface is FINAL so unchanged
    static void show()
    {
        System.out.println("Hi");
    }
}

class DemoImp implements Demo
{
    public void abc()
    {
//        i = 9;
        System.out.println("Hi");
    }
}

public class Static_Method {
    public static void main(String[] args) {

        Demo.show();


    }
}
