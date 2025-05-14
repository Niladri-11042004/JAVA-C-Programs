import java.io.*;
class PrimeCheck
{
    public static void main()throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
      System.out.println("Enter the number :");
      int n=Integer.parseInt(br.readLine());
        int flag=0;
        for(int i=2;i<=n-1;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==0)
            {
                System.out.println(n+" is prime number");
                
                
            }   
        else
         System.out.println(n+" is not a prime number");   
        }
    }