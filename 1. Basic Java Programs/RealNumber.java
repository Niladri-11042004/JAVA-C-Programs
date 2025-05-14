class RealNumber
{
    public static void main(double n,int choice)
    {
        System.out.println("the choice is "+choice);
        switch(choice)
        {
            case 1:int n1=(int)n;
                   System.out.println("the integer part is "+n1);
                   double d=(n-n1);
                   System.out.println("the fraction part is "+d);
                   break;
            case 2:double n2=Math.cbrt(n);
                   System.out.println("the cube root is "+n2);
                   break;
            default:System.out.println("the incorrect choice ");   
        }
    }
}    