import java.util.Scanner;

public class division {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double num1;
      double num2;

      System.out.println("Enter the first number:");
      num1 = sc.nextDouble();
      System.out.println("Enter the second number:");
      num2 = sc.nextDouble();

      // Check if the first number is greater than the second
      if (num1 > num2) {
         throw new IllegalArgumentException("First number cannot be larger than the second number.");
      }

      // Perform division
      double division = num1 / num2;
      System.out.println("Result: " + division);

      sc.close();
   }
}
