package multipleThread;

public class ThreadPrime implements Runnable{
    int count=0;
    @Override
    public void run() {
        for(int j=2;j<=100;j++)
        {
            for(int i=1;i<=j;i++)
            {
                if(j%i==0)
                {
                    count++;
                }
            }
            if(count==2)
                System.out.print("Prime Number ="+j+"  ");
        }
    }
}
