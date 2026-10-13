package com.Junit.Learning;

import java.util.*;
public class SortingOfArray {
    public int[] sortArray(int[] array){
        for(int i=0;i<1000000;i++){
            Arrays.sort(array);
        }
        return array;
    }

    public void show(){
        System.out.println("hii");
    }
}
