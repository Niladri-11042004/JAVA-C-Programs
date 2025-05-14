import java.io.*;
class PrimeDigit
{ 
    public static void main()throws IOException
    { 
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("ENTER A NUMBER");
        int n=Integer.parseInt(br.readLine());
        System.out.println("the prime digits are ");
        int count =0,digit=0,i=0;
        while(n>=1)
        { count=0;
            digit=n%10;
            for( i=1;i<=digit;i++)
            { if(digit%i==0)
                    count=count + 1;
            }//end of for
            if(count==2)
                System.out.println(digit) ;
            n=n/10;
        }//end of while
    }//end of main
}//end of class 