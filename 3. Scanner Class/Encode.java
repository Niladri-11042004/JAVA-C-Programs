import java.util.*;
class Encode
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a WORD :- ");
        String s=sc.next();
        System.out.println("Enter move = ");
        int move=sc.nextInt();
        int l=s.length(),i=0,t=0;
        char c;
        String st="";
        for(i=0;i<l;i++)
        {
            c=s.charAt(i);
            t=(int)c;
            if(move!=0)
            {
                t+=move;
                if(t>90)
                t-=26;
                if(t<65)
                t+=26;
            }
            c=(char)t;
            st+=c;
        }
        System.out.println("encoded Sentence : "+st);
    }
}