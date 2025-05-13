import java.util.*;
class StringVC
{ public static void main()
    { Scanner sc=new Scanner(System.in);
      System.out.println("enter a sentence : ");
      String s=sc.nextLine();
      s=s.toUpperCase();
      int l=s.length();
      char c;
      int vc=0,cn=0;
      for(int i=0;i<l;i++)
      { c=s.charAt(i);
        if(c>='A'&&c<='Z')
        { if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
          vc++;
          else
          cn++;
        }
      }
       System.out.println("No. of vowels : "+ vc);
       System.out.println("No. of consonants : "+cn);
    }
}