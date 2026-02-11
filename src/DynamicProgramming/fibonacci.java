package DynamicProgramming;

public class fibonacci {
    static int[] dp;
    public static void main(String[] args) {
        int n =4;
        dp= new int[n+1];
        for(int i =0;i<n+1;i++) dp[i]=-1;
        int f=fibo(4);
        System.out.println(f);
    }
    static int fibo(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        if(dp[n]!=-1) return dp[n];
        int ans=fibo(n-1)+fibo(n-2);
        dp[n]=ans;
        return ans;
    }
}
