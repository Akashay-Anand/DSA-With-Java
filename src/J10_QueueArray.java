public class J10_QueueArray {
    public static void main(String[] args) {
        QueueArray queue = new QueueArray(1000);
          
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
      
        System.out.println(queue.dequeue() + 
                     " dequeued from queue\n");
      
        System.out.println("Front item is " + 
                               queue.front());
         
        System.out.println("Rear item is " + 
                                queue.rear());
    }    
}

class QueueArray {
    int front, rear, size;
    int capacity;
    int array[];

    public QueueArray(int capacity){
        this.capacity = capacity;
        this.front = this.size = 0;
        this.rear = capacity-1;
        array = new int[capacity];
    }

    // queue is full when the size become equal to the capacity
    boolean isFull(QueueArray qa){
        return qa.size == qa.capacity;
    }

    // queue is empity when sze is zero
    boolean isEmpty(QueueArray qa){
        return qa.size == 0;
    }

    // Method to add an item to the queue. 
    // It changes rear and size
    void enqueue( int item)
    {
        if (isFull(this)) // Passing "this" keyword as argument to method // current class object as argument
        {
            System.out.println("Overflow");    
            return;         
        }   
        this.rear = (this.rear + 1)%this.capacity;
        this.array[this.rear] = item;
        this.size = this.size + 1;
        System.out.println(item+ " enqueued to queue");
    }

    // Method to remove an item from queue.  
    // It changes front and size
    int dequeue()
    {
        if (isEmpty(this))
        {
            System.out.println("Underflow");
            return Integer.MIN_VALUE; 
        }
         
        int item = this.array[this.front];
        this.front = (this.front + 1)%this.capacity;
        this.size = this.size - 1;
        return item;
    }

    // Method to get front of queue
    int front()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;
         
        return this.array[this.front];
    }
      
    // Method to get rear of queue
    int rear()
    {
        if (isEmpty(this))
            return Integer.MIN_VALUE;
         
        return this.array[this.rear];
    }
}