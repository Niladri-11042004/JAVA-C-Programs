import java.io.*;
class Buzz_Number
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter an integer");
        int n=Integer.parseInt(br.readLine());
        int ln=n%10;
        if(ln==7||n%7==0)
        System.out.println(n+"is a buzz no.");
        else
        System.out.println(n+"is not a buzz no.");
    }
}