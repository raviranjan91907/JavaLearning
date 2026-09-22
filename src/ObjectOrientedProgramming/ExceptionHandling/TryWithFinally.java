package ObjectOrientedProgramming.ExceptionHandling;


public class TryWithFinally {
    public static void main(){
/*
    In Java, try with finally is used when you want to make sure some code always executes,
     whether an exception occurs or not.
 */
//        try {
//            int a = 10 / 0;
//        }
//        finally {
//            System.out.println("This will always execute");
//        }

        /*
            This main purpose of the try-finally block is to clean up suppose you have open a file
            and then an exception occur in this case file remain open so close that file in finally
            block which will always execute

            try {
                // open file
                // read file
             }
            finally {
                // close file
            }
            */

        /*
            You can also use all three(try-catch-finally)
            try {
                // risky code
            }
            catch (Exception e) {
                // handle exception
            }
            finally {
                // cleanup
            }
         */


        try {
            int a = 10 / 0;
            System.out.println(a);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception handled");
        }
        finally {
            System.out.println("Finally block executed");
        }

    }
}
