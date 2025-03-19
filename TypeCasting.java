public class TypeCasting{
    public static void main(String [] args){
	//Widening type cast
	double weight = 675;
	System.out.printf("Your weight is %f %n", weight);
	
	//Narrowing type casting ? = 63
	char alpha = '?';
	
	int asciiCode = (char)alpha;
	System.out.printf("The ASCII code for ? is %d", asciiCode);
	}
}
	
	