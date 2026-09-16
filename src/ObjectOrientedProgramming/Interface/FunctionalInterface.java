package ObjectOrientedProgramming.Interface;

/*
    Functional Interface is the Interface which have only one abstract method in it

    The best practice to declare a functional interface by using Annotation @Functional Interface
    because its tell the complier that this is the functional interface and restrict to add more method

 */

@java.lang.FunctionalInterface
interface A1{
    void show();
}

//functional interface with parameter
@java.lang.FunctionalInterface
interface B1{
    void value(int i);
}
@java.lang.FunctionalInterface
interface C1{
    int add(int i,int j);
}


public class FunctionalInterface {
    public static void main(String args[]) {
        A1 obj1 = new A1() {
            public void show() {
                System.out.println("In side main method");
            }
        };
        obj1.show();

        //this is same as above
        A1 obj2 = () -> System.out.println("This Lamda expression");
        obj2.show();

        //functional interface with parameter
        B1 obj3=i-> System.out.println("Value is : "+ i);
        obj3.value(5);

        //Functional Interface with returning value
        C1 obj4=(i,j)-> i+j;// we don't have to use the return statement here
        System.out.println(obj4.add(5,6));
    }
}
