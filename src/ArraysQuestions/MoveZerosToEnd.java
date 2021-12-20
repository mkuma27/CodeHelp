package ArraysQuestions;

/*
https://leetcode.com/problems/move-zeroes/
 */

import SortingAlgo.SelectionSort;

public class MoveZerosToEnd {
    public static void main(String[] args){
        int[] arr={0,1,0,3,12};
        moveZerosToEnd(arr);
        for(int k=0;k<arr.length;k++) {
            System.out.print(arr[k]);
        }


    }
    public static void moveZerosToEnd(int[] arr){
        SelectionSort sort=new SelectionSort();
        int i=0;
        int j=1;

        while(j<arr.length){
            if(arr[j]==0){
                j=j+1;
            }
            else{
                sort.swap(arr,i,j);
                i=i+1;
                j=j+1;

            }
        }


    }
}
