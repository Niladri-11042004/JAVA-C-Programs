class Fibonacci
{
    public static void main()
    {
        int a=1,b=1,c=0,count=0;
        
        System.out.println("the non prime fibonacci no. s are: ");
        for(int i=1;i<=20;i++)
        {
            count=0;
            c=a+b;
            for( i=1;i<=c;i++)
            { if(c%i==0)
              count=count + 1;
            }//end of for
      if(count>2)
      System.out.println(c) ;
            a=b;
            b=c;
        }
    }
}