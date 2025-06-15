//In Java 'interface' is group of related methods with empty bodies (i.e., class like structure containing only group of unimplemented/abstract methods).
//We can implement multiple inheritance at a time
interface Bicycle{
    void applyBrake (int decrement);
    void speedup (int increment);
}

class AvonCycle implements Bicycle {
    int speed = 7;
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    @Override
    public void applyBrake(int decrement) {
        speed = speed - decrement;
        System.out.println("The Speed is, when Brake is applied : "+speed);
    }
    @Override
    public void speedup (int increment) {
        speed = speed + increment;
        System.out.println("The Speed is, when speed is increased : "+speed);
    }
}

public class Interface {
    public static void main(String[] args) {
        Bicycle c = new AvonCycle();
        c.applyBrake(3);
        c.speedup(5);
    }
}
