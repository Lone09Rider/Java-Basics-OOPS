
// Encapsulation >> Binding Data with Methods

class Student
{
    private int rollno;
    private String name;
    // Should be Accessed through Methods
    // Known as Getters(to get value) and Setters(to set value)

    public void setRollno(int r)
    {
        rollno = r;
    }
    public int getRollno()
    {
        return rollno;
    }

    public void setName(String  n)
    {
        name = n;
    }
    public String  getName()
    {
        return name;
    }

}

public class _Encap_ {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRollno(2);
        System.out.println(s1.getRollno());

        s1.setName("Naveen");
        System.out.println(s1.getName());

    }
}
