package BinarySearch;

class BinarySearchBasics{

    public static void main(String[] args){

        int[] even={2,6,8,10,20,27};
        int[] odd={5,8,14,23,56};

        int index=binarySearch(even,5,10);
        System.out.println(index);
    }

    public static int binarySearch(int[] arr,int size,int key){

        int start=0;
        int end=size-1;

        int mid=(start+end)/2;

        while(start<=end){

            if(key==arr[mid]){
                return mid;
            }

            else if(key>arr[mid]){
                start=mid+1;

            }
            else{
                end=mid-1;
            }
            mid=(start+end)/2;
        }

        return -1;
    }
}


//Time complexity of Binary Search is logn.Either the array is in Descending Order or Ascending Order then only Binary Search can be applied.

