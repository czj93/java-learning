import java.util.Scanner;

public class ComputeTip {
	public static void main(String[] args){
		double cost, percent;
		Scanner input  = new Scanner(System.in);
		System.out.print("Enter the subtotal and a gratuity rate:");
		cost = input.nextDouble();
		percent = input.nextDouble();
		double tip = cost * (percent/100);
		double total = tip + cost;
		System.out.println("The gratuity  is:" + tip + " and total is:" + total);
	}
}
