import java.io.*;
class Spy

{
    public static void main()throws IOException
    {
      BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
      System.out.println("enter the number");
      int n=Integer.parseInt(br.readLine());
      int sum=0,digits=0,s=n;
      long product=1;
      
      while(n>0)
      {
          digits=n%10;
          sum=sum+digits;
          product=product*digits;
          n=n/10;
        }
        if(sum==product)
        System.out.println(s+" is a spy number");
        else
        System.out.println(s+" is not a spy number");
    }
}