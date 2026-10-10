package ObjectOrientedProgramming.MethodOverLoading;

/*Method OverLoading happens when one or more method having same name in exact same class but
  differ by there parameters*/
class Calculator{


    public int add(int n1,int n2){
        return n1+n2;
    }

    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
}
public class MethodOverloading {
    public static void main(String args[]){
        Calculator obj1=new Calculator();
        System.out.println(obj1.add(23,43));
        System.out.println(obj1.add(234,223,12));
    }
}
