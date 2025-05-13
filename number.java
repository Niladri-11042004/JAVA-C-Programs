class number
{
    void smfun(int x , int y)
    {
        if(x>1)
        { 
            if(x%y==0)
            {
                System.out.print(y+ "");
                smfun(x/y , y);
            }
            else
            smfun(x ,y + 1);
        }
     }
}