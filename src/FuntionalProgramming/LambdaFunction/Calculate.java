package FuntionalProgramming.LambdaFunction;

public class Calculate {
    public static void main(String[] args){
        if(args.length!=3){
            System.out.println("Usage: Calculate [int] [operator] [int]");
            return;
        }

        for(String arg : args){
            System.out.println(arg);
        }
        System.out.println("Length: " + args.length);

        Calculator calculator=new Calculator();
        calculator.registerOperation("+",(a,b)->a+b);
        calculator.registerOperation("-",(a,b)->a-b);
        calculator.registerOperation("/",(a,b)->a/b);
        calculator.registerOperation("*",(a,b)->a*b);

        int a=Integer.parseInt(args[0]);
        String operation=args[1];
        int b=Integer.parseInt(args[2]);

        System.out.println(calculator.calculate(a,operation,b));
    }
}
