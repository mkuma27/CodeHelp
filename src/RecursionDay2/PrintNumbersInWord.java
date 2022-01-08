package RecursionDay2;

public class PrintNumbersInWord {

    public static void print(int n,String[] arr){
        if(n==0){
            return;
        }
        int digit=n%10;
        print(n/10,arr);
        System.out.print(arr[digit]);

    }

    public static void main(String[] args){

        String[] arr={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
        print(423,arr);

    }
}
