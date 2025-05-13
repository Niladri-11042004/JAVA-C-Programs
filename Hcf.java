import java.io.*;
class Hcf
{
    public static void main()throws IOException
    {   BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("enter the number: ");
        int a=Integer.parseInt(br.readLine());
        System.out.println("the factors are : ");

        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
                System.out.println(i);
        }
    }
}