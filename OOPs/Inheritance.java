class Base{
    public int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("I am setting X now...");
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am a function of base class...");
    }
}
class Derived extends Base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class Inheritance {
    public static void main(String[] args)
    {
        //Creating an object of the Derived class
        Derived d=new Derived();
        d.setX(4);
        System.out.println(d.getX());
        d.printMe();
    }
}
