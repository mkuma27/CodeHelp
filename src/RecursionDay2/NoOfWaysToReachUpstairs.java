package RecursionDay2;

public class NoOfWaysToReachUpstairs {

    public static int reachStairs(int nStairs){
        if(nStairs<0){
            return 0;

        }

        if(nStairs==0){
            return 1;
        }

        int numberOfWaysToReach=reachStairs(nStairs-1)+reachStairs(nStairs-2);
        return  numberOfWaysToReach;

    }

    public static void main(String[] args){
       int answer= reachStairs(5);
        System.out.println(answer);
    }
}
