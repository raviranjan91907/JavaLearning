package ObjectOrientedProgramming.Threads;


/*
    Thread priority tells the Java thread scheduler the relative importance of a thread
    compared with other threads.

    Thread priority is a number that indicates how important a thread is relative to other threads.
 */
class A1 extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("A");
        }
    }
}

class B1 extends Thread{
    public void run(){
        for(int i=0;i<100;i++) {
            System.out.println("B");
        }
    }
}

public class ThreadsPriority {
    public static void main(String args[]){
        A1 obj1=new A1();
        B1 obj2=new B1();


        System.out.println(obj1.getPriority());//this function will give the priority of the thread

        obj2.setPriority(Thread.MAX_PRIORITY);//setPriority() will help in setting priority
        //And Thread.MAX_PRIORITY here we are suggesting the scheduler that this thread should get max priority it doesn't mean that the scheduler will the max priority

        obj1.start();
        obj2.start();

    }
}
