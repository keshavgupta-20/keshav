// to print star formation
public class Q24 {
    public static void main(String[] args) {
        System.out.println("Maximum star tou want");
        int n = 5;
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
