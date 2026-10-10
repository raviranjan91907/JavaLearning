package ObjectOrientedProgramming.MethodOverriding;

class Parent{
    public void show(){
        System.out.println("This is Parent Class");
    }
    public void config(){
        System.out.println("This is Config Parent");
    }
}
class Child extends Parent {
    public void show(){ //This method override the show() method of the parent class
        System.out.println("This is Child Class");
    }


}
public class MethodOverriding {
    public static void main(String args[]){
        Child obj1=new Child();
        obj1.show();//This will print the show method of the child class because child class override the parent class
        obj1.config();
    }
}
