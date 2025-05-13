import java.util.*;
 class TransposeArray
{
	int m,n;
	int A[][];
	TransposeArray()//default constructor
	{
		m=n=0;
	}
	//using input() to enter values.
	public void input()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter columns(m) and row(n) = ");
		m=sc.nextInt();
		n=sc.nextInt();
		A=new int[m][n];
		int i=0,j=0;
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				System.out.println("Enter A["+i+"] ["+j+"]");
				A[i][j]=sc.nextInt();
			}
		}//for ends
	}//end of input()
	//using transMat() to form Transpose of Array
	public  TransposeArray transMat()
	{
		TransposeArray ob1=new TransposeArray();
		ob1.A=new int[n][m];
		int i=0,j=0;
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
			ob1.A[i][j]=A[j][i];
		}
		return ob1;
	}//end of transMat()
	//using display() to display the transpose
	public void display()
	{
		int i=0,j=0;
		System.out.println("Matrix before transpose = ");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
		        System.out.print(A[i][j]+" ");
		      System.out.println();
		}
		System.out.println("Matrix after transpose = ");
		for(i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
		        System.out.print(transMat().A[i][j]+" ");
		      System.out.println();
		}
	}//end of display()
	//main() method to display the output.
	public static void main()
	{
		TransposeArray obj=new TransposeArray();
		obj.input();
		obj.display();
	}//end of main
}//end of class
