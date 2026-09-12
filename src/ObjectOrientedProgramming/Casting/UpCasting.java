package ObjectOrientedProgramming.Casting;
/*
    Upcasting is the Concept of Object-Oriented programming where child object is assign the parent
        reference

*/

class A{
    public void show1(){
        System.out.println("This is A Class");
    }
}

class B extends A{
    public void show2(){
        System.out.println("This is B Class");
    }
}
public class UpCasting {
    public static void main(String args[]){
        A obj = new B();//This is called UpCasting where the object is of Child but reference of parent
        obj.show1();
//        obj.show2(); this is give an error obj is object of B but reference of A which don't contain show2()


    }
}
