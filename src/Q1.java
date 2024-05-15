import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        int sum =0;
        for (int i=1; i<=5; i++){
            System.out.println("The marks of subject "+ i);
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("Total marks:-" + sum + " out of 500");
        System.out.println("Percentage:-" + sum/5);



    }
}
