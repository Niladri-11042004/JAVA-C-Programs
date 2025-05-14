import java.util.*;
class TwoDarrayTRANS
{
    public static void main(int m,int n)
    {
        Scanner sc=new Scanner(System.in);
        int A[][]=new int[m][n];
        int B[][]=new int[n][m];//for transpore array.
        int i,j,k=0;
        for(i=0;i<m;i++)
        { for(j=0;j<n;j++)
          { System.out.println("Enter value A["+i+"]"+"["+j+"]");
            A[i][j]=sc.nextInt();
          }//end of for
        }//end of for
        for(i=0;i<m;i++)
        { for(j=0;j<n;j++)
          { 
            B[i][j]=A[j][i];
          }//end of for
        }//end of for
        for(i=0;i<n;i++)
        { for(j=0;j<m;j++)
          { System.out.print(B[i][j]+" ");
          }//end of for
          System.out.println();
        }//end of for
    }
}