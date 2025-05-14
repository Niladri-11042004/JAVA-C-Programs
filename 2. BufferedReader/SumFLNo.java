import java.io.*;
class SumFLNo
{ public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number");
        int n=Integer.parseInt(br.readLine());
        int ln=n%10;
        int fn=n;
        while(fn>=10)
        fn=fn/10;
        
        System.out.println("the first number is "+fn);
        System.out.println("the last number is "+ln);
        int sum=fn+ln;
        System.out.println("the sum of last and first number is "+ sum);
    }
}