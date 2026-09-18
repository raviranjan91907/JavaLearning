package ObjectOrientedProgramming.ExceptionHandling;


/*j
    Exception Ducking means that instead of handling a checked exception inside the current method, we pass the responsibility of handling it to the calling method using the throws keyword
 */

import static java.lang.Class.forName;

class A{
    public void show() throws ClassNotFoundException{
        Class.forName("Calc");
    }
}
public class DuckingAnException {
    static{
        System.out.println("Class Loader");
    }
    public static void main(String args[]) {
        A obj=new A();
        try{
            obj.show();
        }
        catch (ClassNotFoundException e){
            System.out.println("No Class Found");
        }
    }
}
