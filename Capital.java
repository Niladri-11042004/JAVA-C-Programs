import java.util.*;
class Capital
{
    public static void main()
    {
        String co[]={"India","United States","Pakistan","Bangladesh","Japan","England"};
        String ca[]={"Delhi","Washington DC","Islamabad","Dhaka","Tokyo","London"};
        int i,d=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter Name of Country");
        String c=obj.nextLine();
        for(i=0;i<6;i++)
        {
            if(c.equalsIgnoreCase(co[i]))
            {
                d=d+1;

                System.out.println("COUNTRY"+"          "+"CAPITAL");
                System.out.println(co[i]+"            "+ca[i]);
            }
        }
        if(d==0)
        {
            System.out.println("Country Not Available");
        }
    }
}

