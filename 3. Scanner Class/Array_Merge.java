import java.util.*;
class Array_Merge
{
    int arr[];
    int n;
    Array_Merge(int nn)
    {
        n=nn;
        arr=new int[n];
    }
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array element := ");
        int i=0;
        for(i=0;i<n;i++)
        {
            System.out.println("arr[ "+i+" ]");
            arr[i]=sc.nextInt();
        }
    }
    Array_Merge mix(Array_Merge A)
    {
        Array_Merge obj=new Array_Merge(this.n+(A.n));
        int i=0,j=0,t=0,k=0;
        for(i=0;i<this.n;i++)
        {
            for(j=0;j<this.n-i-1;j++)
            {
                if(this.arr[j]>this.arr[j+1])
                {
                    t=this.arr[j];
                    this.arr[j]=this.arr[j+1];
                    this.arr[j+1]=t;
                }
            }
        }//for ends
        
        for(i=0;i<A.n;i++)
        {
            for(j=0;j<A.n-i-1;j++)
            {
                if(A.arr[j]>A.arr[j+1])
                {
                    t=A.arr[j];
                    A.arr[j]=A.arr[j+1];
                    A.arr[j+1]=t;
                }
            }
        }//for ends
        
        obj.arr=new int[this.n+(A.n)];
        for(i=0;i<(this.n+(A.n));i++)
        {
            if(i<this.n)
            obj.arr[i]=this.arr[i];
            else
            obj.arr[i]=A.arr[k++];
        }
        return obj;
    }
    void display()
    {
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
    public static void main()
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No. of elements =  ");
        int noe=sc.nextInt();
        Array_Merge m=new Array_Merge(noe);
        Array_Merge n=new Array_Merge(noe);
        Array_Merge k=new Array_Merge(noe);
        System.out.println("1st Array = ");
        m.accept();
        System.out.println("2nd Array = ");
        n.accept();
        k=m.mix(n);
        System.out.println(" 1st array elements = ");
        m.display();
        System.out.println(" 2nd array elements = ");
        n.display();
        System.out.println(" merged array elements = ");
        k.display();
    }//main ends
}//class ends
        