public class _2D_Array {
    public static void main(String[] args) {

        // 1 D Array
        int nums[] = {8, 12, 76, 54};

        for (int i = 0; i<4; i++)
        {
            System.out.println(nums[i]);
        }

        System.out.println();
        System.out.println();

        // 2 D Array
        int a[] = {1, 2, 3, 4};
        int b[] = {2, 4, 6, 8};
        int c[] = {5, 6, 7, 8};

        int d[][] = {
                        {1, 2, 3, 4},
                        {2, 4, 6, 8},
                        {5, 6, 7, 8}
                    };
        System.out.println(d[0][1]);
        System.out.println();
        for (int i = 0; i<3; i++)
        {
            for (int j = 0;j<4;j++)
            {
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        int arr[][] = // Jagged Array
                {
                    {1, 2, 3},
                    {2, 4},
                    {5, 6, 7, 8}
                };
        for (int i = 0; i< arr.length; i++)
        {
            for (int j = 0; j<arr[i].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
