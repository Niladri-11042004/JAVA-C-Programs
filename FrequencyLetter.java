import java.util.*;
class FrequencyLetter
{ public static void main(String s)
    { 
      int l=s.length(),s1;
      char c,i;
      for(i='A';i<='z';i++)
      { s1=0;
        for(int j=0;j<l;j++)
        { c=s.charAt(j);
          if(c==i)
          s1++;
        }
        if(s1>0)
        System.out.println("The frequency of "+i+" is "+ s1);
      }
    }
}  