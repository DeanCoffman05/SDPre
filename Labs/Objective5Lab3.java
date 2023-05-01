import java.util.Scanner;
public class Objective5Lab3 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int userNumber;

		System.out.println("Please enter a number: ");
		userNumber = scanner.nextInt();

		if(userNumber < 0) {
			System.out.println(userNumber + " is a negative number");
		}
		else if(userNumber > 0) {
			System.out.println(userNumber + " is a positive number");
		}
		else {
			System.out.println(userNumber + " is equal to 0");
		}
		scanner.close();
	}
}