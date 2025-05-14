class StringASCII
{
    public static void main(String s)
    {
        int l=s.length(),i=0,as=0;
        char c=' ',c1=' ';
        String s1="";
        s=s.toLowerCase();
        for(i=0;i<l;i++)
        {
            c=s.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                as=(int)c+1;
                c1=(char)as;
                s1+=c1;
            }
            else
            s1+=c;
        }
        System.out.println(s1);
    }
}