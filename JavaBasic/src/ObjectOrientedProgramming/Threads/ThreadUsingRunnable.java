package ObjectOrientedProgramming.Threads;

/*
    Runnable is an interface in Java used to define a task that can be executed by a thread.

   Q Why do we need Runnable interface
   Ans
    Java does not support multiple class inheritance.
    If we do:
        class MyTask extends Thread
    then MyTask cannot extend another class.

    But with Runnable:
    class MyTask extends Animal implements Runnable
    This is possible.



    unnable is an interface in Java used to define a task that can be executed by a thread.
    It contains the run() method, and using Runnable separates the task from the thread that
    executes it.
*/
class C{
    String p="Parent";
}

class A2 extends C implements Runnable {
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("A");
            try {
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

class B2 implements Runnable{
    public void run(){
        for(int i=0;i<5;i++) {
            System.out.println("B");
            try {
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}


public class ThreadUsingRunnable {
    public static void main(String args[]){
//        Runnable obj1=new A2();
//        Runnable obj2=new B2();
//
//        Thread t1=new Thread(obj1);
//        Thread t2=new Thread(obj2);
//
//        t1.start();
//        t2.start();

        Runnable obj3=()->{
            for(int i=0;i<10;i++){
                System.out.println("A2");
                try {
                    Thread.sleep(10);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        Runnable obj4=()->{
            for(int i=0;i<10;i++){
                System.out.println("B2");
                try {
                    Thread.sleep(10);
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        Thread t3=new Thread(obj3);
        Thread t4=new Thread(obj4);
        t3.start();
        t4.start();

    }
}
