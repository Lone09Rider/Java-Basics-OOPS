class Calc
{
    int num1, num2, result;

    public Calc()  // Default Constructors
    {
        num1 = 5;
        num2 = 5;
        System.out.println("In CONSTRUCTOR");
    }

    public Calc(int n)  // Parametrized Constructors
    {
        num1 = num2 = n;
        System.out.println();
        System.out.println("In Second Constructor");
    }

}

public class Test {
    public static void main(String[] args) {
        Calc obj1 = new Calc();
        System.out.println(obj1.num1);
        Calc obj = new Calc(7);
        System.out.println(obj.num1);
    }
}
