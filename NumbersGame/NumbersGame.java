package NumbersGame;

import java.util.*;

public class NumbersGame {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        numbersGame();
        OUTER:
        while (true) {
            System.out.println("Do you want to play again?(Y/N)");
            char c= input.next().charAt(0);
            switch (c) {
                case 'Y':
                case 'y':
                    numbersGame();
                    break;
                case 'N':
                case 'n':
                    break OUTER;
                default:
                    System.out.println("Enter a valid character.");
                    break;
            }
        }
    }
    public static int generateRandom(){
        Random random = new Random();
        int n = random.nextInt(100) + 1;
        return n;
    }
    
    public static void numbersGame(){
        Scanner input= new Scanner(System.in);
        int maxGuesses= 10;
        int score= 100;
        int n= generateRandom();
        while(true){
            if(maxGuesses == 0){
                System.out.println("Game Over...");
                break;
            }
            System.out.print("You have "+maxGuesses+" attempts left, Please guess the number: ");
            int guess= input.nextInt();
            if(guess == n){
                System.out.println("Congratulations, you have guessed the right number("+n+"), your final score is: "+score+".");
                break;
            }
            else if(guess < n){
                System.out.println("The number you guessed is too low, try guessing higher.");
                maxGuesses--;
                score-= 10;
            }
            else{
                System.out.println("The number you guessed is too high, try guessing lower.");
                maxGuesses--;
                score-= 10;
            }
        }
    }
}
