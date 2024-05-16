class Square {
    int side;

    // Method to set the side length and calculate area and perimeter
    void setSide(int side) {
        this.side = side;
        area(); // Call area method
        perimeter(); // Call perimeter method
    }

    // Method to calculate and print the area
    public void area() {
        System.out.println("Area: " + side * side);
    }

    // Method to calculate and print the perimeter
    public void perimeter() {
        System.out.println("Perimeter: " + 4 * side);
    }
}

public class Q13 {
    public static void main(String[] args) {
        Square s1 = new Square();
        s1.setSide(23); // Setting the side length and calculating area and perimeter
    }
}
