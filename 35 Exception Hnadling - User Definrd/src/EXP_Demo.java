import KIRA.KiraException;


public class EXP_Demo {
    public static void main(String[] args) {

        int i, j;
        i = 8;
        j = 9;

        try
        {
            int k = i / j;
            System.out.println(k);

            if (k == 0)
            {
                throw new KiraException("This is not possible"); // My Exception
            }
        }
        catch (KiraException e)
        {
            System.err.println("Error : " + e.getMessage());
        }

    }
}
