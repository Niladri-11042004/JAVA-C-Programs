class Paterrnn
{ 
    public static void main()
    { 
        for(int i=9;i>=1;i-=2)
        { 
            for(int j=i;j<9;j+=2)
                System.out.print(" ");
            for(int k=i;k>=1;k-=2)
                System.out.print(k);
            System.out.println(); 
        }
    }
}