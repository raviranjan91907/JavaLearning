import FuntionalProgramming.FunctionalInterface.BinaryOperation;
class demo{
    void show(){
        Runnable r = () -> System.out.println(this.getClass());
        r.run();
    }
        }

class Main{
    public static void main(String[] args){
        BinaryOperation<Integer> add=(a,b)->a+b;
        System.out.println(add.apply(2,3));

    }
}