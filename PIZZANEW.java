import java.io.*;
public class PIZZANEW
{
    public static void main()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String title="******************WELCOME TO PIZZA HUB*****************";
        String list[]=new String[6];//for Storing Food names.
        list[0]="cm1";
        list[1]="cm2";
        list[2]="cm3";
        String place[]=new String[6];
        String str="";//for Storing place names.
        place[0]="SHYAMBAZAR";
        place[1]="PARK STREET";
        place[2]="BEHALA";
        place[3]="SOUTH DUMDUM";
        String placeN,choice,size,name,address;//declaration of String variables
        String ans="Q";String ans1="Q";
        int nettotal=0;
        int tot_bvrg=0;
        int tot_snck=0;
        int flag=0,flag1=0,flag2=0,flag3=0,flag4=0,catg,quantity,date,bvrg,snck,fd;
        int tot_fd=1,tot_d,d,ch;
        long mobile;
        String m="";
        do
        {
            System.out.println();   
            System.out.println("***************************************************");
            System.out.println("*********WELCOME TO PIZZA HUB*********");
            System.out.println("***************************************************");
            System.out.println("Enter Your Name ");
            name=br.readLine();
            System.out.println("Enter Your Address");
            address=br.readLine();
            System.out.println("Enter Your Telephone no");
            mobile=Long.parseLong(br.readLine());
            System.out.println("        PIZZA HUB OUTLETS");
            System.out.println("        1.SHYAMBAZAR");
            System.out.println("        2.PARK STREET");
            System.out.println("        3.BEHALA");
            System.out.println("        4.SOUTH DUMDUM");
            do
            {
                if(flag>0)
                    System.out.println("** INVALID INPUT ! TRY AGAIN **");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("*******************************");
                System.out.println();
                System.out.print("ENTER THE NEAREST OUTLET NAME :");
                placeN=br.readLine();
                for(int i=0;i<4;i++)
                {
                    if(place[i].equalsIgnoreCase(placeN))
                    {
                        flag=0;
                        break;
                    }
                    else
                        flag++;
                }
            }
            while(flag!=0);
            //System.out.println("\f");//to clear the screen for next window
            System.out.println(title);
            System.out.println("*************************************************");
            System.out.println("<<<****** SELECT YOUR CATEGORY**************>>>");
            do
            {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("    ** 1.PIZZA HUB "+placeN+" ONLY VEG **");
                System.out.println("    ** 2.PIZZA HUB "+placeN+" NON VEG **");
                System.out.println();
                System.out.print("ENTER THE NUMBER OF YOUR CHOICE :");
                catg=Integer.parseInt(br.readLine());
                if((catg==1)||(catg==2))
                    flag1=0;
                else
                {
                    System.out.println("*** INVALID INPUT *** PLEASE TRY AGAIN");
                    flag1++;
                }
            }while(flag1!=0);
            System.out.println(title);
            System.out.println("*********************************************************");
            //System.out.println("\f");//to clear the screen for next window
            System.out.println(title);
            System.out.println("              HOME DELIVERY IS ALSO AVAILABLE !");
            System.out.println("              CONTACT==022-39883988 FROM YOUR MOBILE");
            System.out.println("              VISIT:http://www.pizzahub.com");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("         <<< SELECT YOUR DAY FOR THE OFFER>>>"       );
            do
            {
                System.out.println("          ** 1. SUNDAY    **");
                System.out.println("          ** 2. MONDAY    **");
                System.out.println("          ** 3. TUESDAY   **");
                System.out.println("          ** 4. WEDNESDAY **");
                System.out.println("          ** 5. THURSDAY  **");
                System.out.println("          ** 6. FRIDAY    **");
                System.out.println("          ** 7. SATURDAY  **");
                System.out.print("              ENTER THE NUMBER FOR YOUR DAY :");
                date=Integer.parseInt(br.readLine());
                if((date>=1)&&(date<=7))
                    flag2=0;
                else
                {
                    System.out.println("*** INVALID INPUT *** PLEASE TRY AGAIN");
                    flag2++;
                }
            }
            while(flag2!=0);
            // System.out.println("\f");//to clear the screen for next window
            System.out.println(title);
            System.out.println("*********************************************************");
            System.out.println("<<< PLEASE ENTER THE NUMBER OF PERSONS/PACKS >>>");
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("ENTER THE NUMBER OF PACKS :");
            quantity=Integer.parseInt(br.readLine());
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            // System.out.println("\f");//to clear the screen for next window
            System.out.println(title);
            System.out.println("*********************************************************");
            if(catg==1)
            {
                System.out.println("<<< COMBO SELECTION >>>");
                do
                {
                    if(flag3>0)
                        System.out.println("*** INVALID INPUT *** PLEASE TRY AGAIN");
                    System.out.println("************************** INTRODUCING ***************************");
                    System.out.println("   COMBO MEAL      CODE    ");
                    System.out.println("   ----------      ----    ");
                    System.out.println("COMBO VEG MEAL1   cm1   VEG BAKED PASTA+PEPSI");
                    System.out.println("COMBO VEG MEAL2   cm2   PIZZA +GARLIC BREAD+PEPSI");
                    System.out.println("COMBO VEG MEAL3   cm3   PIZZA +DESSERT+PEPSI  ");
                    System.out.println();
                    System.out.print("ENTER THE CODE OF YOUR SELECTED COMBOS :");
                    choice=br.readLine();
                    for(int i=0;i<=2;i++)
                    {
                        if(list[i].equalsIgnoreCase(choice))
                        {
                            flag3=0;   
                            break;
                        }
                        else
                            flag3++;
                    }
                }while(flag3!=0);
                System.out.println();
                System.out.println("<<< PLEASE COLLECT YOUR BILL >>>");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("The Total Cost is Rs. "+(quantity*199));
                System.out.print("Your Order No is ");
                for(int i=1;i<=quantity;i++)
                {
                    System.out.print("01");
                }
                System.out.println();
            }
            if(catg==2)
            {
                System.out.println("<<< COMBO SELECTION >>>");
                do
                {
                    if(flag3>0)
                        System.out.println("*** INVALID INPUT *** PLEASE TRY AGAIN");
                    System.out.println("       ***** INTRODUCING *****");
                    System.out.println("   COMBO MEAL          CODE        ");
                    System.out.println("   ----------          ----           ");
                    System.out.println("   COMBO NON VEG MEAL1  cm1   NON VEG BAKED PASTA+PEPSI");
                    System.out.println("   COMBO NON VEG MEAL2  cm2   CHICKEN PIZZA +GARLIC BREAD+PEPSI");
                    System.out.println("   COMBO NON VEG MEAL3  cm3   CHICKEN PIZZA +DESSERT+PEPSI  ");
                    System.out.println();
                    System.out.println();
                    System.out.print("ENTER THE CODE OF YOUR COMBO :");
                    choice=br.readLine();
                    for(int i=0;i<2;i++)
                    {
                        if((i==2)||(i==9)||(i==12)||(i==16))
                            i++;
                        if(list[i].equalsIgnoreCase(choice))
                        {
                            flag3=0;
                            break;
                        }
                        else
                            flag3++;
                    }
                }
                while(flag3!=0);
                System.out.println();
                System.out.println("<<< PLEASE COLLECT YOUR BILL >>>");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Food Selected :"+choice);
                System.out.println("The Total Cost is Rs. "+(quantity*299));
                System.out.print("Your Order Number is ");
                for(int i=1;i<=quantity;i++)
                {
                    System.out.print("01");
                }
                System.out.println();
            }

            System.out.println();
            System.out.println("TO PROCEED TO NEXT COUNTER 'Q'");
            ans=br.readLine();
            //System.out.println("\f");//to clear the screen for next window
            System.out.println(title);
            do
            {
                System.out.println("*********** WELCOME TO PIZZA HUB ************");
                System.out.println("********** STALL 1: CHILLED BEVERAGES   **********");
                System.out.println("     1. COCA COLA");
                System.out.println("     2. SEVEN UP");
                System.out.println("     3. PEPSI");
                System.out.println("     4. 7 UP");
                System.out.println("     5. SPRITE ");
                String flagC1=new String();    
                System.out.print("DO YOU WANT YO BUY ANYTHING HERE ?(Y/N):");
                flagC1=br.readLine();
                if(flagC1.equalsIgnoreCase("Y"))
                {
                    System.out.print("CHOOSE YOUR BEVERAGE ");
                    System.out.print("ENTER THE NUMBER :");
                    bvrg=Integer.parseInt(br.readLine());
                    System.out.print("ENTER THE TOTAL NUMBER YOU WANT TO BUY :");
                    tot_bvrg=Integer.parseInt(br.readLine());
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("<<< STALL 1 BILL >>>");
                    if (bvrg>=1 && bvrg<=5)
                        System.out.println("TOTAL COST IS RS."+(tot_bvrg*45));
                    System.out.println();
                    if(bvrg>=6 && bvrg<=10)
                        System.out.println("TOTAL COST IS RS."+(tot_bvrg*90));
                }
                else
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("<<< STALL 2 >>>");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("************* SECTION : ONLY PIZZAS *************");
                System.out.println("18. Margherita Veg Pizza");
                System.out.println("19. Plain Cheese Pizza");
                System.out.println("20. Ultimate Veg Pizza");
                System.out.println("21. Delux Margherita Veg Pizza ");
                System.out.println("22. Spicy Chicken Pizza ");
                System.out.println("23. Ultimate Chicken Pizza");
                System.out.println("24. Delux Margherita Chicken Pizza ");
                System.out.println("25. Honey Pepper Chicken Pizza ");
                System.out.println("26. Pizza Hut Special Pizza ");
                System.out.println("27. BBQ Chicken Pizza ");
                String flagC2=new String();
                System.out.println();
                System.out.print("DO YOU WANT YO BUY ANYTHING HERE ?(Y/N):");
                flagC2=br.readLine();
                System.out.println();
                if(flagC2.equalsIgnoreCase("Y"))
                {
                    System.out.println("CHOOSE YOUR SNACK BY ENTERING THE NUMBER");
                    snck=Integer.parseInt(br.readLine());
                    System.out.println();
                    System.out.println("ENTER THE TOTAL NUMBER OF SNACKS YOU WANT TO BUY");
                    tot_snck=Integer.parseInt(br.readLine());
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println();
                    System.out.println("<<< STALL 2 BILL >>>");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    if(snck>=18 && snck<=21)
                    {
                        System.out.println("ENTER 'S' FOR SMALL,'M' FOR MEDIUM,'L' FOR LARGE");
                        size=br.readLine();
                        if(size.equalsIgnoreCase("S"))
                            System.out.println("TOTAL COST IS RS."+tot_snck*90);
                        else if(size.equalsIgnoreCase("M"))
                            System.out.println("TOTAL COST IS RS."+tot_snck*110);
                        else if(size.equalsIgnoreCase("L"))
                            System.out.println("TOTAL COST IS RS."+tot_snck*130);
                    }
                    else if(snck>=22 && snck <=23)
                        System.out.println("TOTAL COST IS RS."+tot_snck*140);
                    else if(snck>=24 && snck <=25)
                        System.out.println("TOTAL COST IS RS."+tot_snck*165);
                    else if(snck>=26 && snck <=27)
                        System.out.println("TOTAL COST IS RS."+tot_snck*175);
                }
                System.out.println();
                System.out.println("TO QUIT BUYING FOOD ENTER 'Q'");
                ans1=br.readLine();
            }while((ans1.equalsIgnoreCase("Q"))!=true);
            //System.out.println("\f");//to clear the screen for next window
            System.out.println(title);
            System.out.println("*********************************************************");
            System.out.println();
            System.out.println("<<< CONFIRM OR CANCEL ORDER >>>");
            do
            {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("1. TO CANCEL  ORDER");
                System.out.println("2. TO CONFIRM ORDER");
                System.out.print("ENTER YOUR CHOICE NUMBER :");
                ch=Integer.parseInt(br.readLine());
                if(ch==1)
                {
                    System.out.println(name);   
                    System.out.println("YOU HAVE CHOOSEN TO CANCEL YOUR ORDER");
                    flag4=0;
                    cancel();
                }
                else if(ch==2)
                {
                    System.out.println("** YOUR ORDER IS CONFIRM DETAILS ARE GIVEN BELOW **");
                    System.out.println("               ** THANK YOU **        ");
                    System.out.println("Name        :"+name);
                    System.out.println("Address     :"+address);
                    System.out.println("Telephone   :"+mobile);
                    System.out.println("Order No    :010101");
                    flag4=0;
                }
                else
                {
                    System.out.println(" ### INVALID CHOICE ###");
                    flag4++;
                }
            }
            while(flag4!=0);
        }
        while(ans1.equalsIgnoreCase("Q")!=true);
    }

    public static void cancel() throws Exception
    {
        System.out.println("YOUR ORDER HAVE BEEN SUCCESSFULLY CANCELLED");
    }
}//END OF CLASS
