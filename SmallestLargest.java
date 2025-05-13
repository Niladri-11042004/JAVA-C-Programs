
import java.io.*;
class SmallestLargest
{public static void main()throws IOException
 {BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  System.out.println("enter the number");
  int num,n,smallest=0,large=0;
  num=Integer.parseInt(br.readLine());
  n=Integer.parseInt(br.readLine());
  smallest=num;
  for(int i=2;i<n;i++)
  { 
    if(num>large)
    {
    large=num;
    System.out.println(large);
    }
    else if(num<smallest)
    {
    smallest=num;
    System.out.println(smallest);
    }
  }
 }
}
 