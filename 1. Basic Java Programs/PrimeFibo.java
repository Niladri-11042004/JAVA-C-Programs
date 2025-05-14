class PrimeFibo
{ public static void main()
    { int flag=1,a=1,b=1,c=0;
      for(int i=1;i<=20;i++)
       {   flag=1;
           c=a+b;
           for(int j=2;j<c;j++)
           { if(c%j==0)
             { flag=0;
                break;
             }
           }
           if(flag==1)
           System.out.println(c);
           
           a=b;
           b=c;
        }
    }
}
