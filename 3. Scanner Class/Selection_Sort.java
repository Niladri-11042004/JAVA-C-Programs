import java.util.*;
class Selection_Sort
{ 
    public static void main()
    { 
        Scanner sc=new Scanner(System.in);
        int A[]=new int[5];
        int i=0,j=0,temp=0,pos=0,low=0;
        for(i=0;i<5;i++)
        {
            System.out.println("Enter The Elements : ");
            A[i]=sc.nextInt();
        }
        for(i=0;i<5-1;i++)
        {
            low=A[i];
            pos=i;
            for(j=i+1;j<5;j++)
            {
                if(low<A[j])
                {
                   low=A[j];
                   pos=j;
                }
            }
            temp=A[i];
            A[i]=A[pos];
            A[pos]=temp;
        }
        for(i=0;i<5;i++)
        System.out.print(A[i]+" ");
    }
}