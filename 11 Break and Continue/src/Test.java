public class Test {
    public static void main(String[] args) {
        for (int i = 1; i<=10; i++)
        {
            if (i == 7)
            {
                continue;
            }
            System.out.println("Value is : "+i);
        }
        System.out.println();
        System.out.println();
        for (int i = 1; i<=10; i++)
        {
            if (i == 4)
            {
                break;
            }
            System.out.println("Value is : "+i);
        }
    }
}
