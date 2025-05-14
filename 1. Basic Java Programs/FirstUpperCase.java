import java.util.*;
class FirstUpperCase
{
    public static void main(String s)
    {
       int l=0,i=0;char c,c1;String s1="";s=" "+s;
       l=s.length();
       for(i=0;i<l;i++)
       {
           c=s.charAt(i);
           if(c!=' ')
           s1=s1+c;
           else if(c==' ')
           {
               c1=s.charAt(i+1);
               c1=Character.toUpperCase(c1);
               s1=s1+" "+c1;
               i=i+1;
           }
        }
       System.out.println("The Sentence is : "+s1);
    }
}
