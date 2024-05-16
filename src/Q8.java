import java.util.Scanner;

class star1{
    void patterns(int n){
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if (i>=j){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
public class Q8 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("What will be the size of pattern");
        int n = sc.nextInt();
        star1 s = new star1();
        s.patterns(n);

    }
}

