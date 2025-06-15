class Employee{
    //there cannot be more than one "public" class in one java file...
    int id;
    int salary;
    String name;
    public void printDetails()
    {
        System.out.println("My id is : "+id); 
        System.out.println("My name is : "+name);
    }
    public int salary()
    {
        return salary;
    }
}

public class Custom_Class{
    public static void main(String[] args) { 
        System.out.println("This is our custom class"); 
        Employee harry = new Employee(); // Instantiating a new Employee Object 
        Employee niladri = new Employee();
        // Setting attributes for Harry
        harry.id = 12; 
        harry.salary=50000;
        harry.name = "Code With Harry"; 
        // Setting attributes for Niladri
        niladri.id = 26;
        niladri.salary=0;
        niladri.name= "Niladri Ghosh";
        //printing attributes
        harry.printDetails();
        niladri.printDetails();
        int salary=harry.salary();
        System.out.println(salary);
        //System.out.println(harry.id); 
        //System.out.println(harry.name); 
    }
}