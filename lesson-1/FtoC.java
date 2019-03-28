import java.util.Scanner;
public class FtoC {
	public static void main(String[] args){
		System.out.print("Enter a degree in Celsius:");
		Scanner input = new Scanner(System.in);
		double f = input.nextDouble();
		double c = f*1.8 + 32;
		System.out.println(f + " Celsius is " + c + " Fahrenheit");
		
	}
}
