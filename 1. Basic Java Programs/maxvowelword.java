
class maxvowelword
{
    public static void main(String s)
    {
        s=s+' ';
        int l=s.length(),i=0,j=0,max=0,count =0,l1=0;
        char c,c1;
        String st="",maxS="";
        for(i=0;i<l;i++)
        {
            c1=s.charAt(i);
            if(c1!=' ')
            st=st+c1;
            else if(c1==' ')
            {
                l1=st.length();
                for(j=0;j<l1;j++)
                {
                    c=s.charAt(j);
                    if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                    count++;
                }
                if(count>max)
                {
                    max=count;
                    maxS=st;
                }
                count=0;
                st="";
            }
        }
        System.out.println("The words that has maximum no. of vowels are = "+maxS+"\n"+"No. of vowels in the word is : "+max);
    }
}