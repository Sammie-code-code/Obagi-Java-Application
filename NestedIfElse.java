import java.util.Scanner;

public class NestedIfElse{
    public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter Name: ");
		String name = input.nextLine();
		
		System.out.print("Enter mark: ");
		int mark = input.nextInt();
		
		if(mark>100){
			System.out.println("Mark cannot be above 100");
		}
		else{
			
		     if (mark >= 80){
			     System.out.printf("Candidate name: %s", name);
			     System.out.printf("%nCandidate score: %d", mark);
			     System.out.printf("%nCandidate Grade: %c", 'A');
		    }
		    else if (mark >= 70){
			     System.out.printf("Candidate name: %s", name);
			     System.out.printf("%nCandidate score: %d", mark);
			     System.out.printf("%nCandidate Grade: %c", 'B');
		    }
		    else if (mark >= 60){
			     System.out.printf("Candidate name: %s", name);
			     System.out.printf("%nCandidate score: %d", mark);
			     System.out.printf("%nCandidate Grade: %c", 'C');
		    }
		    else if (mark >= 50){
			     System.out.printf("Candidate name: %s", name);
			     System.out.printf("%nCandidate score: %d", mark);
			     System.out.printf("%nCandidate Grade: %c", 'D');
		    }
		    else if (mark >= 40){
			     System.out.printf("Candidate name: %s", name);
			     System.out.printf("%nCandidate score: %d", mark);
			     System.out.printf("%nCandidate Grade: %c", 'E');
		    }
		    else {
			     System.out.printf("Candidate name: %s", name);
			     System.out.printf("%nCandidate score: %d", mark);
			     System.out.printf("%nCandidate Grade: %c", 'F');
		    }
		}
	}
}