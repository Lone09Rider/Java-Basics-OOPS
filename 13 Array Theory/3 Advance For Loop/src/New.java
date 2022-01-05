public class New {
    public static void main(String[] args) {

        int a[] = {1, 2, 3, 4};
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]+", ");
        }
        System.out.println();
        System.out.println();
        // Enhanced For Loop For Array
        for (int k:a)
        {
            System.out.print(k + " ");
        }


        System.out.println();
        System.out.println();

        int arr[][] = {
                {1, 2, 3},
                {1, 2, 3, 4},
                {1, 2, 3, 4, 5, 6}
        };

        for (int k[]:arr)
        {
            for (int l:k)
            {
                System.out.print(l);
            }
            System.out.println();
        }


    }
}
