package ObjectOrientedProgramming.Collection;

import java.util.ArrayList;
import java.util.List;

/*
In Java, List is an interface in the Collection Framework that is used to store a group of objects in an ordered sequence.

A List has these important properties:

Ordered → Elements maintain the order in which you add them.
Allows duplicates → You can store the same value multiple times.
Allows index-based access → Each element has an index starting from 0.
Can contain null → Most List implementations allow null.
List is an interface → You normally create an object of a class that implements it.


The most important implementations are:

             List
              |
       ----------------
       |              |
  ArrayList       LinkedList



For your Java Collections notes, remember this:
  Collection Framework
       |
   Collection
       |
      List
       |
   ----------------
   |              |
ArrayList      LinkedList



These are the main methods specifically associated with List:

    Method	                                            Purpose
    add(E e)	                                        Adds an element
    add(int index, E element)	                        Adds an element at a specific index
    addAll(Collection<? extends E> c)	                Adds all elements from another collection
    addAll(int index, Collection<? extends E> c)	    Adds all elements at a specific index
    get(int index)	                                    Gets an element at an index
    set(int index, E element)	                        Replaces an element
    remove(int index)	                                Removes an element at an index
    remove(Object o)	                                Removes a matching element
    removeAll(Collection<?> c)	                        Removes all matching elements
    retainAll(Collection<?> c)	                        Keeps only matching elements
    clear()	                                            Removes everything
    size()	                                            Returns number of elements
    isEmpty()	                                        Checks whether the list is empty
    contains(Object o)	                                Checks whether an element exists
    containsAll(Collection<?> c)	                    Checks whether all elements exist
    indexOf(Object o)	                                Returns first matching index
    lastIndexOf(Object o)	                            Returns last matching index
    subList(int fromIndex, int toIndex)	                Returns a portion of the list
    toArray()	                                        Converts list to an array
    toArray(T[] a)	                                    Converts list to a typed array
    iterator()	                                        Returns an iterator
    listIterator()	                                    Returns a list iterator
    listIterator(int index)	                            Returns iterator starting at an index
    sort(Comparator<? super E> c)	                    Sorts the list
    replaceAll(UnaryOperator<E> operator)	            Replaces each element using a function
    removeIf(Predicate<? super E> filter)	            Removes elements matching a condition
    spliterator()	                                    Returns a spliterator
    stream()	                                        Creates a sequential stream
    parallelStream()	                                Creates a parallel stream
    equals(Object o)	                                Compares lists
    hashCode()	                                        Returns hash code
 */
public class ListLearning {
    public static void main(String args[]){
        List<Integer> nums=new ArrayList<Integer>();
        nums.add(3);
        nums.add(4);
        nums.add(6);
        nums.add(8);
        nums.add(6);
        System.out.println(nums.indexOf(4));
        System.out.println(nums.get(3));

        System.out.println(nums);
        nums.set(0, 1213);
        System.out.println(nums);
    }
}
