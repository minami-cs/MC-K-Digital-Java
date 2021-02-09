import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class IteratorTest {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList();
		al.add("aaaa");
		al.add("bbbb");
		Iterator<String> it = al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		HashMap<String, String> hm = new HashMap<>();
//		hm.put("100", "hong");
//		hm.put("101", "park");
//		hm.put("102", "kang");
//		
//		Iterator<String, String> hms = hm.values().iterator();
//		for()
	}

}
