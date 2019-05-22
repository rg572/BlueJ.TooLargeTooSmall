
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.util.Random;

public class Main
{
    
    private int num;
    private int guessCounter;
    private int guess;
    private int prevGuess;
    
    private Random randGen;
    
    private Scanner sc;

    /**
     * Constructor for objects of class Main
     */
   
    public Main()
    {
        randGen = new Random();
        sc = new Scanner(System.in);
        
        

    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void playGame()
    {
        num = randGen.nextInt(9);
        guess = -1;
        guessCounter = 0;
        System.out.print("Guess a number between 0 and 9: ");
        while(guess != num){
            prevGuess = guess;
            guess = getGuess();
            if(guess == prevGuess){
                System.out.println("You just guessed that!");
            } 
            else {
                guessCounter++;
                if(guess > num){
                    System.out.print("Too high. Guess again: ");
                }
                else if(guess < num){
                    System.out.print("Too low. Guess again: ");
                }
            }
        }
        System.out.println("Congratulations!");
        if(guessCounter == 1){
            System.out.println("You got it on the first try!");
        }
        else {
            System.out.printf("It took you %d tries to get it!\n",guessCounter);
        }
        System.out.println("Wasn't that fun?");
    }
    
    public int getGuess(){
        boolean validGuess = false;
        int theGuess = -1;
        while(!validGuess){
            theGuess = sc.nextInt();
            if(theGuess > -1 && theGuess < 10){
                validGuess = true;
            }
            else {
                System.out.print("Invalid guess. Try again: ");
            }
        }
        System.out.println("Guess is " + theGuess);
        return theGuess;
       
    }
    
    public void reset(){
        sc.nextLine();
    }
}
