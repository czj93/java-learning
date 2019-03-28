import java.util.ArrayList;
import java.util.Arrays;


public class TestArrayList{
	public static void main(String[] args){
		String[] str = { "Dolls", "honston", "dssda"  };

		ArrayList<String> strList = new ArrayList<>(Arrays.asList(str));
		ArrayList<Double> list = new ArrayList<>();



//		list.add(1);
		list.add(1.0);
		
		System.out.println(strList);
	}

}


