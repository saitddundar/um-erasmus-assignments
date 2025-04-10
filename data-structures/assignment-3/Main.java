import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nDoubly linked list - selection:");
            System.out.println("1) Search data");
            System.out.println("2) Insert data into head");
            System.out.println("3) Insert data after the element");
            System.out.println("4) Insert data after tail");
            System.out.println("5) Delete one element");
            System.out.println("6) Print list from head to tail");
            System.out.println("7) Print list from tail to head");
            System.out.println("8) End");
            System.out.print("Selection: ");

            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    System.out.print("Enter data to search: ");
                    int searchData = scanner.nextInt();
                    Node found = list.searchHead(searchData);
                    if (found != null) {
                        System.out.println("Data found: " + found.data);
                    } else {
                        System.out.println("Data not found.");
                    }
                    break;

                case 2:
                    System.out.print("Enter data to insert at head: ");
                    int headData = scanner.nextInt();
                    list.addFirstNode(headData);
                    System.out.println("Inserted at head.");
                    break;

                case 3:
                    System.out.print("Enter data of the element after which to insert: ");
                    int prevData = scanner.nextInt();
                    Node previous = list.searchHead(prevData);
                    if (previous != null) {
                        System.out.print("Enter new data to insert: ");
                        int newData = scanner.nextInt();
                        list.addNode(newData, previous);
                        System.out.println("Inserted after " + prevData);
                    } else {
                        System.out.println("Previous element not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter data to insert at tail: ");
                    int tailData = scanner.nextInt();
                    list.addLastNode(tailData);
                    System.out.println("Inserted at tail.");
                    break;

                case 5:
                    System.out.print("Enter data to delete: ");
                    int deleteData = scanner.nextInt();
                    Node toDelete = list.searchHead(deleteData);
                    if (toDelete != null) {
                        list.deleteElement(toDelete);
                        System.out.println("Element deleted.");
                    } else {
                        System.out.println("Element not found.");
                    }
                    break;

                case 6:
                    System.out.println("List from head to tail:");
                    list.printForward();
                    break;

                case 7:
                    System.out.println("List from tail to head:");
                    list.printBackward();
                    break;

                case 8:
                    System.out.println("Program ended.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid selection. Try again.");
            }
        }
    }
}
