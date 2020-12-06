package JavaActivity3;

import java.util.HashSet;

public class Activity3_2 {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("java");
		hs.add("phyton");
		hs.add("sql");
		hs.add("c++");
		hs.add(".net");
		hs.add("c");
		System.out.println("original hashset:"+ hs);
		System.out.println("size of set is:"+ hs.size());
		System.out.println("removing the phyton from the list:"+ hs.remove("phyton"));
		hs.remove("data");
		System.out.println("is sql present in the list:"+hs.contains("sql"));
		System.out.println("data present in the list:"+hs);
		
		
	}

}
