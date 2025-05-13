class Big
{
    public static void main(int a , int b , char c)
    {
        if(a>b)
        {
            double d1=a-b;
            System.out.println("the difference is "+d1);
            
            if(d1==0)
            {
                double sr=Math.sqrt(a);
                System.out.println("the sqare root is "+sr);
            }
            else if(d1>0)
            {
                double cb=Math.sqrt(b);
                System.out.println("the cube root is "+cb);
            }
        }
        else if(b>a)
        {
            double d2=b-a;
            System.out.println("the difference is "+d2);
            if(d2==0)
            {
                double sr1=Math.sqrt(b);
                System.out.println("the sqare root is "+sr1);
            }
            else if(d2>0)
            {
                double cb1=Math.cbrt(a);
                System.out.println("the cube root is "+cb1);
            }
        }
        switch(c)
        {
            case 'A':int proo=a*b;
                     System.out.println("the area is "+proo);
                     break;
            case 'B':int sum=2*(a+b);
                     System.out.println("the perimeter is "+sum);
                     break;
        }         
    }
}