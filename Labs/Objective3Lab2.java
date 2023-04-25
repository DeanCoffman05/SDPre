public class Objective3Lab2 {
	public static void main(String[] args){

		//labeling the sides, a, b, and the hypotenuse. Also calculating the result of the equation

		Double side1 = 10.0;
		Double side2 = 8.0;
		Double a = (side1 * side1);
		Double b = (side2 * side2);
		Double result = (a + b);
		Double hypotenuse = Math.sqrt(result);
		

		// printing the equation with text and variables to explain the equation. 
		System.out.println(side1 + "squared");
		System.out.println("+");
		System.out.println(side2 + "squared");
		System.out.println("=");
		System.out.println(hypotenuse);


	}


}