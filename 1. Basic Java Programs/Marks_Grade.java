class Marks_Grade
{
    public static void main(int a,int b,int c,int d)
    {
        int t;
        double av;
        t=a+b+c+d;
        System.out.println("the total is "+t);
        av=(a+b+c+d)/4;
        System.out.println("the average is "+av);
         if (av >= 80 && av<=100)
        {
            System.out.println("the grade is A+");
        }
         else if( av >= 60 && av<=79)
        {
            System.out.println("the grade is A");
        }
         else if(av >=40 && av<=59)
        {
             System.out.println("the grade is B");
        }
         else if(av >=20 && av<=39)
        {
            System.out.println("the grade is C");
        }
         else
        {
            System.out.println("you have failed");
        }
    }
}    