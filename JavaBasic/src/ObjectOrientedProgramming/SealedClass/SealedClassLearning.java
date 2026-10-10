package ObjectOrientedProgramming.SealedClass;

/*
A sealed class in Java is a class that restricts which classes can extend it. The permitted subclasses are specified using the permits keyword. A permitted subclass must be final, sealed, or non-sealed.
 */
sealed class A extends Thread permits B,C{

}

//class C extends A{} The class which allowed to inherit sealed class should be sealed class, non-sealed class or final class

final class C extends A{

}

non-sealed class B extends A{

}

//final class D extends A{} this statement will give an error because D is not allowed to inherit A

class D extends B{

}

sealed interface X1 permits X2{

}

//interface X2 extends{} the interface which extends sealed interface should be sealed or non-sealed

//non-sealed interface X2 implements X1{} For an interface, you should use extend not implements

non-sealed interface X2 extends X1{

}

public class SealedClassLearning {
    public static void main(String args[]){

    }
}
