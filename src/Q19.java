interface bicylcle{
    int speed =45;
    public void speedup(int accelrate);
    public void brakeup(int decrement);
}
interface horn{
    public void  horncar();
    public void  stop();

}
class Avoncylcle implements bicylcle, horn {
    public void speedup(int accelrate){
        System.out.println("current speed is" + (speed + accelrate));
    }

    public void brakeup(int decrement){
        System.out.println("decrease spped" + (speed - decrement));
    }
    public void horncar(){
        System.out.println("pee pee pee");
    }

    @Override
    public void stop() {
        System.out.println("hi stop it");
    }
}
public class Q19 {
    public static void main(String[] args) {
        Avoncylcle a1 = new Avoncylcle();
        System.out.println("current speed is " + a1.speed);
        a1.brakeup(5);
        a1.speedup(12);
        a1.horncar();
        a1.stop();

    }
}
