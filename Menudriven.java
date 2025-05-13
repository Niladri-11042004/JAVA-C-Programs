import java.io.*;
class Menudriven
{ public static void main()throws IOException
    { BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("enter choice");
        int c=Integer.parseInt(br.readLine());
        System.out.println("enter the number");
        int n=Integer.parseInt(br.readLine());
        int sn=n;
        switch(c)
        { case 1:{ int flag=0;
                    for(int i=2;i<n;i++)
                    { if(n%i==0)
                            flag=1;
                        break;
                    }
                    if(flag==1)
                        System.out.println(n+" is a composite number");
                    else
                        System.out.println(n+" is not a composite number"); 
                }
                break;
            case 2:{int digit=0,sum=0;
                    while(sn>9)
                    { sum=0;
                        while(sn>0)
                        { digit=sn%10;
                            sum=sum+(digit*digit);
                            sn=sn/10;
                        }
                        sum=sn;
                    }
                    if(sn==1)
                        System.out.println(n+" is a happy number");
                    else
                        System.out.println(n+" is not a happy number");
                }
                break;
            default:System.out.println("wrong choice"); 
        }
    }
}      