import java.util.*;
public class Main
{
	int a[][];
	int m,n;
	Main(int mm,int nn)
	{
		m=mm;
		n=nn;
	}//ends
	void readArray()
	{
		a=new int[m][n];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter elements = "+(m*n));
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			a[i][j]=sc.nextInt();
		}//for ends
		
	}//func1 ends
	int check(Main P,Main Q)
	{
		int chk=0;
		if(P.m==Q.m&&Q.m==Q.n)
		{
			for(int i=0;i<m;i++)
			{
				for(int j=0;j<n;j++)
				{
					if(P.a[i][j]==Q.a[i][j])
						chk=1;
				}
			}
		}
		else
		chk=0;
		return (chk);
	}//func2 ends
	void print()
	{
		int i=0,j=0;
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			System.out.print(a[i][j]+" ");
		   System.out.println();
		}
	}//func3 ends
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows = ");
		int mx=sc.nextInt();
		System.out.println("Enter columns = ");
		int ny=sc.nextInt();
		Main obj=new Main(mx,ny);
		Main obj1=new Main(mx,ny);
		obj.readArray();
		obj1.readArray();
		Main obj2=new Main(mx,ny);
		obj2.check(obj,obj1);
		System.out.println("1st array = ");
		obj.print();
		System.out.println("2nd Array = ");
		obj1.print();
	}//main ends
}//class ends