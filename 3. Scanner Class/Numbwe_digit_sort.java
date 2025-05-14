import java.util.*;
public class Numbwe_digit_sort
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in); 
        System.out.println("Enter a Number ="); 
        int n=sc.nextInt(); 
        int digit=0,s=n, c = 0, k = 0, temp = 0,n2=0 ; 
        while(s>0)
        {
            c++; 
            s/=10;
        } 
        int N[]= new int[c];
        s=n; 
        while(s>0)
        {
            digit=s%10; 
            N[k++] = digit;
            s/=10;
        }
        for(int i=0; i<c; i++)
        {
            for(int j = 0; j<c-i-1; j++)
            {
                if (N[j] > N[j + 1])
                {
                    temp=N[j]; 
                    N[j] = N[j + 1] ;
                    N[j + 1] = temp ;
                }
            }//for end
        }// for main end
        for(int i=0;i<c;i++)
        {
            n2=( n2*10)+ N[i];
        }
        System.out.println(" Original No.= "+ n);
        System.out.println(" New No. = "+ n2);
    }// end of main
}//end of class
	