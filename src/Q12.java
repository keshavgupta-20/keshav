class Cellphone{
    void ringing(){
        System.out.println("Ringing..");
    }
    void Vibrabting(){
        System.out.println("Vibrating..");
    }
    void call(){
        System.out.println("Calling..");
    }

}
public class Q12 {
    public static void main(String[] args) {
        Cellphone c1 = new Cellphone();
        c1.call();
        c1.ringing();
        c1.Vibrabting();
    }
}
