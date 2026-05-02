package FuntionalProgramming.MethodReferences;

import java.util.List;
import java.util.function.Predicate;

public class MethodReferences {
    public static long countMatchingString(List<String> input, Predicate<String> condition){
        return input.stream().filter(condition).count();
    }

    public static void main(String[] args){
        List<String> input=List.of("hell","\t","world","","\t"," ","goodbye","  ");

        long numberOfWhitespaceStrings=countMatchingString(input,String::isBlank);
        //String::isBlank->is Lambda Expression
        System.out.println(numberOfWhitespaceStrings+ " whitespace strings");

    }
}
