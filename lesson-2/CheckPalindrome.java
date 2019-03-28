import java.util.Scanner;
public class CheckPalindrome{
	public static void main(String[] args){
		System.out.print("enter intger number: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();

		int reverseNumber = reverse(number);

		if(isPalindrome(number)){
			System.out.println("Number is reverse");
		}else{
			System.out.println("Number is not reverse");
		}
	}
	
	public static int reverse(int number){
		Integer num = number;
		StringBuffer strBuf = new StringBuffer(num.toString());
		strBuf.reverse();
		return Integer.parseInt(strBuf.toString());
	}

	public static boolean isPalindrome(int number){
		return number == reverse(number);
	}
}
