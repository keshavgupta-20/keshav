class Rectangle {
    int length;
    int bresath;

    // Method to set the side length and calculate area and perimeter
    void setS(int length) {
        this.length = length;
    }
    void setBresath(int bresath){
        this.bresath = bresath;
    }


    // Method to calculate and print the area
    public int area() {
        return length * bresath;
    }

    // Method to calculate and print the perimeter
    public int perimeter() {
        return 2 *(length  + bresath);
    }
}

public class Q14 {
    public static void main(String[] args) {
        Rectangle s1 = new Rectangle();
        s1.length = 21;
        s1.bresath = 45;
        System.out.println(s1.area());
        System.out.println(s1.perimeter());


    }
}
