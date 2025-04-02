import java.util.Scanner;

public class Classwork {
    public static void main(String[] args){
		System.out.println("Enter the number");
		
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		
		System.out.printf("The Multiplicaton table of %d%n", number);
		int i = 1;
		
		do{
			int product = number*i;
			System.out.printf("%d%n", product);
			i++;
		}
		while(i < 13);
	}
}