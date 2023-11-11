package my_package;
import java.util.*;

public class HashSetEx {
	public static void main(String[] args) {
		Set<String> hs=new HashSet<>() ;
		hs.add("A");
		hs.add("D");
		hs.add("B");
		hs.add("E");
		hs.add("C");
		hs.add("F");
		hs.add("F");
		System.out.println(hs);
		hs.remove("F");
		
		//hs.set(2,"L");
		Iterator<String> it=hs.iterator();
		while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }
		System.out.println(hs.contains("A"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		System.out.println(hs);
		hs.clear();
		System.out.println(hs);

		
	}

}
