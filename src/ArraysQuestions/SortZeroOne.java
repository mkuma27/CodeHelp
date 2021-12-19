package ArraysQuestions;

import SortingAlgo.SelectionSort;

public class SortZeroOne {
    public static void main(String[] args){
        int arr[]={0,1,0,1,0,1,1};
        sortZeroOne(arr);

        for(int k=0;k<arr.length;k++) {
            System.out.print(arr[k]);
        }

    }
    public static  void sortZeroOne(int[] arr){
        SelectionSort sort=new SelectionSort();
        int i=0;
        int j=arr.length-1;

        while(i<=j){
            if(arr[i]==0){
                i=i+1;
            }
            else if(arr[j]==1){
                j=j-1;
            }
            else if(arr[i]==1 && arr[j]==0){
                sort.swap(arr,i,j);
            }
        }
        }
    }

