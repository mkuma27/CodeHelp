package InterviewPreparationQuestions;

public class MoveNegativeElementsToBeginning {


    public static int[] moveNegativeElementToBeginning(int[] nums){

        int i=0;
        int j=i+1;
        while(j<nums.length){
            if(nums[i]<0){
                i=i+1;
                j=j+1;

            }

            else if(nums[i]>0 && nums[j]<0){
                swap(nums,i,j);
                i=i+1;
                j=j+1;
            }

            else if(nums[i]>0 && nums[j]>0){
                j=j+1;
            }
        }
        return  nums;

    }

    public static void swap(int[] nums,int i,int j){
        int temp;
        temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public static void main(String[] args){
        int[] nums={-12,11,-13,-5,6,-7,5,-3,-6};
        int[] nums1=moveNegativeElementToBeginning(nums);
        for(int i=0;i<nums1.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
