import java.util.*;
class DataProcess
{
    int n;
    public void armstr()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A number : ");
        n=sc.nextInt();
        int digit=0,sum=0,s=n;
        while(n>0)
        {
            digit=n%10;
            sum+=digit*digit*digit;
            n=n/10;
        }
        if(s==sum)
        System.out.println(s+" is Armstrong number");
        else
        System.out.println(s+" is not Armstrong number");
    }
    public boolean palin(int n1)
    {
        int digit=0,sum=0,s=n1;
        while(n1>0)
        {
            digit=n1%10;
            sum=(sum*10)+digit;
            n1=n1/10;
        }
        if(s==sum)
        return true;
        else
        return false;
    }
    public void primepalindrome()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number : ");
        n=sc.nextInt();
        int flag=0,i=0;
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
        boolean p=palin(n);
        if(flag==0&&p==true)
        System.out.println(n+" is a prime palindrome number .");
        else
        System.out.println(n+" is not a prime palindrome number .");
    }
}