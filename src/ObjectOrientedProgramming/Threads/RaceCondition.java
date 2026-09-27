package ObjectOrientedProgramming.Threads;

/*
A race condition happens when multiple threads access and modify the same shared data at the same time, and the final result depends on which thread executes first.

    Race condition = multiple threads "race" to change the same data, causing an unpredictable or incorrect result.
 */

class Counter{
    int count;
    int count2;
    public void increment(){
        count++;
    }

    /*The synchronized keyword in Java is used to control access to shared resources when multiple threads are running.
    */
    public synchronized void increment2(){
        count2++;
    }
}
public class RaceCondition{
    public static void main(String args[]) throws InterruptedException{
        Counter c=new Counter();

        Runnable obj3=()->{
            for(int i=0;i<1000;i++){
                c.increment();
                c.increment2();
            }
        };

        Runnable obj4=()->{
            for(int i=0;i<1000;i++){
                c.increment();
                c.increment2();
            }
        };

        Thread t3=new Thread(obj3);
        Thread t4=new Thread(obj4);
        t3.start();
        t4.start();

        t3.join();
        t4.join();

        System.out.println(c.count);
        System.out.println(c.count2);
    }
}
