import java.util.Scanner;

public class Q9 {
    public static int sum(int n){
        if (n==0){
            return n=0;
        }
        else{
            return n + sum(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Write a number to find the sum");
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n));

    }
}
