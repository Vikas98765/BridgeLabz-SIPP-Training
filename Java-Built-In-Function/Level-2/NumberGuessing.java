package BuiltInFunction;
	import java.util.Scanner;
	import java.util.Random;

	public class NumberQuessing {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Random rand = new Random();
	        int low = 1, high = 100;
	        String feedback;
	        
	        System.out.println("Think of a number between 1 and 100. I’ll try to guess it!");

	        while (true) {
	            int guess = generateGuess(low, high, rand);
	            System.out.println("Is your number " + guess + "? (respond with: high, low, correct)");
	            feedback = sc.nextLine().toLowerCase();

	            if (feedback.equals("correct")) {
	                System.out.println("Yay! I guessed your number!");
	                break;
	            } else if (feedback.equals("low")) {
	                low = guess + 1;
	            } else if (feedback.equals("high")) {
	                high = guess - 1;
	            } else {
	                System.out.println("Please enter 'high', 'low', or 'correct'.");
	            }
	        }

	        sc.close();
	    }

	    static int generateGuess(int low, int high, Random rand) {
	        return rand.nextInt(high - low + 1) + low;
	    }
	}


