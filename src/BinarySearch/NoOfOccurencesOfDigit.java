package BinarySearch;

public class NoOfOccurencesOfDigit {


    public static void main(String[] args){
        int[] even={2,2,2,2,2,27};
        System.out.println(leftMostOccurrences(even,6,2));
        System.out.println(RightMostOccurrences(even,6,2));

       int left= leftMostOccurrences(even,6,2);
        int right=RightMostOccurrences(even,6,2);

        int noOfTimes=(right-left)+1;
        System.out.println(noOfTimes);
    }
    public static int RightMostOccurrences(int[] arr,int size,int key){

        int start=0;
        int end=size-1;
        int ans=-1;

        int mid=(start+end)/2;

        while(start<=end){
            if(key==arr[mid]){
                ans=mid;
                start=mid+1;
            }
            else if(key>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

            mid=(start+end)/2;
        }
        return ans;

    }

    public static int leftMostOccurrences(int[] arr,int size,int key){

        int start=0;
        int end=size-1;
        int ans=-1;

        int mid=(start+end)/2;

        while(start<=end){
            if(key==arr[mid]){
                ans=mid;
                end=mid-1;
            }
            else if(key>arr[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

             mid=(start+end)/2;
        }
        return ans;

    }
}
