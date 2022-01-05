// There is Ambiguity in this Show() Method hence JAVA Removed MULTIPLE INHERITANCE
class A
{
    public void show()
    {
        System.out.println("In A");
    }
}
class B
{
    public void show()
    {
        System.out.println("In B");
    }
}
class C extends B
{

}

public class Multiple_Inhe {
    public static void main(String[] args){
        C obj = new C();
        obj.show();
    }
}
