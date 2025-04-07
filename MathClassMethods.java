import java.util.Scanner;

public class MathClassMethods {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter integer: ");
		int num = input.nextInt();
		
		System.out.printf("The absolute value is %d%n", Math.abs(num));
		
		System.out.printf("Enter a float value: ");
		float num1 = input.nextFloat();
		
		System.out.printf("The rounded figure is %d%n", Math.round(num1));
		
		System.out.printf("The square of the float is %f%n", Math.pow(num1,2));
		
		System.out.printf("The square root of the float is %f%n", Math.sqrt(num1));
		
		System.out.println("===============================================================");
		
		System.out.printf("%nEnter the 2 numbers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		System.out.printf("The Minimum value inputed is %d%n", Math.min(number1, number2));
		
		System.out.printf("The random number is %f%n", Math.random());
		
		System.out.println("============================================================");
		System.out.println("To calculate are of a circle");
		
		System.out.print("Enter the radius  of the circle: ");
		int radius = input.nextInt();
		
		double areaOfCircle = Math.PI * Math.pow(radius,2);
		
		System.out.printf("The are of the circle is %f%n", areaOfCircle);
	}
}