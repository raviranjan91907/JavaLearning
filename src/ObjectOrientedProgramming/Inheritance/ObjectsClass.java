package ObjectOrientedProgramming.Inheritance;

public class ObjectsClass {
    public static void main(String args[]){
        AdvanceCalculator obj1=new AdvanceCalculator();
        int r1=obj1.add(1,2);
        int r2=obj1.subtract(23,32);
        int r3=obj1.multiplication(23,3);
        int r4=obj1.division(112,3);
        System.out.println(r1+" "+r2+" "+r3+" "+r4);
    }
}
