package SortingAlgo;

public class SelectionSort {

    //Time Complexity of Selection Sort Algorithm is n^2 in worst case and in best case


    public static  void main(String[] args){
        int[] arrEven={8,2,3,10,1};
        for(int i=0;i<arrEven.length;i++){
            System.out.println(arrEven[i]);
        }
        System.out.println("--------------------------------------------------------------------------");

        SelectionSort sort=new SelectionSort();
        sort.selectionSort(arrEven,5);

        for(int i=0;i<arrEven.length;i++){
            System.out.println(arrEven[i]);

        }

    }

    public void selectionSort(int[] arr,int n){
        for(int i=0;i<n-1;i++) {
            int minIndex = i;
            for (int j = i + 1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            swap(arr,i,minIndex);
        }
    }

    public void swap(int[] arr,int i,int minIndex){
        int val;
       val= arr[minIndex];
       arr[minIndex]=arr[i];
       arr[i]=val;
    }
}
