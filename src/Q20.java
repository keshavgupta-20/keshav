interface cylce{
    void sppedup(int accelerate);
    void brakeup(int decresae);

}
interface  car extends  cylce{
    void mediaplayer();
    void ac();
}
class car1 implements car{
    @Override
    public void ac() {

    }

    @Override
    public void mediaplayer() {

    }

    @Override
    public void brakeup(int decresae) {

    }

    @Override
    public void sppedup(int accelerate) {

    }
}
public class Q20 {
    public static void main(String[] args) {

    }
}
