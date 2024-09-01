package DoublyLinkedList;

public class App {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList();

        System.out.println("Add 1");
        list.addFirst(1);
        System.out.println("Add first with value = 2");
        list.addFirst(2);
        System.out.println("Add last with value = 3");
        list.addLast(3);
        System.out.println("Add value = 10 at position 2");
        list.addAtPosition(10,2);
        list.printList();
        System.out.println("Add first with value = 20");
        list.addFirst(20);
        list.printList();
        System.out.println("Delete value = 20");
        list.deleteNode(20);
        list.printList();
        System.out.println("Size of array is: " + list.size());

    }
}
