class Magic 
{
    public static void main(int n)
    {
        int s=n;
        int sum=0;
        for(;n>0||sum>9;n=n/10)
        {
            if(n==0)
            {
                n=sum;
                sum=0;
            }
            sum=sum+(n%10);
        }
        if(sum==1)
        System.out.println(s+" is a magic number");
        else
        System.out.println(s+" is not a magic number");
    }
}