import java.util.*;
//Ankur Saha 12sc roll 26
class DateTime
{
    static int Day1to12[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};//class variable so static
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Date 1");
        String dt1=sc.next();
        System.out.println("Enter date 2");
        String dt2=sc.next();
        int d1,m1,y1;
        d1=Integer.parseInt(dt1.substring(0,dt1.indexOf('/')));
        m1=Integer.parseInt(dt1.substring(dt1.indexOf('/')+1,dt1.lastIndexOf('/')));
        y1=Integer.parseInt(dt1.substring(dt1.lastIndexOf('/')+1,dt1.length()));
        int d2,m2,y2;
        d2=Integer.parseInt(dt2.substring(0,dt2.indexOf('/')));
        m2=Integer.parseInt(dt2.substring(dt2.indexOf('/')+1,dt2.lastIndexOf('/')));
        y2=Integer.parseInt(dt2.substring(dt2.lastIndexOf('/')+1,dt2.length()));
        boolean valid1,valid2;
        valid1=check(d1,m1,y1);
        valid2=check(d2,m2,y2);
        int dd,dm,dy;
        String M[]={"Jan","Feb","March","April","May","June","July","Aug","Sept","Oct","Nov","Dec"};
        if(valid1==true)
        {
            System.out.println("Date 1= ");
            System.out.print(d1+"th "+M[m1-1]+" "+y1+"\n");
        }
        if(valid2==true)
        {
            System.out.println("Date 2= ");
            System.out.print(d2+"th "+M[m2-1]+" "+y2+"\n");
        }
        if(valid1==true&&valid2==true)
        {
           int diff=getDiff(d1 , m1 , y1 , d2 , m2 , y2);
            System.out.println("Differnce is = "+"\n"+diff+"days");
        }

        else
            System.out.println("Invalid dates");
    }//main ends
    public static boolean check(int d,int m,int y)// method to check validity
    {
        int yt=y,c=0;
        boolean v=false;
        while(yt>0)
        {
            c++;
            yt/=10;
        }
        if(c==4)
        {
            if((m==1||m==3||m==5||m==7||m==8||m==10||m==12)&&(d>=1&&d<=31))
                v= true;
            if((m==4||m==6||m==9||m==11)&&(d>=1&&d<=30))
                v=true;
            if((m==2)&&(d==29))
            {
                if((y%4==0&&y%100!=0)||y%400==0)
                    v=true;
                else
                    v=false;
            }
            if(m==2&&(d>=1&&d<=28))
            {
                v=true;
            }
        }
        else
            v=false;
        return v;
    }//check ends
    public static int countLeapYear(int d , int m , int y)//for leap year check
    {
        int years = y;
        if (m <= 2) // Check if the current year needs to be considered for the count of leap years or not
        {
            years--;
        }
        int x=(years / 4) - (years / 100) + (years / 400);
        return x;//leap year is a multiple of 4,400 and not of 100.
    }//End of countLeapYears()
    public static int getDiff(int d1,int m1, int y1 , int d2 , int m2 , int y2)//returns difference between dates 
    {
        // COUNT TOTAL NUMBER OF DAYS BEFORE FIRST DATE 1
        int i=0;
        int n1 = (y1 * 365) + d1;// initialize count using years and day
        for (i = 0; i < m1 - 1; i++) // Add days for months in given date
        {
            n1 += Day1to12[i];
        } 
        n1 += countLeapYear(d1 , m1 , y1);// Since every leap year is of 366 days, add a day for every leap year
        // SIMILARLY, COUNT TOTAL NUMBER OF DAYS BEFORE DATE 2
        int n2 = (y2 * 365) + d2;
        for (i = 0; i < m2- 1; i++)
        {
            n2 += Day1to12[i];
        }
        n2 += countLeapYear(d2 , m2 , y2);
        int dif=Math.abs((n2 - n1));
        return dif;// return difference between two counts
    }//End of getDifference()
}//end of class.