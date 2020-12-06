package JavaActivity3;

import java.util.ArrayList;

public class Activity3_1 { 
	public static void main(String [] args) {
		
	
	ArrayList<String> myList = new ArrayList<String>();
	myList.add("shan");
	myList.add("joseph");
	myList.add("kiran");
	myList.add("sonu");
	myList.add("yonu");
	System.out.println("print all the objetcs");
	for(String s : myList) {
		System.out.println(s);
	}
	System.out.println("third name in the list is:"+ myList.get(2));
	System.out.println("is sanjay is in the list: "+ myList.contains("sanjay"));
	System.out.println("size of the list is :"+ myList.size());
	myList.remove(4);
	System.out.println("after removing size of the list is :"+ myList.size());
	}

}
