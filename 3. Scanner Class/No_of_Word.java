import java.util.*;
class No_of_Word
{ public static void main()
    { Scanner sc=new Scanner(System.in);
      System.out.println("Enter A Sentence ; ");
      String s=sc.nextLine();
      int l=s.length();
      char c;
      int sa=0,sa1=0;
      for(int i=0;i<l;i++)
      { c=s.charAt(i);
        if(c==' ')
        sa++;
      }
      sa1=sa+1;
      System.out.println("the No. of words is "+sa1);
    }
}