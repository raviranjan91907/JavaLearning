package ObjectOrientedProgramming.AbstractClass;

/*
    An abstract class is a class that provides a common structure for its child
    classes, but may leave some methods incomplete for the child classes to implement

    Imp note:
    -> we can create a reference of abstract but not the object
    -> All the abstract method should be implemented in the child class which extend the abstract class
*/

abstract class Car{
    public abstract void drive();
    public abstract void fly();
    public void music(){
        System.out.println("Playing Music");
    }
}

abstract class WagonaR extends Car{
    public void drive(){
        System.out.println("Car is Driving..");
    }
}

class UpdatedWagonaR extends WagonaR{
    public void fly(){
        System.out.println("Car is Flying..");
    }
}
public class AbstractClass {
    public static void main(String args[]){
        Car obj1=new UpdatedWagonaR();
        obj1.drive();
        obj1.fly();
        obj1.music();
    }
}
