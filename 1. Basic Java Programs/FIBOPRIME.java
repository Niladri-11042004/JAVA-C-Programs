class FIBOPRIME
{ 
  public static void main()
  {
        int a=0,b=1,c=0,count=0;
        for(int i=1;i<=20;i++)
        {   count=0;
            c=a+b;
            for(int j=1;j<=c;j++)
            {
            if(c%j==0)
            count=count+1;
            }
            if(count==2)
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}