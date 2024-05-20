public class Q25 {
    public static void main(String[] args) {
        int lucky_no = 1623;
        int sum = 0;
        String num = Integer.toString(lucky_no);

        for (int i = 1; i < num.length(); i += 2) {
            if (i % 2 == 0) {  // Check for even index
                int digit = Character.getNumericValue(num.charAt(i));
                sum += digit * digit;  // Add the square of the digit
            }
        }

        if (sum % 9 == 0) {
            System.out.println("Lucky man");
        } else {
            System.out.println("Poor man");
        }
    }
}
