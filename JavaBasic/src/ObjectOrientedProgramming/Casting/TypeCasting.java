package ObjectOrientedProgramming.Casting;
/*
    TypeCasting is the process of converting of one data type to another datatype
    There are two type of TypeCasting
    ->Widening Type Casting: Converting a smaller type to larger one
      example   int a = 10;
                double b = a;

    ->Narrowing type Casting: Converting larger type into smaller type
      example   double a=10.3;
                int b=(int) a;
*/

public class TypeCasting {
    public static void main(String args[]){
        //Widening type casting
        int a=10;
        double b=a;//This is implicit type casting java automatically convert one data type to another
        System.out.println(a+" "+b);//There the lost of data is not there


        //Narrowing type casting
        double n=10.3;
        int m=(int)n;// This is explicit type casting here we have to tell the java to one data type to another
        System.out.println(n+" "+m); // there the lost of data is there


    }
}
