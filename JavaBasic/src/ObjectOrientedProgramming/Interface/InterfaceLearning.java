package ObjectOrientedProgramming.Interface;

/*
    Interface: An interface in java is a blueprint that defines a set of method and constants that a class must follow
    ->In Interface the method are abstract and public so there is no need to specify explicitly
    ->A class can implement multiple Interface
    ->for Implementing an Interface "implement" keyword should be used
    ->A Interface can also implement Interface, but we have to use "extends" keyword to do this
    ->Variable declare in an interface are automatically public static final
    ->Interface does not create any memory space in heap
 */

interface A{
    int a=10;
    String str="hello";

    void show();
    void display();
}

interface B{
    void run();
}

interface Y extends B{
    void fly();
}

class C implements A,Y{
    public void show(){
        System.out.println("This is implementing class C show() method");
    }

    public void display(){
        System.out.println("This is implementing class C display() method");
    }

    public void run(){
        System.out.println("This is implementing class C run() method");
    }

    public void fly(){
        System.out.println("This is implementing class C fly() method");
    }
}

interface Computer{
    void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("doing coding, editing.. Laptop");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("doing coding, editing.. Desktop");
    }
}

class Developer{
    public void devApp(Computer obj){
        obj.code();
    }
}
public class InterfaceLearning {
    public static void main(String args[]){
        A obj1=new C();
        obj1.display();
        obj1.show();
//        obj1.run(); //this will give error because in interface A fly() method is not there

        B obj2=new C();
        obj2.run();
//        obj2.show(); this will give an error because in interface B show() and display() is not there

        C obj3=new C();
        obj3.display();
        obj3.fly();
        obj3.run();
        obj3.show();


        Computer lap=new Laptop();
        Computer dek=new Desktop();

        Developer obj4=new Developer();
        obj4.devApp(lap);
        obj4.devApp(dek);
    }
}
