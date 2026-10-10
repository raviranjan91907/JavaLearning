package ObjectOrientedProgramming.StreamAPI;

import java.util.*;
/*
parallelStream() is used to process the elements of a collection in parallel, meaning Java can divide the work into multiple parts and process those parts using multiple threads.

stream()	                            parallelStream()
Sequential processing	                Parallel processing
Usually one processing path	            Can use multiple threads
Easier to reason about	                More complex
Order is easier to preserve	            forEach() doesn't guarantee order
Good for many ordinary tasks	        Useful for suitable CPU-intensive tasks

Use parallelStream() when the work is large, independent, and CPU-intensive. Otherwise, prefer a normal stream().

When to use parallelStream()
1)Large amount of data
2)Each element can be processed independently
3)The operation is CPU-intensive
    For example:
    complex mathematical calculations
    image/data processing
    large computations
    CPU-heavy transformations

When NOT to use parallelStream()
1)Small collections
2)When operations depend on each other
    Suppose:
        Task 1 → Task 2 → Task 3 → Task 4
        if Task 2 needs the result of Task 1, parallel processing isn't naturally suitable.
3)When you modify shared variables
    Multiple threads could modify sum at the same time.
4)When order is important
    If you require strict ordering, a sequential stream is often simpler:
For blocking I/O operations

5)Be careful with things like:
    Database calls
    Network requests
    File operations
    External API calls

6)parallelStream() uses Java's common Fork/Join thread pool, which isn't generally something you should use as a general-purpose mechanism for blocking I/O.
 */
public class ParallelStreamLearning {
    public static void main(String agrs[]){
        List<Integer> nums=new ArrayList<>(10000);

        Random ran=new Random();
        for(int i=0;i<10000;i++){
            nums.add(ran.nextInt());
        }

        //Sequence Stream
        long sqStart=System.currentTimeMillis();
        int r1=nums.stream()
                .map(n->n*2)
                .mapToInt(i->i)
                .reduce(0,(c,e)->c+e);

        long sqEnd=System.currentTimeMillis();

        long parStart=System.currentTimeMillis();
        int r2=nums.stream()
                .map(n->n*2)
                .mapToInt(i->i)
                .reduce(0,(c,e)->c+e);

        long parEnd=System.currentTimeMillis();

        System.out.println("Seq "+ (sqEnd-sqStart));
        System.out.println("para "+(parEnd-parStart));


        long sqStart2=System.currentTimeMillis();
        int r3=nums.stream()
                .map(n->{
                    try {
                        Thread.sleep(1);
                    }
                    catch (Exception e){}
                    return n*2;
                })
                .mapToInt(i->i)
                .reduce(0,(c,e)->c+e);

        long sqEnd2=System.currentTimeMillis();

        long parStart2=System.currentTimeMillis();
        int r4=nums.stream()
                .map(n->{
                    try {
                        Thread.sleep(1);
                    }
                    catch (Exception e){}
                    return n*2;
                })
                .mapToInt(i->i)
                .reduce(0,(c,e)->c+e);

        long parEnd2=System.currentTimeMillis();

        System.out.println("Seq "+ (sqEnd2-sqStart2));
        System.out.println("para "+(parEnd2-parStart2));


    }
}
