import java.util.*;
class DuckNo
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. = ");
        String s=sc.next();
        int n=Integer.parseInt(s);
        int digit=0,k=0,cou=0;
        while(n>0)
        {
            digit=n%10;
            cou++;
            if(digit==0)
            {
                k=1;
                break;
            }
            n=n/10;
        }
        if((cou>1)&&k==1)
        System.out.println("It is a duck number");
        else
        System.out.println("It is not a duck number");
    }
}