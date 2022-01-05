class Emp
{
    int eid, salary;
    // Sets same for all
    static String ceo;

    // Static Block but runs only Ones
    static
    {
        ceo = "Larry;";
        System.out.println("In Static");
    }

    public Emp()
    {
        eid = 1;
        salary = 2000;
    }

    public void show()
    {
        System.out.println(eid+" : "+salary+" : "+ceo);
    }
}

public class StaticDemo {
    //  We can mak e Static variables in order to use inside static block
    static int i = 0;
    public static void main(String[] args) {
        System.out.println(i);
        Emp navin = new Emp();
//        navin.eid = 8;
//        navin.salary = 4000;
//        navin.ceo = "Mahesh";

        Emp rahul = new Emp();
//        rahul.eid = 9;
//        rahul.salary = 5000;
//        rahul.ceo = "Mahesh";
//        // Static will also change for Naveen
//        rahul.ceo = "Nikita";

        navin.show();
        rahul.show();

        //  To access a static Keyword we don't need Object
        System.out.println(Emp.ceo);
    }
}
