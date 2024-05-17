class cylinder{
    private  int height;
    private int radious;
    public cylinder(){
        this.height = 4;
        this.radious = 5;
    }
    public cylinder(int radious, int height){
        this.height = height;
        this.radious = radious;
    }



    public int getRadious() {
        return radious;
    }
    public int getHeight() {
        return height;
    }
    public int surface(){
        return (int) ((2 *Math.PI * radious * height) + (2 * Math.PI * radious*radious));
    }
    public int volume(){
        return (int) Math.PI * radious * radious * height;
    }
}
public class Q15 {
    public static void main(String[] args) {
        cylinder c1 = new cylinder();


        System.out.println(c1.getHeight());
        System.out.println(c1.getRadious());
        System.out.println(c1.volume());
        System.out.println(c1.surface());
    }

}
