import java.util.Scanner;

//
class multiplication{
    void multiply(int n){
        for (int i=1; i<11; i++){
            System.out.println(i +"x" + n + "=" + i*n);
        }
    }
}
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Write a no");
        multiplication m1 = new multiplication();
        m1.multiply(n);

    }
}
