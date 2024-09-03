package other_codes;

import java.util.Scanner;

public class GuessTheNumber {
	
	public static void guessingNumberGame(){
		
        Scanner sc = new Scanner(System.in);
     
        System.out.print("Enter the number to guess between : ");
        int n = sc.nextInt();
        
        
        int number = 1 + (int)(n * Math.random());
 
        int K = 3;
 
        int i, guess;
 
        System.out.println("A number is chosen"+ " between 1 to "+n+ " Guess the number"+" within 3 trials.");
 
        
        for (i = 0; i < K; i++) { 
            System.out.print("Guess the number:");
            guess = sc.nextInt();
            
            if (number == guess) {
                System.out.println("Congratulations!"+ " You guessed the number.");
                break;
            }
            else if (number > guess && i != K - 1) {
                System.out.println("The number is " + "greater than " + guess);
            }
            else if (number < guess && i != K - 1) {
                System.out.println("The number is" + " less than " + guess);
            }
        }
 
        if (i == K) {
            System.out.println("You have exhausted" + " K trials.");
 
            System.out.println("The number was " + number);
        }
    }

	public static void main(String[] args) {
		
		guessingNumberGame();

	}

}
