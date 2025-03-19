public class DataType{
    public static void main(String[] args) {
	//Integer type (byte, short, int, long)
	byte age = 50;
	System.out.printf("You are %d years old %n", age);
	short quantity = 20000;
	System.out.printf("I bought %d bags of rice for my business %n", quantity);
	
	int populationInNigeria = 1000000000;
	System.out.printf("The population in Nigeria is %d %n", populationInNigeria);
	
	long worldPopulation = 8000000000L;
	System.out.printf("The world population is %d%n", worldPopulation);
	
	//float point numbers(float, double)
	float weight = 5.6F;
	System.out.printf("The bag of rice was %fkg %n", weight);
	
	double acctBalance = 487575.94747;
	System.out.printf("Your account balance is %c %.2f %n", '$', acctBalance);
	
	//Boolean
	boolean Isjavafun = true;
	System.out.printf("is java fun?%n", Isjavafun);
	
	//Character type(char)
	char alpha = '@';
	System.out.printf("My email is uekom7%cgmail.com", alpha);
	}
}