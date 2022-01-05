
class Calculator // Super,Parent, Base
{
    public int add(int i, int j)
    {
        return i+j;
    }
}

class AdvanceCalc extends Calculator  // Sub, Child, Derived
{

    public int sub(int i, int j)
    {
        return i-j;
    }
}

class VeryAdvanceCalc extends AdvanceCalc  // Multilevel Inheritance
{
    public int mul(int i, int j){
        return i*j;
    }
}



public class Inheritance {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        int result = c1.add(4,5);

        System.out.println(result);

        AdvanceCalc ac1 = new AdvanceCalc();
        int res = ac1.sub(5, 4);
        System.out.println(res);
        int res2 = ac1.add(4, 5);
        System.out.println(res2);

        VeryAdvanceCalc vac1 = new VeryAdvanceCalc();
        int result1 = vac1.add(3,5);
        System.out.println(result1);

    }
}
