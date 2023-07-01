interface Bicycle {
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface Bicycle2 extends Bicycle {
    void applyBrake(int dec);
}
abstract class Wheel {
    protected abstract void wheels();
    void chain() {

    }
}
class AvonCycle extends Wheel implements Bicycle2 {
    public void applyBrake(int decrement) { // use public keyword with inteface methods
        System.out.println("applyBrake");
    }
    public void speedUp(int increment) {
        System.out.println("speedUp");
    }
    protected void wheels() {

    }
}

public class Interfaces {
    public static void main(String[] args) {
        AvonCycle cycle = new AvonCycle();
        cycle.applyBrake(1);
        System.out.println(cycle.a);
        cycle.wheels();
    }
}
