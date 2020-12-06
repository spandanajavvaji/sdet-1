package JavaActivity3;

import java.util.LinkedList;
import java.util.Queue;

public class Activity3_3A {
	public static void main(String[] args) {
		
		Queue<Integer> q = new LinkedList<>();
		for(int i=0; i<5; i++) {
			q.add(i);
			}
		System.out.println("original queue:"+ q);
		System.out.println("removing number 4 from queue:" + q.remove(4));
		System.out.println("first number in the queue:"+ q.peek());
		System.out.println("size of the queue:"+ q.size());
		System.out.println("updated queue:"+ q);
		
	}

}
