class Armstrong
{
    public static void main(int n)
    {
        int c,a,temp;
        c=0;
        
        temp=n;
    while(n>0)
    {
        a=n%10;
        n=n/10;
        c=c+(a*a*a);
    }
    if((temp==c))
    {
        System.out.println("armstrong no.");
    }
    else
    {
       System.out.println("not a armstrong no.");
    }
    }
    
}
      
        