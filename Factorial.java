class Factorial
{
    public static void main(int n)
    {
        int i=1,mul=1;
        while(i<=n)
        {
            mul=mul*i;
            i++;
        }
        System.out.println("the factorial number of "+n+ " is "+mul);
    }
}
