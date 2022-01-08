package RecursionDay3;

public class SumOfNumbersUsingRecursion {

    public static int sum(int[] arr,int size,int i){
        int sum=0;
        if(size==0)
            return 0;

        else{
            sum=arr[i]+sum(arr,size-1, i+1);
        }
        return  sum;
    }


    public static void main(String[] args){
        int[] arr={2,4,9,9,9};
        System.out.println(sum(arr,arr.length,0));
    }
}
