class A{
    public int a;
    public int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}
class B extends A{
    /*
    -> Method Overriding : exactly same method is to be used in child class,
        in terms of return type, access specifier, name and parameter(s).
    -> 'static' and 'final' methods cannot be overridden
    -> When an object of subclass is created and the overridden method is called,
        the method which has been implemented in the subclass is called & its code is executed.
     */
    @Override /* This annotation is used to check whether a function is actually been overridden,
    specially used to understand if any changes is done to the parent class or child class function. */
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}
public class Method_Overidding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        B b = new B();
        b.meth2();
    }
}
