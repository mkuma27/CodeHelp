package ArraysQuestions;

import SortingAlgo.SelectionSort;

public class SortZeroOneTwo {

    public static void main(String[] args){
        int arr[]={0,2,1,1,2,1};
        sortZeroOneTwo(arr);

        for(int k=0;k<arr.length;k++) {
            System.out.print(arr[k]);
        }

    }
    public static void sortZeroOneTwo(int[] arr){
        SelectionSort sort=new SelectionSort();
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]==0){
                i=i+1;
            }
            else if(arr[j]==2){
                j=j-1;
            }
            else if(arr[i]==2 && arr[j]==1){
                sort.swap(arr,i,j);

                j=j-1;
            }
            else if(arr[i]==1 && arr[j]==0){
                sort.swap(arr,i,j);
                i=i+1;
                j=j-1;

            }
        }
    }


}
