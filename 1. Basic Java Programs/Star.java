class STAR
{
    public static void main()
    {
        int i,j,k,x,y,z,c1=1,c2=7,p=1;
        for(i=1;i<=9;i+=2)
        {
            for(j=9;j>i;j--)
            System.out.print(" ");
            for(k=1;k<=c1;k++)
            System.out.print("*"+" ");
            System.out.println();
            c1+=2;
        }
       
        for(x=7;x>=1;x--)
        {
            for(y=p;y>1;y--)
            System.out.print("  ");
            for(z=c2;z>=1;z--)
            System.out.print(" *");
            System.out.println();
            c2-=2;
            p++;
        }
    }
}