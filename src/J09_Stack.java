public class J09_Stack {
    public static void main(String[] args) {
        System.out.println("Details on Stack");
    }   
}

/*
LIFO( Last In First Out )

# Operation (! with Array implementation of stack);
push() to insert an element into the stack;   If the stack is full, then it is said to be an Overflow condition
pop() to remove an element from the stack;  If the stack is empty, then it is said to be an Underflow condition.
top() Returns the top element of the stack.
isEmpty() returns true if stack is empty else false.
size() returns the size of stack.


 * Operations  	Complexity
        push() 	    O(1)
        pop()   	O(1)
        isEmpty() 	O(1)
        size()	    O(1)

Types of Stacks:

Register Stack: This type of stack is also a memory element present in the memory unit and can handle a small amount of data only. The height of the register stack is always limited as the size of the register stack is very small compared to the memory.

Memory Stack: This type of stack can handle a large amount of memory data. The height of the memory stack is flexible as it occupies a large amount of memory data. 

////////////////////////////////

// if we implement with Linked List then overflow condition may not occure

//////////////////////////////// C++ specific

Stack data structure can be implemented on top of any data structure that provide following operations:

back(), size(), empty(), push_back(), pop_back(). The three container which provide all these functionalities are List, deque and Vector, So stack container can be implemented using any of these three containers. By default it is implemented using deque container.

Since stack is implemented using other containers and acts as an interface, it is also known as the Container Adapter (which is a term in STL Language ).

*/
