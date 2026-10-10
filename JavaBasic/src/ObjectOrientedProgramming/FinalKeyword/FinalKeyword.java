package ObjectOrientedProgramming.FinalKeyword;


/*
    Final keyword :- Final keyword is used to restrict or prevent changes
    it is used with
    final variable-> value can't be changed
    final method -> method can't be overriden
    final class -> class can't be inherited
*/

final class A{
    public void show(){
        System.out.println("This is class A with final");
    }
}

class B{
    final public void show(){
        System.out.println("This is final Method with class B");
    }
}

class C extends B{
//    public void show(){} This will throw an error because in parent class B the method show is private

}

//class D extends A{} This will throw and error because class A is final
public class FinalKeyword {
    public static void main(String args[]){
        final int num1=1;
        //num1=3 this will give an error

        System.out.println(num1);
    }
}
