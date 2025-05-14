import java.util.*;
class Amuzement
{ public static void main()
    { int ch,age,c=0,total=0,cost=0;
      Scanner sc=new Scanner(System.in); 
      do
      { System.out.println("enter the age : ");
        age=sc.nextInt();
        if(age<=3)
        cost=0;
        else if(age>3&&age<=10)
        cost=300;
        else if(age>10&&age<=17)
        cost=500;
        else if(age>17&&age<=25)
        cost=700;
        else if(age>25&&age<=40)
        cost=900;
        else if(age>40&&age<=50)
        cost=500;
        else if(age>50&&age<=60)
        cost=300;
        else if(age>60)
        cost=900;
        System.out.println("the cost is Rs. "+ cost);
        c++;
        total=total+cost;
        System.out.println("Do you proceed , if yes enter 1, otherwise enter any no.");
        ch=sc.nextInt();
      }while(ch==1);
      System.out.println("the no. of entry is : "+c);
      System.out.println("the total amount of money collected is : "+total);
    }
}