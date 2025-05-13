class Amount
{
    public static void main(int amt)
    {
        int toh=amt/2000;
        amt=amt%2000;
        int fh=amt/500;
        amt=amt%500;
        int th=amt/200;
        amt=amt%200;
        int h=amt/100;
        amt=amt%100;
        int fif=amt/50;
        amt=amt%50;
        int twi=amt/20;
        amt=amt%20;
        int ten=amt/10;
        amt=amt%10;
        int fiv=amt/5;
        amt=amt%5;
        int two=amt/2;
        amt=amt%2;
        int one=amt/1;
        amt=amt%1;
        System.out.println("2000 = "+toh );
        System.out.println("500 ="+fh);
        System.out.println("200 = "+th);
        System.out.println("100 = "+h);
        System.out.println("50 = "+fif);
        System.out.println("20 = "+twi);
        System.out.println("10 = "+ten); 
        System.out.println("5 = "+fiv);
        System.out.println("2 = "+two);
        System.out.println("1 = "+one);
    }
}
        