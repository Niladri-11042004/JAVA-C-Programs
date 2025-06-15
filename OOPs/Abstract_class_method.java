//An abstract class is a class that does not exist physically, hence its object cannot be created, but we can create other class using an abstract class
//Any class inheriting the abstract class should either override the abstract method of the parent class or should also be an abstract class itself
abstract class Parent2{
    public Parent2(){
        System.out.println("Mai base2 ka constructor hoon");
    }
    public void sayHello() {
        System.out.println("Hello");
    }
    //This abstract method is declared here to tell its child class(ess) to override the method
    //An abstract method is never implemented
    //Presence of one abstract method in a class, makes it an abstract class
    abstract public void greet();
}

class Child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good morning");
    }
}

abstract class Child3 extends Parent2{
    public void th(){
        System.out.println("I am good");
    }
}

public class Abstract_class_method {
    public static void main(String[] args) {
        Child2 c = new Child2();
        Parent2 c2 = new Child2();//It is allowed to use the abstract parent class as reference
        c.greet();
        c2.greet();
    }
}
