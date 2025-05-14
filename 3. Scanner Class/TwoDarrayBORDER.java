import java.util.*;
class TwoDarrayBORDER
{
    public static void main(int m,int n)
    {
        Scanner sc=new Scanner(System.in);
        int A[][]=new int[m][n];
        int i,j,k=0;
        for(i=0;i<m;i++)
        { for(j=0;j<n;j++)
          { System.out.println("Enter value A["+i+"]"+"["+j+"]");
            A[i][j]=sc.nextInt();
          }//end of for
        }//end of for
        System.out.println("****THE BORDERING ELEMENTS ARE****");
        for(i=0;i<m;i++)
        { for(j=0;j<n;j++)
          { 
              if(i==0||i==m-1||j==0||j==n-1)
              System.out.print(A[i][j]+" ");
          }
        }
    }
}