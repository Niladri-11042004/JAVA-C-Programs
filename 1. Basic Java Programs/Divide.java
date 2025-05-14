class Divide
{
    public static void main(int a,int b)
    {
        int h=Math.max(a,b);
        int l=Math.min(a,b);
        int ctr=0;
        while(h>=l)
        {
            ctr++;
            h=h-l;
        }
        System.out.println("The quotient  = "+ctr);
        System.out.println("The remainder  = "+h);
    }
}