// フィボナッチ数列を求めるプログラム（再帰法版）
public class FiboRec {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        // for(int i = 1;i<=Integer.parseInt(args[0]);i++){
        //     System.out.println("Fib("+i+")="+Fib(i));

        // }
        System.out.println(Fib(Integer.parseInt(args[0])));
        System.out.println("実行時間:"+(System.nanoTime()-startTime));
    }

    public static long Fib(int n) {
        if(n == 1||n == 2) {
            return 1;
        }
        return Fib(n-1)+Fib(n-2);


    }
}
