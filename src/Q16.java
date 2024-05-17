class circle{
    public int radious;
    public circle(){
        this.radious = 23;
    }

    public int getRadious() {
        return radious;
    }

    public double area(){
        return Math.PI * radious *radious;
    }
}
class cylinder1 extends  circle{
    public int height;
    public cylinder1(){
        this.height = 46;
    }

    public int getHeight() {
        return height;
    }

    public double volume(){
        return Math.PI * this.radious * this.radious * height;
    }

}
public class Q16 {
    public static void main(String[] args) {
        circle c1 = new circle();
        double ans = c1.area();
        System.out.println(ans);
        cylinder1 c2 = new cylinder1();
        System.out.println(c2.volume());
    }
}
