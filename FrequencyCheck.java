import java.util.*;
class FrequencyCheck
{ public static void main()
    { Scanner sc=new Scanner (System.in);
      System.out.println("enter any sentence : ");
      String s=sc.nextLine();
      System.out.println("enter the word : ");
      String s1=sc.next();
      int f=0,l=s.length();
      String s2="";
      for(int i=0;i<l;i++)
      { char c=s.charAt(i);
        if(c==' ')
        {if(s2.equals(s1))
           f+=1;
              
            s2="";
          
        }
        else
        s2=s2+c;
      }
      System.out.println("The word appears "+f+" times in the sentence.");
    }
}
