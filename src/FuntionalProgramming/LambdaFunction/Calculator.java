package FuntionalProgramming.LambdaFunction;

import FuntionalProgramming.FunctionalInterface.BinaryOperation;
import java.util.*;

public class Calculator {
    private final Map<String, BinaryOperation<Integer>> operators = new HashMap<>();

    public void registerOperation(String symbol,BinaryOperation<Integer> operator){
        operators.put(symbol.strip(),operator);
    }

    public int calculate(int a,String operator,int b){
        return operators.get(operator).apply(a,b);
    }
}