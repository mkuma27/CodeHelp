package RecursionDay1;

public class PowerOf2 {

    public static int power(int n){
        if(n==0){
            return 1;
        }
        return 2*power(n-1);

    }


    public static void main(String[] args){

        int answer=power(3);
        System.out.println(answer);
    }
}
