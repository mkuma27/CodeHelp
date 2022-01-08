package ArraysQuestions;

public class Merge2SortedArrays {


    public static void main(String[] args){
        int[] arr1={1,3,5,6,8};
        int[] arr2={2,4,7};
        int[] arr3=merge2SortedArrays(arr1,arr2);
        for(int k=0;k<arr3.length;k++){
            System.out.print(arr3[k]);
        }



    }

    public static int max(int[] arr1,int[] arr2){
        if(arr1.length>arr2.length){
            return arr1.length;

        }
        return arr2.length;
    }

    public static int[] merge2SortedArrays(int[] arr1,int[] arr2){
        int first=0;
        int second=0;

        int[] arr3 =new int[arr1.length+arr2.length];
        int third=0;

        while(first<arr1.length && second<arr2.length ){
            if(arr1[first]<=arr2[second]){
                arr3[third]=arr1[first];
                first++;
                third++;
            }

            else if(arr1[first]>arr2[second]){
                arr3[third]=arr2[second];
                second++;
                third++;
            }
        }


        while(first<arr1.length){
            arr3[third]=arr1[first];
            third++;
            first++;
        }

        while(second<arr2.length){
            arr3[third]=arr2[second];
            third++;
            second++;
        }


return arr3;
    }
}
