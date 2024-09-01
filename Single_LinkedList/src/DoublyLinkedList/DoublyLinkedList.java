package DoublyLinkedList;

public class DoublyLinkedList<T> {
    Node<T> head, tail;
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // addFirst
    public void addFirst(T data) {
        Node<T> newNode = new Node<T>(data);

//        when list is empty
        if(head == null) {
            head = newNode;
            tail = newNode;
        }
        else{
            newNode.next = head;
            newNode.prev = null;
            head.prev = newNode;
            head = newNode;
        }
    }
    // addLast
    public void addLast(T data){
        Node<T> newNode = new Node<T>(data);
//        when list is empty
        if(head == null) {
            addFirst(data);
        }
        else{
            newNode.next = null;
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }
    // addAtPosition
    public void addAtPosition(T data, int position) {
        Node<T> newNode = new Node<>(data);

        if(position == 0) {
            addFirst(data);
            return;
        }
        Node<T> current = head;

        for(int i = 0; i<position-1; i++) {
            if(current == null){
                System.out.println("Position out of bounds");
                return;
            }
            current = current.next;
        }
//        current now at index position - 1
        if(current.next == null){
            addLast(data);
            return;
        }
        else{
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
    }
    // Delete
    public void deleteNode(T value) {
        Node<T> current = head;

        if(head == null){
            System.out.println("List is empty");
            return;
        }

        while(current != null && !current.data.equals(value)){
            current = current.next;
        }
        if(current == null){
            System.out.println("Node not found");
            return;
        }
        if (current == head){
            head = head.next;
            if(head != null){
                head.prev = null;
            }
//            else when head == null --> tail == null
            else{
                tail = null;
            }
        }
        else if(current == tail){
            tail = tail.prev;
            tail.next = null;
        }
        else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
    }
    // search
    public boolean Search(T value){
        Node<T> current = head;
        while(current != null){
            if(current.data.equals(value)){
                System.out.println("Node " + current.data + " found");
                return true;
            }
            current = current.next;
        }
        System.out.println("Node not found");
        return false;
    }
    // size
    public int size(){
        int count = 0;
        Node<T> current = head;

        while(current != null){
            count++;
            current = current.next;
        }

        return count;
    }
//    print Doubly Linked List
    public void printList(){
        Node<T> current = head;

        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
