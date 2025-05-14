import java.util.*;
class RevWord
{ public static void main()
    { Scanner sc=new Scanner(System.in);
      System.out.println("enter a word : ");
      String s=sc.nextLine();
      int l=s.length();
      char c;String st="";
      for(int i=l-1;i>=0;i--)
      { c=s.charAt(i);
        st=st+c;
      }  
      System.out.println("old word : "+s);
      System.out.println("new Reversed word : "+st);
    }
}