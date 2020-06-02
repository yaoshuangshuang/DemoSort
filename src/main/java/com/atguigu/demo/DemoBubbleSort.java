package com.atguigu.demo;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

/*
Test bubblesort
 */
public class DemoBubbleSort {

    @Test
    public static void main(String[] args) {
//        Array[] arrays = new Array[7];
       int [] arrays = {2,2,8,5,123,5,6};
        for (int i = 0; i <7 ; i++) {
            for (int j = 0; j <6 ; j++) {
               int temp = 0;
               if (arrays[j]>arrays[j+1]){
                   //元素交换
                   temp = arrays[j + 1 ];// [j + 1 ]
                   arrays[j + 1] = arrays[j];
                   arrays[j] = temp;
               }
            }
        }
        System.out.println(java.util.Arrays.toString(arrays));
    }
}
