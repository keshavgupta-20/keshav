// to find the lcm
public class Q23 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 10;
        int lcm = (n1 >n2) ? n1 : n2;
        while(true){
            if (lcm %n1 ==0 && lcm %n2 ==0){
                System.out.println("Lcm of entered number " + lcm);
                break;
            }
            lcm++;
        }
    }
}
