import java.util.*;
class Array_Sum
 {
     int m,sum,max,min,n;
     int A[];
     Array_Sum()
     {
         m=sum=max=min=n=0;
     }
     public void input()
     {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter number of elements = ");
         m=sc.nextInt();
         A=new int[m];
         for(int i=0; i<m; i++)
         {
             System.out.print("Enter A["+i+"] : ");
             A[i]=sc.nextInt();
         }
         max=min=A[0];
     }
     public int calculate_sum()
     {
         for(int i=0; i<m; i++)
         {
             sum+=A[i];
         }
         return sum;
     }
     public int maximum()
     {
         for(int i=1; i<m; i++)
         {
             if(A[i]>max)
             max=A[i];
         }
         return max;
     }
     public int minimum()
     {
         for(int i=1; i<m; i++)
         {
             if(A[i]<min)
             min=A[i];
         }
         return min;
     }
     public void display()
     {
         System.out.print("The array is : ");
         for(int i=0; i<m; i++)
         {
             System.out.print(A[i]+" ");
         }
         System.out.println("\nThe Sum of the Array is = " +calculate_sum());
         System.out.println("The MAXIMUM NUMBER in the Array is : " +maximum());
         System.out.println("The MINIMUM NUMBER in the Array is : " +minimum());
     }
     public static void main(String args[])
     {
         Array_Sum obj = new Array_Sum();
         obj.input();
         obj.display();
     }
 }