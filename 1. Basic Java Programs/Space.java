class Space
{ public static void main()
    { for(int i=1;i<=5;i++)
        { for(int j=5;j>i;j--)
          System.out.print(" ");
          for(int k=i;k>0;k--)
          System.out.print(k);
          
          System.out.println();
        }
        }
    }