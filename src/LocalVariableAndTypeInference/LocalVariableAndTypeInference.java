package LocalVariableAndTypeInference;


/*
    Local Variable Type Inference means Java can automatically determine the data type of a local variable from the value assigned to it.

    Why is it called "local variable" type inference?

    Because var can be used only for local variables, such as variables declared inside:
    methods
    constructors
    blocks
    loops

    var cannot be used for fields
    This is invalid:
    class Student {
        var age = 20;
    }
 */

import java.util.ArrayList;

class Student {

    int age = 20;
}
public class LocalVariableAndTypeInference {
    public static void main(String args[]){
        int age = 25;//age    → int
        String name = "Ravi";//name   → String
        double salary = 50000.50;// salary → double


        var age2 = 25;//age    → int
        var name2= "Ravi";//name   → String
        var salary2 = 50000.50;// salary → double

        int a;
//        var a1; this will give an error


        //You can also use var with objects:
        var student = new Student();

        var names = new ArrayList<String>();

        var arr=new int[10];

//        You can use var in loops too:
        for (var i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}
