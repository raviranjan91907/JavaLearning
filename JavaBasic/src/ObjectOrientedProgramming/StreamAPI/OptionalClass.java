package ObjectOrientedProgramming.StreamAPI;

import java.util.*;

public class OptionalClass{
    public static void main(String args[]){
        List<String> names=Arrays.asList("Laxmi","John","Kishor");

        //Optional Class is Used to handle NullPointerException
        Optional<String> name=names.stream()
                .filter(str->str.contains("x"))
                .findFirst();// But it does not return a String directly. This will give an optional class in return that we have use Option<String>

        System.out.println(name.get());/*
        get() extracts the value stored inside the Optional.
        Optional<String> name
                ↓
           ┌───────────┐
           │  "Laxmi"  │
           └───────────┘
                ↓
              get()
                ↓
            "Laxmi"
        */

        //The above statement can also be written in this formant
        String name2=names.stream()
                .filter(str->str.contains("x"))
                .findFirst()
                .orElse("Not Found any name");

        System.out.println(name2);
    }
}
