import java.util.Random;
import java.util.Scanner;
class Guessing_game{
	public Random random = new Random();
	private int noOfGuesses = 0;
	private int stop;
	private int random_number;

	public Guessing_game(int bound){
		stop = bound;
		random_number = random.nextInt(stop);
	}

	private int getNumber(){
		return random_number;
	}

	private boolean isCorrect(int user_answer){
		int guessed_number = getNumber();
		if (user_answer == guessed_number){
			return true;
		}
		return false;
	}

	public void takeUserInput(){
		Scanner scanner = new Scanner(System.in);
		while (true){
			System.out.println("Enter a number");
			int user_input = scanner.nextInt();
			boolean res = isCorrect(user_input);
			if (random_number > user_input){
				System.out.println("You entered a small number enter a big number");
			}
			if (random_number < user_input){
				System.out.println("You entered a big number enter a small number");
			}
			if (res == true){
				noOfGuesses++;
				System.out.println("You Won you guessed in "+noOfGuesses+" guesses");
				break;
			}
			noOfGuesses = noOfGuesses + 1;

		}
	}


}
