import java.util.*;
class Student_highName
{ public static void main()
    { Scanner sc=new Scanner(System.in);
      String name[]=new String[10];
      int mark[]=new int[10];
      int high=0,x=0;
      String n="";
      for(x=0;x<10;x++)
      { System.out.println("Enter the names ");
        name[x]=sc.next();
        System.out.println("Enter the marks ");
        mark[x]=sc.nextInt();
      }
      high=mark[0];
      n=name[0];
      for(x=1;x<10;x++)
      {if(high<mark[x])
          { high=mark[x];
            n=name[x];
          }
      }
      System.out.println("the Highest name = "+n);
      System.out.println("the Highest mark = "+high);
      }
    }