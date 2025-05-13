class Taxi_fare
{
    public static void main(int d)
    {
        int f=0;
        if(d<=2)
        {
           f=35;
            
        }
        else if(d>2&&d<=10)
        {
            f=(35)+(d-2)*10;
            
        }
        else if(d>10&&d<=15)
        {
            f=(35) + (8*10)+(d-10)*12;
            
        }
        else if(d>15&&d<=20)
        {
            f=(35)+(8*10)+(5*12)+(d-15)*15;
            
        }
        else if(d>20)
        {
            f=(35)+(8*10)+(5*12)+(5*15)+(d-20)*17;
            
        }
        System.out.println("the fare is"+f);
    }
}
    