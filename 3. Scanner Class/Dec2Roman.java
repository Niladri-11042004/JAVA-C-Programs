import java.util.*;
class Dec2Roman
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a decimal No. = ");
        int num=sc.nextInt();
        String R[]={"M","CM","D","C","XC","L","X","IX","V","I"};
        int N[]={1000,900,500,100,90,50,10,9,5,1};
        int i=0,n=num;
        String str="";
        for(i=0;i<10;i++)
        {
            while(num>=N[i])
            {
                num-=N[i];
                str+=R[i];
            }
        }//for ends
        System.out.println("decimal No. = "+n);
        System.out.println("Roman equivalent = "+str);
    }//end of class
}//end of main