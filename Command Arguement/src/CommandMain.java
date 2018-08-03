
//Program that takes input from command line
//Go to run configurations and pass the values
import java.util.Scanner;

class CommandMain {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;

		for (int i = 0; i < args.length; i++) {

			sum = sum + Integer.parseInt(args[i]);

		}
		System.out.println("Sum is : " + sum);

	}

}
