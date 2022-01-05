public class Triangle {
    public static void main(String[] args) {
        for (int i = 1; i<4; i++)
        {
            for (int j = 1; j<=i; j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 65; i<70; i++)
        {
            for (int j = 65; j<=i; j++)
            {
                System.out.print((char)j + " ");
            }
            System.out.println();
        }
    }
}
