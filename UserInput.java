import java.util.Scanner;


public class UserInput{
    public static void main(String [] args){
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter Your name: ");
	String name= input.nextLine();
	
	System.out.print("Enter your address: ");
	String address = input.nextLine();
	System.out.println();
	
	System.out.printf("Hello %s, welcome to first bank", name);
	System.out.printf("%n You live at %s", address);
	}
}