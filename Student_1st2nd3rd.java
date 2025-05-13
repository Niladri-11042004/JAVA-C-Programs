import java.util.*;
class Student_1st2nd3rd
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
      System.out.println("the 1st is "+na[0]+" the marks is" + mk[0]);
      System.out.println("the 2nd is "+na[1]+" the marks is" + mk[1]);
      System.out.println("the 3rd is "+na[2]+" the marks is" + mk[2]);
    }
}
      