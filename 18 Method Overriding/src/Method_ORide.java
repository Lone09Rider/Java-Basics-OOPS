
class A
{
    public void show()
    {
        System.out.println("In A");
    }
}

class B extends A
{
    // OVERRIDES THE METHOD OF CLASS A IF REMOVED THEN PRINTS "IN A"

    @Override
    public void show()
    {
        super.show();  // IF We Want To Call A Also after OVER-RIDING
        System.out.println("In B");
    }
}

public class Method_ORide {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
