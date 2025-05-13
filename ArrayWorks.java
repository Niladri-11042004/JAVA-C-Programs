import java.util.*;
class ArrayWorks
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        String N[]=new String[5];
        int M[][]=new int[5][5];
        String S[]={"ENGLISH","HINDI","MATHS","SCIENCE","COMPUTER"};
        int i=0,j=0,k=0,t=0,c=1;
        for(i=0;i<5;i++)
        {
            System.out.println("Enter name "+(i+1));
            N[i]=sc1.nextLine();
        }
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                System.out.println("Enter marks of "+S[j]+" of "+N[k]);
                M[i][j]=sc.nextInt();
            }
            k++;
        }
        System.out.println("enter name to be searched = ");
        String n=sc1.nextLine();
        for(i=0;i<5;i++)
        {
            if(N[i].compareTo(n)==0)
            {
                System.out.println("Name found");
                System.out.println("Name = "+N[i]);
                System.out.println("english = "+M[i][0]);
                System.out.println("hindi = "+M[i][1]);
                System.out.println("maths = "+M[i][2]);
                System.out.println("science = "+M[i][3]);
                System.out.println("computer = "+M[i][4]);
                t=M[i][0]+M[i][1]+M[i][2]+M[i][3]+M[i][4];
                System.out.println("total = "+t);
                c=0;
                break;
            }
        }
        if(c==1)
        System.out.println("Name not found");
    }
}
