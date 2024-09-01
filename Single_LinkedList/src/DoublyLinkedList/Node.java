package DoublyLinkedList;

public class Node<T> {
    protected T data;
    protected Node<T> next;
    protected Node<T> prev;

    // Constructor to create a new node
    public Node(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
