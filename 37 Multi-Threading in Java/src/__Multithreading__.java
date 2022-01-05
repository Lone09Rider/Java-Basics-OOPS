import java.util.Arrays;

class A
{
    public void show()
    {
        for (int i = 0; i<5; i++)
        {
            System.out.println("Hi");
            try { Thread.sleep(500);} catch (Exception e) { }
        }
    }
}

class B {
    public void show() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {Thread.sleep(500);} catch (Exception e) {System.out.println(e);}
        }
    }
}
class MyThread extends A implements Runnable
{
    int[] values = {6, 5, 9, 7, 8};
    public void run() // Must have a Run
    {
        for (int i = 0; i<5; i++)
        {
            values[i] = values[i] * 2;
        }
        System.out.println(Arrays.toString(values));
    }
}

public class __Multithreading__ {
    public static void main(String[] args) {

        A obj1 = new A();
        B obj2 = new B();

        obj1.show();
        obj2.show();

        MyThread obj = new MyThread();
        obj.run();

    }
}

