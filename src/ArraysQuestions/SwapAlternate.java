package ArraysQuestions;

import SortingAlgo.SelectionSort;

public class SwapAlternate {

    public static void main(String[] args){
        int[] evenArr={3,4,6,8,9};
        swapAlternate(evenArr);
    }

    public static void swapAlternate(int[] arr){
        SelectionSort sort=new SelectionSort();
    for(int i=0;i<arr.length;i+=2){
        if(i+1<arr.length){
        sort.swap(arr,i,i+1);
        }
    }

    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
    }
}
