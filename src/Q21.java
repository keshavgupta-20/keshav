interface camera{
    void snapcamera();
    void video();
}
interface wifi{
    void connect();
    void availablenetwork();
}
class phone{
    public void number(int number){
        System.out.println("number: " + number);
    }
    public void pickcall(){
        System.out.println("connecting.." );
    }
}
class Mysmarphone extends phone implements wifi, camera{
    @Override
    public void availablenetwork() {
        System.out.println("keshav" );
    }

    @Override
    public void connect() {
        System.out.println("connecting to keshav 's wifi");
    }

    @Override
    public void number(int number) {
        System.out.println("number : " + number);;
    }

    @Override
    public void pickcall() {
        super.pickcall();
    }

    @Override
    public void snapcamera() {
        System.out.println("Taking photo");
    }

    @Override
    public void video() {
        System.out.println("Taking video");
    }
}
public class Q21 {
    public static void main(String[] args) {
        Mysmarphone m1 = new Mysmarphone();
        m1.availablenetwork();
        m1.connect();
        m1.number(8435787);
        m1.pickcall();
        m1.snapcamera();
        m1.video();
        phone p1 =new phone();
        p1.number(843578);
        p1.pickcall();
    }
}
