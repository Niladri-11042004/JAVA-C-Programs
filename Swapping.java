class Swapping
{ 
    public static void main (int x,int y)
    {
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("the value of x is: "+x);
        System.out.println("the value of y is: "+y);
    }
}