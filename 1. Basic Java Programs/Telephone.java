class Telephone
{
    public static void main(double omr,double cmr)
    {
        double c=cmr-omr;
        double s=c;
        
        if(c<=100)
        {
           c=300;
        }
        else if(c>100&&c<=150)
        {
            c=(300)+(c-100)*0.80;
        }
        else if(c>150&&c<=225)
        {
            c=(300)+(50*0.80)+(c-150)*0.60;
        }
        else if(c>225)
        {
            c=(300)+(50*0.80)+(75*0.60)+(c-225)*0.50;
        }
        System.out.println("the number of calls made is"+s);
        System.out.println("the telephone bill is "+c);
    }
}
