import java.util.Random;
import java.util.Scanner;

public class DiceButNoDragons {

	public static void main(String[] args) {
		int input1 = 0;
		
		Scanner scan = new Scanner(System.in);
		String userAns = "y";					// input number from user
		String hitKey = "";
		System.out.println("----------------------------------------------------------");
		System.out.println("Welcome to Dice, But No Dragons!");

		do {

			System.out.println("----------------------------------------------------------");
			System.out.println("How many sides does each dice have?");
			input1 = scan.nextInt();
			
			scan.nextLine();
			
			System.out.println("Please roll the dice by hitting Enter.");
			hitKey = scan.nextLine();
			
			
			if(!hitKey.equals(null)) {
				
				
				// call the different random gen methods here
				
				genRandMath();
				randClassGen(input1);
				
				System.out.println("----------------------------------------------------------");
				System.out.println("Would you like to continue? y/n");
				userAns = scan.next();
				
				hitKey = "";
			}
			else {
				System.out.println("That wasn't Enter. Try Again");
			}
			
		} while (userAns.equals("y") || userAns.equals("Y"));

		System.out.println("This has been: Dice, But No Dragons.");
		System.out.println("----------------------------------------------------------");
		
		
		scan.close();
	}
	
	
	/*
	 * uses the Math class to print out a random number
	 */
	public static void genRandMath() {
		System.out.println("******************************************");
		System.out.println("The genRandMath Method");
		System.out.println((int)(Math.random() * 10));
	}
	
	
	/*
	 * assigns a random value to two int variables. then makes sure that if it rolls 0,
	 * we add 1 to it.
	 */
	public static void randClassGen(int num) {
		System.out.println("******************************************");
		System.out.println("The randClassGen Method");
		Random dRand = new Random();
		
		int dice1 = dRand.nextInt(num + 1); // adding one b/c the range is one less then the input
		int dice2 = dRand.nextInt(num + 1);	// adding one b/c the range is one less then the input
		
		// Dice don't have zeroes, so adding 1 to them.
		if(dice1 == 0) {
			dice1 += 1;
		}
		if(dice2 == 0) {
			dice2 += 1;
		}
		System.out.println(dice1 + "\n" + dice2);
		
	}

}
