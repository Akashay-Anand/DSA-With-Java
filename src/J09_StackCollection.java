import java.util.*;
// import java.io.*;
public class J09_StackCollection {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();

        // push 
        for(int i=0;i<5;i++){
            stk.push(i);
        }
        System.out.println(stk);

        System.out.println(stk.add(5));
        System.out.println(stk.peek());
        System.out.println(stk.size());
        System.out.println(stk.search(7));
        System.out.println(stk.empty());

        // System.out.println("push operation: ");
        // print(stk);
        // print(stk); // stack is empty here ??? what so how to print it without poping


    }
    public static void print(Stack<Integer> stk){ // pass by reference actual data iffected
        while(!stk.isEmpty()){
            System.out.print(stk.pop() + " , ");
        }
    }
}

/*
 * The class is based on the basic principle of last-in-first-out. In addition to the basic push and pop operations, the class provides three more functions of empty, search and peek.
 * 
 * // Operation (LIFO)
 * 
 * isEmpty() // return true is stack is empty
 * push() // add element into stack
 * pop() // delete element from stack
 * peek() // 
 * search() //
 * size() // return size of stack;
 * 
 * Note: Please note that the Stack class in Java is a legacy class and inherits from Vector in Java. It is a thread-safe class and hence involves overhead when we do not need thread safety. It is recommended to use ArrayDeque for stack implementation as it is more efficient in a single-threaded environment.
 * 
 * thread-safe : threadsafe means that it is safe to be accessed from multiple threads. When you are using multiple threads in a program and they are each attempting to access a common data structure or location in memory several bad things can happen
 * A piece of code is thread-safe if it functions correctly during simultaneous execution by multiple threads.”
 * 
 */