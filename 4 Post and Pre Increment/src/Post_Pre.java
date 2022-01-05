public class Post_Pre {
    public static void main(String[] args) {
        int m = 4;
        int n = 5;
        // ++n = Pre-Increment (Increase First)
        // n++ = Post Increment (Increase in Second Run)

        System.out.println(n);
//        m = n++;
//        System.out.println(m);
//        System.out.println(n);

        m = ++n;
        System.out.println(m);
        System.out.println(n);
    }
}
