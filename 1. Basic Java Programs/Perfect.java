class Perfect
{
    public static void main(int n)
    {
        int i=1,sum=0;
        while(i<n)
        {
            if(n%i==0)
                sum=sum+i;
            i++;
        }
        if(sum==n)
            System.out.println("perfect no.");
        else
            System.out.println("not a perfect no.");
    }
}