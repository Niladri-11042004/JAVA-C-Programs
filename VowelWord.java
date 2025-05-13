import java.util.*;
class VowelWord
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence : ");
        String s=sc.nextLine()+' ',s1="";
        int l=s.length(),i=0,count=0,l1=0,j=0;
        char c,c1;
        for(i=0;i<l;i++)
        {
            c=s.charAt(i);
            if(c!=' ')
            s1=s1+c;
            else if(c==' ')
            {
                count=0;
                l1=s1.length();
                for(j=0;j<l1;j++)
                {
                   c1=s1.charAt(j);
                   if(c1=='A'||c1=='E'||c1=='I'||c1=='O'||c1=='U'||c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u')
                   count++;
               }
               System.out.println(s1+" has "+count+" no. of vowels . ");
               s1="";
            }
        }
    }
}