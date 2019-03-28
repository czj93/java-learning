import java.util.ArrayList;

public class TestArrayListRemoveAll{
	public static void  main(String[] args){

		ArrayList<String> list = new ArrayList<>();
		list.add("Dalls");
		list.add("Dalls");
		list.add("Houston");
		list.add("Dalls");
		
		int size = list.size();
		for(int i = 0; i < list.size(); ){
			
			System.out.println("list size is " + list.size() + " index is  " + i);
			boolean result = list.remove("Dalls");
			if(!result) i++ ;
		}
	
		System.out.println(list.toString());
	}

}
