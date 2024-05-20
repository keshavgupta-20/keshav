class Rectangle {
    public float length;
    public float width;
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }



        public void setLength(float length) {
            this.length = length;
        }
        public float getwidth() {
            return width;
        }
        public void setwidth(float width) {
            this.width = width;
        }



        public float getLength() {
            return length;
        }
        public double calculateArea(){
            return  length *width;
        }
        public double calculatePerimeter(){
            return 2 * (length + width);
        }
        //Implement your code here
    }
    class Tester {

        public static void main(String args[]) {

            Rectangle rectangle=new Rectangle(4,5);
            rectangle.setLength(2);
            rectangle.setwidth(3);

            //Assign values to the member variables of Rectangle class

            //Invoke the methods of the Rectangle class to calculate the area and perimeter

            //Display the area and perimeter using the lines given below
            System.out.println("Area of the rectangle is " + rectangle.calculateArea());

            System.out.println("Perimeter of the rectangle is " +  rectangle.calculatePerimeter());
        }

    }