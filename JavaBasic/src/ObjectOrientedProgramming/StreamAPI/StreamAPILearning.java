package ObjectOrientedProgramming.StreamAPI;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;


/*
Stream API is a way to process a sequence of data using operations like filtering, sorting, mapping, and collecting.
    It is mainly used with collections such as:

    ArrayList
    HashSet
    HashMap
    arrays
    other data sources


    8. Stream has two types of operations

    This is important for understanding Stream API.

    1)Intermediate operations
    These process/transform the Stream and return another Stream.

    Examples:
    filter()
    map()
    sorted()
    distinct()
    limit()

   2)Terminal operations
    These finish the Stream pipeline.
    Examples:
    forEach()
    collect()
    count()
    reduce()
    min()
    max()


Note:
    A Stream needs a terminal operation

Question-> Why do we need a stream
Answer->The Stream version lets you build a pipeline of operations.
    This becomes especially useful when working with collections of objects.
 */
public class StreamAPILearning {
    public static void main(String args[]){
        List<Integer> nums=Arrays.asList(4,5,7,3,2,6);

        //forEach() require a parameter called "Consumer"
        /*
            Consumer is a functional interface
            It represents an operation that:
            Takes one input and returns nothing
         */
        Consumer<Integer> con=n->{
            System.out.println(n);
        };


        nums.forEach(con);

        Stream<Integer> n1=nums.stream();//Here we define a stream which can be use only once like

//        n1.forEach(n-> System.out.println(n)); this statement will throw error because a stream                                                can be used only once

        //For filter() it require a Predicate.
        /*
            A Predicate is a functional interface in Java that is used to test a condition.
            The most important definition to remember is:
            Predicate takes one input and returns true or false.
            It is available in:
            java.util.function.Predicate

            It basic Structure
            @FunctionalInterface
            public interface Predicate<T> {
                boolean test(T t);
            }
         */
        Predicate<Integer> p=n-> n%2==0 ? true:false;

        /*
        filter() is an intermediate operation of the Java Stream API.
        Select elements from a Stream that satisfy a given condition.
        Stream of data
              ↓
           filter()
              ↓
        true  → keep the element
        false → remove the element
         */
        Stream<Integer> n2=n1.filter(p);

        //Let See how stream pip line work of Stream API work
        int result=nums.stream()
                .filter(n->n%2==0)
                .map(n->n*2)
                .reduce(0,(c,e)->c+e);

        System.out.println(result);





    }
}
