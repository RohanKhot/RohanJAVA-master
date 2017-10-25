package MultithredingDemo;

/**
 * Created by rohan on 19/9/17.
 */
class pooja implements Runnable
{
    public  void run()
    {
        for (int i=0;i<5;i++)
        {
            System.out.println("Let's DO");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Rohan implements Runnable
{
    public  void run()
    {
        for (int i=0;i<5;i++)
        {
            System.out.println("It's Over");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



public class MultithredDemo {
    public static void main(String[] args) {
        pooja p=new pooja();
        Rohan r=new Rohan();

        Thread t=new Thread(p);
        t.start();
        t.setPriority(1);
        Thread t1=new Thread(r);
        t1.start();
        t1.setPriority(10);
        System.out.println("Do it Fast");
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

    }

}
