package classExercise;

import java.io.Console;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ChooseTheNum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		
		int max = 16; 
		int min = 1;
		int random;
		
		
		int guess = min + (int)(Math.random() * ((max - min) + 1));
		System.out.println(guess);
	
		
		Random generator = new Random();
		System.out.println(Integer.toBinaryString(max) + "+" + Integer.toBinaryString(min)
        + "=" + Integer.toBinaryString(guess ));

		Console console = System.console();
			guess = scan.nextInt(); 

			if (Math.random() != guess) {
			
			System.out.println("Worng");
			} else {
			
				System.out.println("True");
				
//				System.out.println("----");
//				System.exit(0);
//				
//		while (guess != random) {
//			if (guess > random) {
//
//		
		
////		System.out.println("please enter id ");
////		Console console = System.console();
////		int choose = scan.nextInt();
////		char[] password = console.readPassword("Enter password");  
////		Arrays.fill(password, ' ');
//
//
//		console.printf("Testing password%n");
//		char[] passwordArray = console.readPassword("Enter your secret password: ");
//		console.printf("Password entered was: %s%n", new String(passwordArray));
//	



//        random = generator.nextInt(100) + 1;
//        attempts = 1; 
//
//        System.out.print("I am thinking of a number between 0 and 100, what do you think it is?");
//
//            
            	} 
//        }
//
//        System.out.print(random + "is the correct answer and it took you" + attempts + "attempts to guess it!");
		
	

         		
	}

}
	



