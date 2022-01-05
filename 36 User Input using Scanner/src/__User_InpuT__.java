import java.util.Scanner;

public class __User_InpuT__ {
    public static void main(String[] args) {

        int n = 0;
        System.out.println("Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.err.println("Entered Number is : "+n);

        System.out.println("Enter a String : ");
        String s = sc.next();
        System.err.println("Entered String is : "+s);

    }
}
