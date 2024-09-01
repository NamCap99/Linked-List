package SinglyLinkedList;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        SinglyLinkedList<String> list = new SinglyLinkedList();

        // Add elements to the list
        list.addFirst("one");
        list.addLast("three");
        list.addLast("four");
        list.addFirst("zero");

        System.out.println("Linked List before inserting at position:");
        list.printList(); // Output: zero one three four

        // Insert an element at position 2
        list.addAtPosition("two", 2);

        System.out.println("Linked List after inserting 'two' at position 2:");
        list.printList(); // Output: zero one two three four

        System.out.println("Enter value for searching in Linked List");
        Scanner scanner = new Scanner(System.in);
        String searchValue = scanner.nextLine();
        boolean found =  list.Search(searchValue);
//        // Output the result of the search
//        if (found) {
//            System.out.println("Element " + searchValue + " is found in the list.");
//        } else {
//            System.out.println("Element " + searchValue + " is not found in the list.");
//        }

        System.out.println("Enter element you want delete Linked List");
        String deleteValue = scanner.nextLine();
        list.deleteNode(deleteValue);
        System.out.println("Linked List after deleted element at position:");
        list.printList();
        System.out.println("Add first value = my name");
        list.addFirst("my name");
        list.printList();
    }
}
