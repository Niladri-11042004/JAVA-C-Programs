import java.util.*;
class Dec2Hex
{
    int N;
    String H;
    Dec2Hex()
    {
        N=0;
        H="";
    }//end of dec2hex
    //method to input decimal
    public void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the decimal : ");
        N=sc.nextInt();
    }//input ends
    // method to convert
    public void convert()
    {
        int s=N,i=0,digit=0;
        char HEX[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(s>0)
        {
            digit=s%16;//remainder
            H=HEX[digit]+H;//making hexadecimal No.
            s=s/16;//updation
        }
    }//convert ends
    //method to display
    public void display()
    {
        System.out.println("Decimal No. = "+N);
        System.out.println("Hexadecimal equivalent = "+H);
    }//display ends
    //main() to create objects
    public static void main()
    {
        Dec2Hex obj=new Dec2Hex();
        obj.input();
        obj.convert();
        obj.display();
    }//end of main
 }//end of class