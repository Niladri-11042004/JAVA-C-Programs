import java.util.*;
class Matrix_Sort
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the size of matrix : (M) =  ");
        int M=sc.nextInt();
        int a[][]=new int[M][M];
        int b[]=new int[M*M];
        int sum=0,i=0,j=0,k=0,temp=0;
        for(i=0;i<M;i++)
        {
            for(j=0;j<M;j++)
            {
                System.out.println("Enter Elements = ");
                a[i][j]=sc.nextInt();
                sum+=a[i][j];
                if(i==0||j==0||i==M-1||j==M-1)
                    b[k++]=a[i][j];
            }
        }//for ends
        k=0;
        for(i=0;i<b.length;i++)
        {
            for(j=0;j<b.length-i-1;j++)
            {
                if(b[j]<b[j+1])
                {
                    temp=b[j];
                    b[j]=b[j+1];
                    b[j+1]=temp;
                }
            }
        }//sort for end
        for(i=0;i<M;i++)
        {
            for(j=0;j<M;j++)
            {
                if(i==0||j==0||i==M-1||j==M-1)
                    System.out.print(b[k++]+" ");
                else
                    System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }//for ends
        System.out.println("The sum of all elements : "+ sum);
    }
}