public class Exception_Demo {
    public static void main(String[] args) {

        try
        {
            int i = 7;
            int j = 0;
            int k = i/j;
            System.out.println("Output is : "+k);
        }
        catch (Exception e)
        {
            System.err.println("Cannot divide by ZERO");  // Err - Prints Error in Red
        }
        finally
        {
            System.out.println("Bye");
        }
    }
}
