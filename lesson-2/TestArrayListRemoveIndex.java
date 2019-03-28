import java.util.ArrayList;

public class TestArrayListRemoveIndex{
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		Integer num = 1;
		list.remove(num);
		System.out.println(list);
	
	}
}
