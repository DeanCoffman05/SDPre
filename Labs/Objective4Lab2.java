import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    //TODO prompt the user to get input for all of the above int variables.

      System.out.println("Please enter the first whole number you would like to add.");
      int num1 = keyboard.nextInt();

      System.out.println("Please enter the second whole number you would like to add.");
      int num2 = keyboard.nextInt();

      System.out.println("Please enter the third whole number you would like to add.");
      int num3 = keyboard.nextInt();

      int sum1 = num1 + num2 + num3;


    //TODO prompt the user to get input for all of the above double variables.

      System.out.println("Please enter the first decimal number you would like to add.");
      double dub1 = keyboard.nextDouble();

      System.out.println("Please enter the second decimal number you would like to add.");
      double dub2 = keyboard.nextDouble();

      System.out.println("Please enter the third decimal number you would like to add.");
      double dub3 = keyboard.nextDouble();

      double sum2 = dub1 + dub2 + dub3;

    //TODO print the three ints and their sum.

      System.out.println("The sum of " + num1 + " + " + num2 + " + " + num3 + " = " + sum1);

    //TODO print the three doubles and their sum.

      System.out.println("The sum of " + dub1 + " + " + dub2 + " + " + dub3 + " = " + sum2);

  }
}