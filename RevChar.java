import java.util.*;
class RevChar
{ public static void main()
   { Scanner sc= new Scanner(System.in);
     System.out.println("enter  a String : ");
     String s=sc.nextLine();
     String str1="",str2="";
     int l;
     char c;
     s=s+' ';
     l=s.length();
     for(int i=0;i<l;i++)
     { 
         c=s.charAt(i);
         if(c==' ')
         { str2=str2+' '+str1;
           str1="";
         }
         else
         str1=c+str1;
     }
     System.out.println(str2);
    }
}