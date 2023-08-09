package Stack_Queues;

public class QueueUsingArray {
    private int data[];
    private int front,rear,size;

    public QueueUsingArray(){
        data = new int[5];
        front=-1;
        rear = -1;
    }
    public QueueUsingArray(int capacity){
        data=new int[capacity];
        front=-1;
        rear=-1;
    }
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        return size == 0;
    }

    //In queue indsertion happend in rear side and delete happend in front side. Queue[front, ...., rear]
    public void enqueue(int elem){
        if(size==0){
            //the queue is empty
            front=0;
        }
        if(size==data.length) {
            System.out.println("Queue Full");
            return;
        }
        data[++rear]=elem;
        size++;
    }
    //Deletion happend in front end
    public int dequeue(){ 
        if(size==0) {
            System.out.println("The Queue is empty");
            return-1;
        }
        int val = data[front];
        front++;
        size--;
        if(size==0){
            front=-1;
            rear=-1;
        }
        return val;
    }
    public int front(){
        //returns the element at front ind
        if(size==0){
            System.out.println("Queue is empty");
        }
        return data[front];
    }
}
