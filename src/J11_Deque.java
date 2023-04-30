import java.util.*;

public class J11_Deque {
    public static void main(String[] args) {

// Dqueue interface

        // array class
        ArrClass();
        // Linked Class
        // LLClass();

        
    }
    public static void ArrClass(){
        // Initializing an deque
		Deque<String> dq = new ArrayDeque<String>();

		// add() method to insert
		dq.add("One");
		dq.addFirst("Two");
		dq.addLast("Three");

		System.out.println(dq);
		System.out.println(dq.pop()); 
		System.out.println(dq.poll());
		System.out.println(dq.pollFirst());
		System.out.println(dq.pollLast());

        dq.add("One"); dq.add("Two"); dq.add("Three");

        // itrate from front
        for (Iterator itr = dq.iterator(); itr.hasNext();) {
			System.out.print(itr.next() + " ");
		}
        // itrate from last
        for (Iterator itr = dq.descendingIterator(); itr.hasNext();) {
			System.out.print(itr.next() + " ");
		}

    }
    public static void LLClass(){
        Deque<String> deque = new LinkedList<String>();

        // We can add elements to the queue
		// in various ways

		// Add at the last
		deque.add("Element 1 (Tail)");

		// Add at the first
		deque.addFirst("Element 2 (Head)");

		// Add at the last
		deque.addLast("Element 3 (Tail)");

		// Add at the first
		deque.push("Element 4 (Head)");

		// Add at the last
		deque.offer("Element 5 (Tail)");
        

		// Add at the first
		deque.offerFirst("Element 6 (Head)");

		System.out.println(deque + "\n");

		// We can remove the first element
		// or the last element.
		deque.removeFirst();
		deque.removeLast();
		System.out.println("Deque after removing "
						+ "first and last: "
						+ deque);
    }
}

/*
 * 
 * Deque interface present in java.util package is a subtype of the queue interface. The Deque is related to the double-ended queue that supports the addition or removal of elements from either end of the data structure. It can either be used as a queue(first-in-first-out/FIFO) or as a stack(last-in-first-out/LIFO). Deque is the acronym for double-ended queue.
 * 
 * Creating Deque Objects Since Deque is an interface, objects cannot be created of the type deque. We always need a class that extends this list in order to create an object. And also, after the introduction of Generics in Java 1.5, it is possible to restrict the type of object that can be stored in the Deque.
 * 
 * // Array Deque
 * ArrayDeque: ArrayDeque class which is implemented in the collection framework provides us with a way to apply resizable-array. This is a special kind of array that grows and allows users to add or remove an element from both sides of the queue.
 * 
 * ArrayDeque class is likely to be faster than Stack when used as a stack. ArrayDeque class is likely to be faster than LinkedList when used as a queue. 
 * 
 * 
 * 
 */