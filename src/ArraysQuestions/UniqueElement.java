package ArraysQuestions;

import java.util.HashMap;

public class UniqueElement {

    public static void main(String[] args){
//        int ans=0^2^3^3^4^4^2^1; answer=1
//        System.out.println(ans);
        int[] arr={2,2,3,4,5,1,3,4,1};
        uniqueElement(arr);




    }

    public static void uniqueElement(int arr[]){
        int answer=0;
        for(int i=0;i<arr.length;i++){
            answer=answer^arr[i];
        }
        System.out.println(answer);

    }
}
