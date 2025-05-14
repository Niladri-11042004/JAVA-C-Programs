import java.util.*;
class IneterMenu
{ public static void main()
    { Scanner sc=new Scanner (System.in);
      System.out.println("The Menu is :"+"\n"+"Enter 1 for armstrong number."+"\n"+"Enter 2 for buzz Number");
      System.out.println("enter choice :-");
      int ch=sc.nextInt();
      System.out.println("Enter the number : ");
      int n=sc.nextInt();
      boolean buzz,arm;
      switch(ch)
      { case 1: arm=Armstrong(n);
                if(arm==true)
                 System.out.println(n+ " is a Armstrong Number");
                 else
                 System.out.println(n+ " is not a Armstrong Number");
                break;
        case 2: buzz=Buzz(n);
                if(buzz==true)
                System.out.println(n+ " is a Buzz Number");
                else
                System.out.println(n+ " is a not a buzz Number");
                break;
        default:System.out.println(" Wrong Choice");
      }
    }
  public static boolean Armstrong(int x)
   { int digit=0,sum=0,s=x;
     while(x>0)  
     { digit=x%10;
       sum=sum+(digit*digit*digit);
       x=x/10;
     }
     if(sum==s)
     return true;
     else
     return false;
   }
   public static boolean Buzz(int y)
   { int ln=y%10;
     if(ln==7||y%7==0)
     return true;
     else
     return false;
    }
}