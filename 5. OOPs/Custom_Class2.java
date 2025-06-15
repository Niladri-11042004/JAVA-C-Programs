class Employee{ 
    int salary; 
    String name; 
    public int getSalary(){ 
        return salary; 
    } 

    public String getName(){ 
        return name; 
    } 

    public void setName(String n){ 
        name = n; 
    } 
} 

class CellPhone{ 
    public void ring(){ 
        System.out.println("Ringing..."); 
    } 

    public void vibrate(){ 
        System.out.println("Vibrating..."); 
    } 

    public void callFriend(){ 
        System.out.println("Calling Mukul..."); 
    } 
}

class Square{
    int side;
    public int area(){ 
        return side*side; 
    } 

    public int perimeter(){ 
        return 4*side; 
    }
}

public class Custom_Class2
{
    public static void main(String[] args) {
        //Problem 1
        Employee harry = new Employee();
        harry.setName("Code With Harry");
        harry.salary=50000;
        System.out.println("The salary is : "+harry.getSalary());
        System.out.println("The name is : "+harry.getName());

        //Problem 2
        System.out.println();
        CellPhone sangsum = new CellPhone();
        sangsum.callFriend();
        sangsum.vibrate();
        sangsum.ring();

        // Problem 3 
        System.out.println();
        Square sq = new Square(); 
        sq.side = 3; 
        System.out.println("The Area is: "+sq.area()); 
        System.out.println("The Perimeter is: "+sq.perimeter());
    }
}