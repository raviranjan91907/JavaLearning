package ObjectOrientedProgramming.Collection;

import java.util.*;
/*
Comparable is an interface used when a class wants to define its own natural/default sorting order.
 */
class Student implements Comparable<Student>{
    int age;
    String name;
    public Student(int age,String name){
        this.age=age;
        this.name=name;
    }

//Using CompareTo method to defining our on logic to sort the collection of student list like sorting based of there age
    @Override
    public int compareTo(Student o2) {
        if(this.age>o2.age) return 1;
        else return -1;
    }
}
public class SortingInCollections {
    public static void main(String args[]){
        List<Integer> l=new ArrayList<>();
        l.add(12);
        l.add(2);
        l.add(1);
        l.add(42);
        l.add(23);
        Collections.sort(l);
        System.out.println(l);

        /*
        Comparator is also an interface used for sorting.
        But the important difference is:
        Comparator allows you to define the sorting logic separately from the class.
        Using comparator for defining our one sorting logic
        Like sorting the number based on their one's place digit
         */

        Comparator com= new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1%10>o2%10) return 1;
                else return -1;
            }
        };

        Collections.sort(l,com);
        System.out.println(l);


        List<Student> sdt=new ArrayList<>();
        sdt.add(new Student(12,"a"));
        sdt.add(new Student(14,"b"));
        sdt.add(new Student(20,"c"));
        sdt.add(new Student(17,"d"));

        Collections.sort(sdt);

        for(Student s:sdt){
            System.out.print(s.age+" ");
        }
        System.out.println();


        /*
        Note
        Most important difference

        Comparable
        class Student implements Comparable<Student>
        means: Student itself decides how Student objects should normally be sorted.
        And we write:
        public int compareTo(Student s).

        Comparator.
        Comparator<Student> com
        means:
        Someone outside the Student class decides how Student objects should be sorted.
        And we write:
        public int compare(Student s1, Student s2)
         */
        //Comparator is also a Functional Interface therefore we can define a lamba funcation using it
        Comparator<Integer> com1=(i,j)-> i%10>j%10 ? 1:-1;
        Collections.sort(l,com1);
        System.out.println(l);
    }
}
