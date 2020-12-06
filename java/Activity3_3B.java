package JavaActivity3;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Activity3_3B {
	public static void main(String[] args) {
		
		Deque<String> dq = new LinkedList<String>();
		
		dq.addFirst("Dog");
        dq.addFirst("Lion");
        dq.addLast("Pig");
        dq.offer("Tiger");
        dq.offerFirst("Cat");
        dq.offerLast("Hyena");
        Iterator<String> iterator = dq.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("head element of the deque is:"+ dq.getFirst());
        System.out.println("tail element of the deque is:"+ dq.getLast());
        System.out.println("is wolf present in the deque:"+ dq.contains("Wolf"));
        dq.pollFirst();
        dq.pollLast();
        System.out.println("after removing the elements in the queue:"+ dq);
        System.out.println("size of the deque: "+ dq.size());
        
	}

}
