class Phone{
    public void showTime(){
        System.out.println("Time is 1:38 pm");
    }
    public void on(){
        System.out.println("Turning ON 'Phone'...");
    }
}
class Smartphone extends Phone{
    public void music(){
        System.out.println("Playing Music...");
    }
    public void on(){
        System.out.println("Turning on 'Smartphone'");
    }
}
public class Dynamic_method_dispatch {//
    public static void main(String[] args) {
        //Phone -> reference
        //Smartphone -> object
        //It works on the fact that a Smartphone can be a phone, but a phone cannot be a Smartphone
        Phone obj = new Smartphone(); //Runtime Polymorphism <- This is allowed...
        //Smartphone obj = new Phone(); <- This is not allowed...
        obj.on();
        obj.showTime();
        //No method other than the Overridden Method of the subclass can be executed by this Dynamic_method_dispatch (which method to run is decided during Runtime)
        //obj.music(); <- This is not allowed...
    }
}
