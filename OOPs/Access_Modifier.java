class MyEmployee{ 
    private int id; 
    private String name; 
    public String getName() { 
        return name; 
    } 

    public void setName (String n){ 
        name = n; 
    } 

    public void setId(int i){ 
        id = i; 
    } 

    public int getId(){ 
        return id; 
    }
}
public class Access_Modifier
{
    public static void main(String[] args) { 
        MyEmployee harry = new MyEmployee(); 
        /*harry.id = 45; 
        harry.name = "CodeWithHarry";*/ // --> Throws an error due to private access modifier
        
        harry.setName("Code With Harry");
        System.out.println("The name is : "+harry.getName());
    } 
}
 