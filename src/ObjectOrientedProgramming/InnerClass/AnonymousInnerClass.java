package ObjectOrientedProgramming.InnerClass;


class Car{
    public void show(){
        System.out.println("This is OuterClass Car");
    }
}

abstract class Phone{
    public abstract void show();
}

public class AnonymousInnerClass {
    public static void main(String args[]){

        Car obj1=new Car(){
            public void show(){
                System.out.println("This is Anonymous InnerClass");
            }
        };
        obj1.show();


        Phone obj2=new Phone(){
            public void show(){
                System.out.println("This is the implementation of Abstract Anonymous class");
            }
        };
        obj2.show();
    }
}
