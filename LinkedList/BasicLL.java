package LinkedList;
class Node<T> {
    T data;
    Node<T> next;

    //constructor
    Node(T data){
        this.data = data;
        next=null;
    }
}

public class BasicLL{
    static void PrintList(Node<Integer> head){
    Node<Integer> temp = head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
    }
    public static void main(String[] args) {
        Node<Integer> node1 = new Node(10);
        PrintList(node1);
    }
}