import java.util.*;
class Co_Prime
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 2 No.s A and B = ");
        int A=sc.nextInt();
        int B=sc.nextInt();
        int h=calc_hcf(A,B);
        boolean p1=prime(A);
        boolean p2=prime(B);
        if(h==1&&p1==true&&p2==true)
        System.out.println(" they are co prime ");
        else
        System.out.println(" they are not co prime ");
    }
    public static int calc_hcf(int a,int b)
    {
        int ma=Math.max(a,b);
        int mi=Math.min(a,b);
        int hcf=0;
        for(int i=1;i<=ma;i++)
        {
            if(ma%i==0&&mi%i==0)
            hcf=i;
        }
        return hcf;
    }
    public static boolean prime(int n)
    {
        int flag=0,i=0;
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        return false;
        else
        return true;
    }
}