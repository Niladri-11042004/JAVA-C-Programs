class CONSECUTIVE
{
    public static void main(String s)
    {
        int l=s.length(),i=0,d=0,d1=0;
        char c=' ',c1=' ';
        for(i=0;i<l-1;i++)
        {
            c=s.charAt(i);
            c1=s.charAt(i+1);
            d=(int)c-(int)c1;
            d1=Math.abs(d);
            if(d1==1)
            System.out.println(c+" "+c1+" are consecutive letters. ");
        }
    }
}