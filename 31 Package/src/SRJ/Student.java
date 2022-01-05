package SRJ;

class Stud
{
    public int rollno;
    public int Rno(int i)
    {
        rollno = i;
        return i;
    }
}


public class Student {
    public static void main(String[] args) {
        Stud obj = new Stud();
        System.out.println(obj.Rno(4));
    }
}
