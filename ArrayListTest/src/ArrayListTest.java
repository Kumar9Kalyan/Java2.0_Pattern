import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();
		list.add(100);
		list.add(500);
		
		List<Integer> list2 = new ArrayList<Integer>();
		System.out.println(list.containsAll(list2));
		list2.add(30);
		System.out.println(list.containsAll(list2));
		list2.add(100);
		list.addAll(1,list2);
		System.out.println(list);
		System.out.println(list.containsAll(list2));
		list.retainAll(list2);
		list.removeAll(list2);
		System.out.println(list);
		
	}

}
