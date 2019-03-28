public class RandomShowMonth{
	public static void main(String[] args){
		String[] months = { "Jan", "Feb", "3", "4", "5", "6", "7", "8", "99", "100", "11","122" };
		int monthIndex = (int)(Math.random()*12);
		System.out.println(months[monthIndex]);
	}
}
