package MultithredingDemo;

public class Demo1 extends Thread
{
    public void run()
    {

        for (int i=0;i<6;i++)
        {
            System.out.println("codekul");
            try
            {
                sleep(1000);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args)
    {

        Demo1 demo=new Demo1();
        demo.start();
    }
}
