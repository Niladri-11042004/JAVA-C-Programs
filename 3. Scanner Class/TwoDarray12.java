import java.util.*;
class TwoDarray12
{
    public static void main(int m,int n)
    {
        Scanner sc=new Scanner(System.in);
        int A[][]=new int[m][n];
        int O[]=new int[m*n];
        int i,j;
        int bposr=0,bposc=0;
        int sposr=0,sposc=0;
        int big=A[0][0],small=A[0][0];
        for(i=0;i<m;i++)
        { for(j=0;j<n;j++)
          { System.out.println("Enter value A["+i+"]"+"["+j+"]");
            A[i][j]=sc.nextInt();
          }//end of for
        }//end of for
        for(i=0;i<m;i++)
        { for(j=0;j<n;j++)
          { if(small>A[i][j])
              { small=A[i][j];
                sposr=i;
                sposc=j;
              }
            if(big<A[i][j])
            {  big=A[i][j];
               bposr=i;
               bposc=j;
            }
          } 
        }
        System.out.println("*****THE POSITION OF THE SMALLEST ELEMENT IS *****"+"\n"+"Row is "+sposr+"Column is "+sposc);
        System.out.println("*****THE POSITION OF THE BIGGEST ELEMENT IS *****"+"\n"+"Row is "+bposr+"Column is "+bposc);
    }
}