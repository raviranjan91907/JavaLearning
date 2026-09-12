package ObjectOrientedProgramming.ObjectClass;

/*
    Object class is the topmost superclass in java's class hierarchy providing common functionality
    that all java object can use
*/

import java.util.Objects;

class Laptop{
    String model;
    int price;

    public String toString(){
        return model+" "+price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return price == laptop.price && Objects.equals(model, laptop.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, price);
    }
}
/*
the above class dafination is same as the class below
class Laptop extends object{}
*/
public class ObjectClass {
    public static void main(){
        Laptop obj1=new Laptop();
        obj1.model="Lanovo";
        obj1.price=100000;

        Laptop obj2=new Laptop();
        obj2.model="Lanovo";
        obj2.price=100000;

        System.out.println(obj1.equals(obj2));
    }
}
