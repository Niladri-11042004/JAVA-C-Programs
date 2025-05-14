import java.io.*;
class Quadratic
{
    public static void main()throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("enter a :");
        double a=Double.parseDouble(br.readLine());
        
        
        System.out.println("enter b: ");
        double b=Double.parseDouble(br.readLine());
        System.out.println("enter c: ");
        double c=Double.parseDouble(br.readLine());
        double r1,r2;
        double d = b*b-4*a*c;
        if(d>0)
        {
        System.out.println("roots are real and unequal");    
        r1=(-b+Math.sqrt(d))/(2*a);
        r2=(-b-Math.sqrt(d))/(2*a);
        System.out.println("root 1="+r1);
        System.out.println("root 2="+r2);
        }
        else if(d==0)
        {
        System.out.println("roots are real and equal");    
        r1=(-b+Math.sqrt(d))/(2*a);
        System.out.println("root ="+r1);
        }
        else
        {
        System.out.println("roots are imaginary");
        }
    }
}
    