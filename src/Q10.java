public class Q10 {
    public static int fibonnci(int n){
        if (n==0 || n==1){
            return n;
        }
        else {
            return fibonnci(n-1) + fibonnci(n-2);
        }
    }

    public static void main(String[] args) {
        int s = 8;
        int result  = fibonnci(s);
        for (int i = 0; i < s; i++) {
            System.out.print(fibonnci(i) + " ");
        }
    }
}
