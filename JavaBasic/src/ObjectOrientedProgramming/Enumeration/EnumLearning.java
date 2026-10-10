package ObjectOrientedProgramming.Enumeration;
/*
    Enumeration, commonly called an enum, is a special type used to represent
    a fixed set of constant values

    An enum is used when a variable should have only a predefined set of values
    Note:
    -> Enum provides type safety
    ->Every enum is have is ultimately a special kind of class
 */
enum Status{
    RUNNING,FAILED,PENDING,SUCCESS
}

enum Laptop{
    MACBOOK(2000),XPS(2200),SURFACE,THINKPAD(1500);

    private int price;

    private Laptop(){
        this.price=500;
    }

    private Laptop(int price){
        this.price=price;
    }

    public void setPrice(int price){
        this.price=price;
    }

    public int getPrice(){
        return this.price;
    }
}

public class EnumLearning {
    public static void main(String args[]){

        Status n1=Status.RUNNING;
        System.out.println(n1);

        System.out.println(Status.PENDING.ordinal());//This will print the order number like( RUNNING=0,FAILED=1,PENDING=2,SUCCESS=3)

        Status[] ss=Status.values();
        for(Status s: ss){
            System.out.println(s);
        }

        //Enum with if-else
        if(n1==Status.PENDING){
            System.out.println("Please Wait");
        }
        else if(n1==Status.RUNNING){
            System.out.println("Go on..");
        }
        else if(n1==Status.FAILED){
            System.out.println("Try Again");
        }
        else{
            System.out.println("Done");
        }


        //enum with switch
        n1=Status.FAILED;
        switch(n1){
            case RUNNING -> System.out.println("Going On..");
            case PENDING -> System.out.println("Wait");
            case FAILED -> System.out.println("Please Try again");
            default -> System.out.println("Done");
        }
    }
}
