class Average
{
    public static void main(double m, double s,double ss,double l2)
    {
        double tm=m+s+ss+l2;
        double avg=tm/4.0;
        System.out.println("the total marks is "+tm);
        System.out.println("the average marks is "+avg);
        if(avg>=90&&avg<=100)
        System.out.println("A grade");
        else if(avg>=70&&avg<90)
        System.out.println("B grade");
        else if(avg>=50&&avg<70)
        System.out.println("C grade");
        else 
        System.out.println("D grade");
    }
}