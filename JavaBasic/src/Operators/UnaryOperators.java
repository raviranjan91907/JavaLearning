package Operators;

public class UnaryOperators {
    public static void main(String[] args){
        /*
            Unary Operator are the which use one operant
            Operator	Meaning
                +	    Positive
                -	    Negative
                ++	    Increment by 1
                --	    Decrement by 1
                !	    Logical NOT
         */
        int a=+1;
        int b=-5;

        int c=++a; //this is called preincrement in which frist 'a' is incremented by 1 and then assign to c
        System.out.println("Value of c "+c);
        System.out.println("Value of a "+a);

        int d=a++; // this is call postincrement in which the value of 'a' is assign to d and the value of 'a' is incremented
        System.out.println("Value of c "+c);
        System.out.println("Value of a "+a);

        int e=--a;
        int f=a--;

        boolean g=true;
        boolean h=!g; // it will reverse a boolean value



    }
}
