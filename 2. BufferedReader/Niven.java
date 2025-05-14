import java.io.*;
class Niven
{
    public static void main()throws IOException
    {
      BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
      System.out.println("enter the number");
      int n=Integer.parseInt(br.readLine());
      int sum=0,digits=0,s=n;
      while(n>0)
      {
          digits=n%10;
          sum=sum+digits;
          n=n/10;
      }
      if(s%sum==0)
      System.out.println(s+" is a niven number");
      else
      System.out.println(s+" is not a niven number");
    }
}
