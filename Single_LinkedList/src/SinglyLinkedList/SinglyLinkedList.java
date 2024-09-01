package SinglyLinkedList;

public class SinglyLinkedList<T> {
    Node<T> head; //head of the list

    public SinglyLinkedList(){
        this.head = null;
    }
    //    Add node at the beginning
    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
    }

//    AddLast
    public void addLast(T data) {
//        create a new node with given data
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
//            or we can call addFirst
//            addFirst(data);
        }
        else{
//            start from head node
            Node<T> current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

//    Add at position
    public void addAtPosition(T data, int position) {
        Node<T> newNode = new Node<>(data);
        if(position == 0){
            addFirst(data);
            return;
        }
        else{
//            creat a new node with given data
            Node<T> current = head;

            for(int i = 0; i < position - 1; i++){
                if(current.next == null){
                    System.out.println("Position out of bounds");
                    break;
                }
                else{
                    current = current.next;
                }
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }
// Delete Node by Value
    public void deleteNode(T key){
        Node<T> current = head;
        Node<T> previous = null;

//        check if the head itself holds the key to be deleted
//        use equals() because in Java, dealing with generic types((T)
//        instead of "==" to compare objects.
        if(current != null && current.data.equals(key)){
            head = current.next;
            return;
        }
//        traverse the list to find the node to be deleted
        while(current != null && !current.data.equals(key)){
            previous = current;
            current = current.next;
        }

        if (current == null){
            System.out.println("Node not found");
            return;
        }
        System.out.println("Node " + current.data +" found");
        previous.next = current.next;
    }

//    search for a node by value
    public boolean Search(T data){
        Node<T> current = head;
        while(current != null){
            if(current.data.equals(data)){
                System.out.println("Found node: " + current.data);
                return false;
            }
            else{
                current = current.next;
            }
        }
        System.out.println("Not found node: ");
        return false;
    }

//    print the Linked List
    public void printList(){
        Node<T> current = head;
        while(current != null){
            System.out.println(current.data + " ");
            current = current.next;
        }
    }
}