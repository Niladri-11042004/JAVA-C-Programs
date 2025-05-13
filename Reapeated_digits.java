import java.util.*;
class Reapeated_digits
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number = ");
        int n=sc.nextInt();
        int d=0,d1=0,s=n,i=0;
        while(s>0)
        {
            d=s%10;
            i=s/10;
            while(i>0)
            {
                d1=i%10;
                if(d==d1)
                System.out.println(d);
                i=i/10;
            }
            s=s/10;
        }
    }
}