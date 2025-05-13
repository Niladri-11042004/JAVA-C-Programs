import java.util.*;
class Student_Rank
{ public static void main()
    { Scanner sc=new Scanner(System.in);
      Scanner sc1=new Scanner(System.in);
      String na[]=new String[4];
      int mk[]=new int[4];
      int y=0,x=0,temp=0;
      String temp1="";
      for(x=0;x<4;x++)
      { System.out.println("Enter the name ");
        na[x]=sc1.nextLine();
        System.out.println("Enter the marks ");
        mk[x]=sc.nextInt();
      }
      for(x=0;x<4;x++)
      { for(y=0;y<4-x-1;y++)
          { if(mk[y]<mk[y+1])
              { temp=mk[y];
                mk[y]=mk[y+1];
                mk[y+1]=temp;
                temp1=na[y];
                na[y]=na[y+1];
                na[y+1]=temp1;
              }
          }
      }
      int i=1;
      for(x=0;x<4;x++)
      {System.out.println("Rank "+i+" is "+na[x]+" and marks is "+mk[x]);
       i++;
      }
    }
}