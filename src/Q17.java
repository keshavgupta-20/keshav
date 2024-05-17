class Rectangle1{
    public int length;
    public int breadth;
    public Rectangle1(){
        this.length = 2;
        this.breadth = 4;
    }

    public int getBreadth() {
        return breadth;
    }

    public int getLength() {
        return length;
    }
    public double Area(){
        return length * breadth;
    }
}
class cuboid extends  Rectangle1{
    public int height;
    public cuboid(){
        this.height = 6;
    }

    public int getHeight() {
        return height;
    }
    public double Area(){
        return  length * breadth * height;
    }
}
public class Q17 {
    public static void main(String[] args) {
        Rectangle1 r1 = new Rectangle1();
        System.out.println( r1.Area());
        cuboid c1 = new cuboid();
        System.out.println(c1.Area());


    }
}
