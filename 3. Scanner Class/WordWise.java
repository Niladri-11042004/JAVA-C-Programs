import java.util.*;
class WordWise
{
    String str;
    WordWise()
    {
        str="";
    }
    public void readsent()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sentence = ");
        str=sc.nextLine();
    }
    public int freq_vowel(String w)
    {
        int l1=w.length(),i=0,freq=0;
        char c1;
        for(i=0;i<l1;i++)
        {
            c1=w.charAt(i);
            if(c1=='A'||c1=='E'||c1=='I'||c1=='O'||c1=='U'||c1=='a'||c1=='e'||c1=='i'||c1=='o'||c1=='u')
            freq++;
        }
        return freq;
    }
    public void arrange()
    {
        str+=" ";
        int l=str.length(),i=0,f=0;
        char c;
        String st="";
        System.out.println("WORDS\tFREQUENCY");
        for(i=0;i<l;i++)
        {
            c=str.charAt(i);
            if(c==' ')
            {
                f=freq_vowel(st);
                System.out.println(st+"\t"+f);
                st="";
            }
            else
            st+=c;
        }
    }
    public static void main()
    {
        WordWise wd=new WordWise();
        wd.readsent();
        wd.arrange();
    }
}