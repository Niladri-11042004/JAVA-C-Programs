import java.util.*;
class Char_Int_Star
{
    public void main()
    {
        int i,j,z=0,k;
        char c='A';
        for(i=5;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                if(i==j)
                System.out.print("*");
                else
                System.out.print(j);
            }
            c='A';
            for(k=1;k<=z;k++,c++)
            System.out.print(c);
           System.out.println();
           z++;
        }
    }
}
