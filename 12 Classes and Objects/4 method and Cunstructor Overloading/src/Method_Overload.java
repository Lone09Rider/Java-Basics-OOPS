class Casio
{
    // Constructor Overloading
    public Casio()
    {
        System.out.println("Hello");
    }
    public Casio(int i)
    {
        System.out.println(i);
    }
    public Casio(int i, int j)
    {
        System.out.println(i +" "+ j);
    }

    // Method Overloading
    public void add(int i, int j)
    {
        System.out.println(i + j);
    }
    public void add(int i, int j, int k)
    {
        System.out.println(i + j + k);
    }
    public void add(int i, int j, double k)
    {
        System.out.println(i + j + k);
    }

}

public class Method_Overload {
    public static void main(String[] args)
    {
        // For Method Overloading
        Casio obj = new Casio();
        obj.add(2, 3);
        obj.add(1,2, 3);
        obj.add(1,2, 3.5);

        // For Constructor Overloading
        Casio obj1 = new Casio(1);
        Casio obj2 = new Casio(2, 2);


    }
}
