abstract class parent{
    public void greet(){
        System.out.println("Hi My self Keshav");
    }
    public void greet2(){
        System.out.println("Good afternoon...");
    }
    abstract public void greet3();
}
class child1 extends parent{
    @Override
    public void greet() {
        super.greet();
    }

    @Override
    public void greet3() {
        super.greet2();
    }

}
abstract class child2 extends parent{
    @Override
    public void greet() {
        super.greet();
    }

    @Override
    public void greet3() {
        super.greet2();
    }
    abstract public void greet4();
}

public class Q18 {
    public static void main(String[] args) {
        parent p1 = new child1();
        p1.greet();
        p1.greet2();
        p1.greet3();

    }
}
