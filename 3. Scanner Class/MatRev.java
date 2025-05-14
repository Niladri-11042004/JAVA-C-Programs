import java.util.*;
class MatRev
{
    int A[][];
    int m,n;
    MatRev(int mm,int nn)
    {
        m=mm;
        n=nn;
    }//constructor end
    void fillarray()
    {
        A=new int[m][n];
        Scanner sc=new Scanner(System.in);
        int i=0,j=0;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println("Enter number : ");
                A[i][j]=sc.nextInt();
            }
        }
    }//func1 end
    int reverse(int x)
    {
        int rev=0,dig=0;
        while(x>0)
        {
            dig=(x%10);
            rev=(rev*10)+dig;
            x/=10;
        }
        return rev;
    }//func2 ends
    void ReadMat(MatRev P)
    {
            int i=0,j=0;
            this.m=P.m;
            this.n=P.n;
            A=new int[this.m][this.n];
            for(i=0;i<m;i++)
            {
            for(j=0;j<n;j++)
            {
                A[i][j]=reverse(P.A[i][j]);
            }
            }
    }// func3 ends
    void display()
    {
        int i=0,j=0;
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }//func4 ends
    public static void main()
    {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter rows ,then columns : ");
        int m=sc1.nextInt();
        int n=sc1.nextInt();
        MatRev obj1=new MatRev(m,n);
        MatRev obj2=new MatRev(m,n);
        obj2.fillarray();
        obj1.ReadMat(obj2);
        System.out.println("Matrix: ");
        obj2.display();
        System.out.println("reversed Matrix: ");
        obj1.display();
    }//main end
}//class end