import java.util.*;
class StringMenu1
{ public static void main()
    { Scanner sc=new Scanner (System.in);
      System.out.println("The Menu is :"+"\n"+"Enter 1 for triangle."+"\n"+"Enter 2 for inverted triangle.");
      System.out.println("enter choice :-");
      int ch=sc.nextInt();
      System.out.println("Enter the terms : ");
      int term=sc.nextInt();
      int i,j,z,y;
      char k,l;
      switch(ch)
      {
          case 1:{for(i=1;i<=term;i++)
                   {
                       for(j=i;j>1;j--)
                       System.out.print(" ");
                       for(z=i;z<=term;z++)
                       System.out.print("*");
                       System.out.println();
                    }
                 }
                 break;
          case 2:{y=0;
                  for(k='A';k<(char)(65+term);k++)
                   {
                       for(l='A';l<(char)((65+term)-y);l++)
                       System.out.print(l);
                       System.out.println();
                       y++;
                    }
                  }
                 break;
          default:System.out.println("wrong choice ! ");
       }
    }
}       