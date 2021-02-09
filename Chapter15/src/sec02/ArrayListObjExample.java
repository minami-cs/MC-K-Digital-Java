package sec02;

import java.util.ArrayList;
import java.util.List;

public class ArrayListObjExample {

	public static void main(String[] args) {
		List<Korean> kors = new ArrayList<Korean>();
		Korean k = new Korean("121212", "park", "seoul");
		kors.add(k);
		kors.add(new Korean("131313", "lee", "incheon"));
		kors.add(new Korean("141414", "song", "busan"));
		kors.add(new Korean("121212", "park", "seoul"));
		//kors.remove(0);
		kors.remove(k);
	}

}
