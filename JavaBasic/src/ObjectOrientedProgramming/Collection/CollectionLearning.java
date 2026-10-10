package ObjectOrientedProgramming.Collection;

import java.util.*;

/*
               Iterable
                  |
              Collection
            /     |      \
         List     Set    Queue
          |        |       |
      ArrayList  HashSet  PriorityQueue
      LinkedList TreeSet
 */

public class CollectionLearning {
    public static void main(String args[]){


        Collection n1=new ArrayList();//with this declaration with are not mentioning the type of the Array so if any one enter the n1.add("hello") a String value it will give a runtime exception which is not good in that place we want to a compile time exception
        n1.add(3);
        n1.add(4);
        n1.add(6);
        n1.add(6);
//        n1.add("Hell0"); //This will give runtime exception
        System.out.println(n1);

        //Here we have to use the Object type for iteration
        for(Object i:n1){
            System.out.println(i);
        }


        //here in this declaration we have time specified, but we can't use the method which is included in List Class Like IndexOf(), get()
        Collection<Integer> n2=new ArrayList<Integer>();
        n2.add(3);
        n2.add(4);
        n2.add(6);
        n2.add(6);
//        n2.add("hello") //here this statement will give a compile time error
        System.out.println(n2);


        List<Integer> n3=new ArrayList<Integer>();
        n3.add(3);
        n3.add(4);
        n3.add(6);
        n3.add(8);
        n3.add(6);
        System.out.println(n3.indexOf(4));
        System.out.println(n3.get(3));


        Set<Integer> n4=new HashSet<Integer>();
        n4.add(3);
        n4.add(4);
        n4.add(6);
        n4.add(8);
        n4.add(6);//Duplicate value are not allowed
        System.out.println(n4);
    }
}
