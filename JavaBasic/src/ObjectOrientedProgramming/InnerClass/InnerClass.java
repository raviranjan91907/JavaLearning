package ObjectOrientedProgramming.InnerClass;

class A{
    int n=4;
    public void show1(){
        System.out.println("This is outerClas A");
    }

    class B{
        int m=10/n;
        public void show2(){
            System.out.println("This is InnerClass B");
        }
    }

    static class C{
        int j=10;
        public void show3(){
            System.out.println("This is InnerClass C");
        }
    }
}
public class InnerClass {
    public static void main(String args[]){
        A outerObj1=new A();
        outerObj1.show1();

        A.B innerObj1=outerObj1.new B();//for reference we have to specify the out class with "." and for object we require object of outerClass
        innerObj1.show2();

        A.C innerObj2=new A.C();//this is the syntax of creating a object of static InnerClass
        innerObj2.show3();
    }
}
