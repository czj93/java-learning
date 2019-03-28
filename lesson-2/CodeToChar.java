import java.util.Scanner;
public class CodeToChar{
	public static void main(String[] args){
		System.out.print("Enter an ASCII code: ");
		Scanner input = new Scanner(System.in);
		int asciiCode = input.nextInt();
		char ch = (char) asciiCode;

		System.out.println("The character for ASCII code "+ asciiCode + "is " + ch);
	}
}
