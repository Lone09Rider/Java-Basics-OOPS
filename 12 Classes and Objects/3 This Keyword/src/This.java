class Calc
{
    int num1, num2, result;

    public Calc()
    {
        num1 = num2 = 5;
        System.out.println("In Cons");
    }

    // If Local and Instance are of Same Name then we use 'this'
    public Calc(int num1, int num2)
    {
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("In Cons");
    }
}

public class This {
    public static void main(String[] args) {
        Calc obj = new Calc();
        System.out.println(obj.num1);
        System.out.println(obj.num2);

        Calc obj1 = new Calc(9, 8);
        System.out.println(obj1.num1);
        System.out.println(obj1.num2);

    }
}
