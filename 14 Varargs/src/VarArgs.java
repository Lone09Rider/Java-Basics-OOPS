
class Calc
{
    public int add(int a, int b)
    {
        return a + b;
    }
    public int multi_add(int ... a)
    {    //Variable args : For Multiple Values

        int sum = 0;
        for (int j : a)
        {
            sum = sum + j;
        }
        return sum;
    }
}

public class VarArgs {

    public static void main(String[] args) {
        Calc obj = new Calc();
        System.out.println(obj.add(4, 5));

        System.out.println(obj.multi_add(1, 3, 4, 5));

    }
}
