package ArraysQuestions;

/*
https://leetcode.com/problems/unique-number-of-occurrences/
 */

import java.util.*;

public class UniqueElementLeetCode {

    public static void main(String[] args){
        int[] arr={1,2,2,1,1,3};
        uniqueElement(arr);





    }

    public static  boolean uniqueElement(int[] arr){
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hashMap.put(arr[i],hashMap.getOrDefault(arr[i],0)+1);
        }
        System.out.println(hashMap);

        HashSet<Integer> hashSet=new HashSet<>(hashMap.values());
        if(hashSet.size()==hashMap.size()){
            return true;
        }
return false;

    }
}
