package ObjectOrientedProgramming.Casting;


/*
    Down Casting is the process of convert parent class reference back to the child class reference
*/
class A1{
    public void show1(){
        System.out.println("This is A Class");
    }
}

class B1 extends A1{
    public void show2(){
        System.out.println("This is B Class");
    }
}
public class DownCasting {
    public static void main(String args[]){
        A1 obj1=new B1();
        B1 obj2=(B1) obj1;//This is Down casting

        obj1.show1();
        obj2.show2();

    }
}
