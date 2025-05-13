import java.util.*;
class Dec2Bin
{
    int n;
    Dec2Bin()
    {
        n=0;
    }
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A decimal NO. =" );
        n=sc.nextInt();
    }
    public long convert()
    {
        int a=0,t=n;
        long b=0,bin=0;
        while(t>0)
        {
            a=t%2;
            b=(b*10)+a;
            t/=2;
        }
        while(b>0)
        {
            a=(int)b%10;
            bin=(bin*10)+a;
            b/=10;
        }
        return bin;
    }
    public void display()
     {
         System.out.println("Decimal No. = "+n);
         System.out.println("BiNARY No = "+convert());
     }
     public static void main()
     { 
          Dec2Bin db=new Dec2Bin();
          db.accept();
          db.convert();
          db.display();
     }
    }
