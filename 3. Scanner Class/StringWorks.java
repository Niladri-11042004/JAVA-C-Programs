import java.util.*;
class StringWorks
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter sentence = ");
        String s=sc.nextLine()+" ";
        int l=s.length(),i=0;
        char c,cF,cL;
        String st="";
        boolean u,la;
        System.out.println("Words starting with upper case character and ending with lower case charcter are =");
        for(i=0;i<l;i++)
        {
            c=s.charAt(i);
            if(c==' ')
            {
                cF=st.charAt(0);
                cL=st.charAt(st.length()-1);
                u=Character.isUpperCase(cF);
                la=Character.isLowerCase(cL);
                if(u==true && la==true)
                System.out.print(st+" ");
                st="";
            }
            else
            st+=c;
        }
    }
}