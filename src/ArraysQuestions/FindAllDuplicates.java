package ArraysQuestions;

/*

 */

public class FindAllDuplicates {

    public static void main(String[] args){
        findAllDuplicates(new int[] {4,3,2,7,8,2,3,1});


    }

    public static void findAllDuplicates(int[] arr){
        int answer=0;
        for(int i=0;i<arr.length;i++){
            answer=answer^arr[i];

        }
        System.out.println(answer);

    }
}
