class Base1{
    public Base1(){
        System.out.println("I am the constructor of base class...");
    }
    public Base1(int a){
        System.out.println("I am the overloaded constructor of base class with value of a as : "+a);
    }
}

class Derived1 extends Base1{
    public Derived1(){
        System.out.println("I am the constructor of derived class...");
    }
    public Derived1(int x, int y){
        super(x);/*This keyword is used to invoke the overloaded Parameterised Constructor of the Base Class.
        If not used the Non-Parameterized Constructor will be invoked by default,
        also if no non-parameterized constructor is present in the Base class,
        then an error will be thrown, when 'super' keyword is not used. */
        System.out.println("I am the overloaded constructor of derived class with value of y as : "+y);
    }
}
class ChildOfDerived extends Derived1 {
    ChildOfDerived() {
        System.out.println("I am the constructor of child of derived constructor...");
    }

    ChildOfDerived(int x, int y, int z) {
        super(x, y);//Used to invoke the Parameterized Constructor of Derived Class...
        System.out.println("I am an overloaded constructor of Derived with value of z as: " + z);
    }
}
public class Constructors_in_Inheritance {
    public static void main(String[] args) {
        /* When an object of the Derived class is created, the Constructor of the Base class and
        the Constructor of the Derived class, both are invoked, respectively. */
        Derived1 d = new Derived1();
        System.out.println();
        Derived1 d1 = new Derived1(14,9);
        System.out.println();
        ChildOfDerived cd = new ChildOfDerived();
        System.out.println();
        ChildOfDerived cd1 = new ChildOfDerived(14,10,9);
    }
}
