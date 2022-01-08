package ArraysQuestions;

import SortingAlgo.SelectionSort;

public class ReverseAnArray {

    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        reverseAnArray(arr,3);
        for(int k=0;k<arr.length;k++) {
            System.out.print(arr[k]);
        }


    }

    public static  void reverseAnArray(int[] arr,int m){
        SelectionSort sort=new SelectionSort();
        int start=m+1;
        int end= arr.length-1;

        while(start<end){
            sort.swap(arr,start,end);
            start=start+1;
            end=end-1;


        }

    }
}
