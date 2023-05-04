import java.util.Scanner;

public class MethodsWithParametersExample {
	public static void main(String[] args){
		Scanner kb = new Scanner (System.in);
		double num1, num2;
		System.out.println("Please give me one decimal number:  ");
		num1 = kb.nextDouble();
		System.out.println("Please give me another decimal number:  ");
		num2 = kb.nextDouble();

		// Hold for method call
		double answer = findSum(num1, num2);
		System.out.println(num1 + " + " + num2 + " = " + answer);
	
		
	}


	//create the method "double" instead of void and main.
	public static double findSum(double x, double y) {
		double sum = x + y;
		return sum;
	}




}