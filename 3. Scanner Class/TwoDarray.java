import java.util.*;
class TwoDarray
{
    public static void main(int m,int n)
    {
        Scanner sc=new Scanner(System.in);
        int A[][]=new int[m][n];
        int O[]=new int[m*n];
        int i,j,k=0;
        for(i=0;i<m;i++)
        { for(j=0;j<n;j++)
          { System.out.println("Enter value A["+i+"]"+"["+j+"]");
            A[i][j]=sc.nextInt();
          }//end of for
        }//end of for
        for(j=0;j<n;j++)
        {
            for(i=0;i<m;i++)
            {
                O[k]=A[i][j];
                k++;
            }
        }
        for(i=0;i<(m*n);i++)
        System.out.print(O[i]+" ");
    }
}