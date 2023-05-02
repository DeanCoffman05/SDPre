public class SwitchExample {
public static void main(String[] args) { 
	char grade;
	grade = 'B';

	switch (grade) {
	case 'A':
		System.out.println("Fantasic Job!");
		break;
	case 'B':
		System.out.println("Good Job!");
		break;
	case 'C':
		System.out.println("You're doing okay.");
		break;
	case 'D':
		System.out.println("Please schedule a conference.");
		break;
	case 'F':
		System.out.println("Start finishing your homework and showing up to class.");
		break;
	default:
		System.out.println("Invalid Grade");


	}
	
}

}