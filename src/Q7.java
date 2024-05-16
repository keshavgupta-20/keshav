import java.util.Scanner;

class star{
    void pattern(int n){
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (i<=j){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
public class Q7 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("What will be the size of pattern");
        int n = sc.nextInt();
        star s = new star();
        s.pattern(n);

    }
}
