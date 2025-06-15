public class Var_arr2
{
    static int sum(int x, int ...arr){ 
        //Atleast one '^' integer is required now...
        // Available as int [] arr; 
        int result=x; 
        for(int a: arr) { 
            result += a; 
        } 
        return result; 
    }

    public static void main(String[] args) { 
        //System.out.println("The sum of Nothing is: " + sum()); <- gives error, since no argument is given...
        System.out.println("The sum of 1 is: " + sum(1)); 
        System.out.println("The sum of 4 and 5 is: " + sum(4,5)); 
        System.out.println("The sum of 4, 3 and 5 is: " + sum(4,3,5)); 
        System.out.println("The sum of 2, 4, 3 and 5 is:" + sum(2,4, 3, 5)); 
        System.out.println("The sum of 2, 4, 3 and 5 is: " + sum(1,2, 4, 3, 5)); 
    } 
}

