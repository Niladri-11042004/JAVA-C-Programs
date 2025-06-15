class MyMainEmployee{ 
    private int id; 
    private String name;
    //Default Constructor
    public MyMainEmployee(){ 
        id = 00; 
        name = "Your-Name-Here"; 
    } 
    //Parameterized Constructor
    public MyMainEmployee(String name, int id){ 
        this.id = id; 
        this.name = name; 
    } 
    

    public String getName() { return name; } 

    public void setName(String n) { this.name = n; } 

    public void setId(int i) { this.id = i; } 

    public int getId() { return id; } 
} 

public class Constructors { 
    public static void main(String[] args) { 
        MyMainEmployee harry = new MyMainEmployee(); 
        System.out.println("The id is : "+harry.getId());
        System.out.println("The name is :"+harry.getName());
        MyMainEmployee niladri = new MyMainEmployee("Niladri Ghosh",26); 
        System.out.println("The id is : "+niladri.getId());
        System.out.println("The name is :"+niladri.getName());
} 
}