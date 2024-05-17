import java.util.Locale;

public class Q4 {
    public static void main(String[] args) {
        String rat = "KESHav";
        System.out.println(rat.toLowerCase());
        String b = "I am going out with friend i wish";
        String c = b.replace(" ", "");
        System.out.println(c);
        // program to detect double and triple space
        String d = " I wish my father will buy a scooty for me";

        if (d.contains("  ") || d.contains("   ")){
            System.out.println("Yes");
        }
        else{
            System.out.println("False");
        }
        //


    }
}
