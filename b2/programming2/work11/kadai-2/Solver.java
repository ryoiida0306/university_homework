// ナップザック問題を解くプログラム
// import java.util.Scanner;
public class Solver {
    // public static void main(String[] args){
    // Scanner sc = new Scanner(System.in);
    int W,answer;
    int[] w,v;
    public Solver(int n ,int[] w, int [] v, int W)

    int[][] dp = new int[n+1][W+1];//[個数][重さの最大量?],n=0は捨てる
    for(int i = 1; i<=n; i++) {
        for(int k = 0; k<=W; k++) {
            if(k<w[i]) {
                dp[i][k] = dp[i-1][k];
            } else {
                dp[i][k] = Math.max(dp[i-1][k],dp[i-1][k-w[i]]+v[i]);
            }
        }
    }
    // for(int i =0;i<=n;i++){
    //     for(int j = 0;j<=k;j++){
    //         System.out.print(dp[i][j]+" ");
    //         System.out.println("asdfasdf");
    //     }
    //     System.out.println();
    // }
    // }
}
