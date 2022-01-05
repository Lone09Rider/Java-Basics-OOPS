class Student
{
    int rollno;
    String name;
}

public class Array {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        s1.name = "Suresh";
        s1.rollno = 69;
        s2.name = "Manoj";
        s2.rollno = 96;
        s3.rollno = 9;
        s3.name = "SRJ";
        s4.rollno = 67;
        s4.name = "Meena";

        Student s[] = {s1, s2, s3, s4};

        for (int i = 0; i<4; i++)
        {
            System.out.println(s[i].name +" "+ s[i].rollno);
        }

        System.out.println();
        System.out.println();

        int nums[] = new int[4];
        nums[1] = 1;
        nums[0] = 9;
        nums[2] = 5;
        nums[3] = 76;
        System.out.println(nums[2]);
        nums[2] = 59;
        System.out.println(nums[2]);
        System.out.println();
        for (int i = 0; i<4; i++)
        {
            System.out.println(nums[i]);
        }

        System.out.println();
        System.out.println();

        int nums1[] = {8, 12, 9, 5};
        for (int i = 0; i<4; i++)
        {
            System.out.println(nums1[i]);
        }
    }
}
