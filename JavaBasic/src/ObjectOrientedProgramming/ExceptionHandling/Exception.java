package ObjectOrientedProgramming.ExceptionHandling;

//creating our own Exception
class MyException extends Throwable{
    public MyException(String str){
        super(str);
    }
}

public class Exception {
    public static void main(String args[]) {
        int i = 12;
        int j = 0;
        int arr[]=new int[5];

        try {
            int result = i / j;
            System.out.println(arr[5]);
            if(j==0){
                throw new java.lang.ArithmeticException("The denominator should not be zero");
            }
        }
        catch (java.lang.ArithmeticException e) {
            System.out.println("Dividing by zero is not allowed");
        }
        catch(java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println("Excess the element which is inside the array limit");
        }
        catch (java.lang.Exception e){
            System.out.println("Something went wrong");
        }

        System.out.println("The value of j is : "+j);
        System.out.println("Last Statement");

        //Create our own Exception
        int n=1;
        try{
            if(n==1){
                throw new MyException("The n should not be zero");
            }
        }
        catch (MyException e){
            System.out.println("This is the catch block for MyException \n"+e);
        }


    }
}
