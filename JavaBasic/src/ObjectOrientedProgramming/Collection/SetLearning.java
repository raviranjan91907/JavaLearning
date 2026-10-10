package ObjectOrientedProgramming.Collection;

import java.util.*;

/*
    Set is an interface in the Java Collection Framework used to store a group of elements where duplicate elements are not allowed.

    List → allows duplicates
    Set  → does NOT allow duplicates

    Important Points
    1) No index: Unlike List, a Set doesn't have positions like 0, 1, 2. This is because Set is not index-based.
    2)Ordering depends on implementation: There are three commonly used Set implementations:
        HashSet
        LinkedHashSet
        TreeSet
    3)  Set	            Order
        HashSet	        No guaranteed order
        LinkedHashSet	Insertion order
        TreeSet	        Sorted order

Common Set Methods
    add(element)
    remove(element)
    contains(element)
    size()
    isEmpty()
    clear()
    addAll(collection)
    removeAll(collection)
    retainAll(collection)
    containsAll(collection)


The main classes that implement the Set interface in Java are:
    Set
     ├── HashSet
     │    └── LinkedHashSet
     │
     └── SortedSet
          └── NavigableSet
               └── TreeSet
 */
public class SetLearning {
    public static void main(String args[]){
        /*
        hashSet: HashSet is a class that implements the Set interface.
        Does not guarantee insertion order
        Allows one null element
        Uses hashing internally
        HashSet → Unique elements + No guaranteed order
         */

        Set<Integer> h=new HashSet<>();
        h.add(1);
        h.add(2);
        h.add(23);
        h.add(3);
        System.out.println(h);


        /*
        LinkedHashSet:LinkedHashSet is a class that extends HashSet.
        HashSet
           │
           └── LinkedHashSet.
        It has the uniqueness behavior of HashSet, but additionally maintains insertion order.

         */

        LinkedHashSet<Integer> lh=new LinkedHashSet<>();
        lh.add(10);
        lh.add(34);
        lh.add(23);
        lh.add(58);
        System.out.println(lh);


        /*
        SortedSet.
        SortedSet is not a class.
        Set
         │
         └── SortedSet
               │
               └── NavigableSet
                     │
                     └── TreeSet
        Its purpose is to represent a Set whose elements are maintained in sorted order.
        It is an interface that extends Set.
        SortedSet itself doesn't provide the implementation.TreeSet is the common implementation.
         */

        /*
        NavigableSet: NavigableSet is also an interface.
        SortedSet
               │
               └── NavigableSet
                     │
                     └── TreeSet
         It provides methods that allow you to navigate through sorted elements
         */

        NavigableSet<Integer> nt = new TreeSet<>();

        nt.add(10);
        nt.add(20);
        nt.add(30);
        nt.add(40);
        System.out.println(nt);
    }
}
