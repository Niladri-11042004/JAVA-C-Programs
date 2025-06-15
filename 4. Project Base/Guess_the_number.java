/* 
Create a class Game, which allows a user to play "Guess the Number" game once. Game should have the following methods: 
1. Constructor to generate the random number 
2. takeUserInput() to take a user input of number 
3. isCorrectNumber() to detect whether the number entered by the user is true 
4. *******getter and setter for noofGuesses ??*******
Use properties such as no0fGuesses(int), etc to get this task done!
 */
import java.util.*;
import java.util.Random;
class Game
{
    int noOfGuesses;
    int num;
    int toGuess;
    //default constructor
    public Guess_the_number()
    {
        Random rand = new Random();
        toGuess=rand.nextInt(100);
        noOfGuesses=1;
    }

    public void takeUserInput()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Guess a number : ");
        num=sc.nextInt();
    }

    public void isCorrectNumber()
    {
        if(num>toGuess)
        {
            noOfGuesses++;
            System.out.println("The number is too big");
        }
        else if(num<toGuess)
        {
            noOfGuesses++;
            System.out.println("The number is too small");
        }
        else if(num==toGuess)
        {
            System.out.println("Congratulations !! Your guess is corect...");
            System.out.println("Your Score is : " +noOfGuesses);
        }
    }

}
public class Guess_the_number
{
    public static void main(String[] args)
    {
        Guess_the_number guess = new Guess_the_number();
        guess.takeUserInput();
        while(guess.num!=guess.toGuess)
        {
            guess.isCorrectNumber();
            guess.takeUserInput();
        }
        guess.isCorrectNumber();
    }
}
