package com.atguigu.demo;

import org.junit.Test;

/*
test quicksort
 */
public class DemoQuickSort {
    //The complexity of quick sort in the average case is Θ(n log(n)) and in the worst case is Θ(n2).
    private int array[];
    private int length;
    public void sort(int[] inputArr){

        if (inputArr == null || inputArr.length == 0 ){
            return;
        }
        this.array = inputArr;
        length = inputArr.length;
        // length - 1 ?
        quickSort(0, length - 1);
    }
private void quickSort(int lowerIndex,int higherIndex){
    int i = lowerIndex;
    int j = higherIndex;
    //calculate pivot number,as middle index number
    int pivot = array[lowerIndex + (higherIndex - lowerIndex) / 2];
    //divide into two arrays
    while (i <= j) {
        /**
         * In each iteration, we will identify a number from left side which
         * is greater then the pivot value, and also we will identify a number
         * from right side which is less then the pivot value. Once the search
         * is done, then we exchange both numbers.
         */
        //little by little towards middle
        while (array[i] < pivot) {
            i++;
        }
        while (array[j] > pivot) {
            j--;
        }
        if (i <= j) {
            exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        //call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);

    }
    //todo
    private void exchangeNumbers(int i, int j){
       int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    // you need set [] as method param
    public static void main(String a[] ){
        DemoQuickSort sorter = new DemoQuickSort();
        int[] input = {13, 314, 55, 2, 55, 11};
        sorter.sort(input);
        for (int i : input) {
            System.out.print(i);
            System.out.print(" ");
        }

    }
}

//
//    @Test
//    public static void main(String[] args) {
////        Array[] arrays = new Array[7];
//        int[] arrays = {1, 2, 98, 5, 123, 5, 46};


