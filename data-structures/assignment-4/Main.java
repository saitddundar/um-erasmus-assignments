import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BinarySearchTree tree = new BinarySearchTree();

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1) Insert a value");
            System.out.println("2) Ordered print of keys");
            System.out.println("3) Print node connections");
            System.out.println("4) Search for a value");
            System.out.println("5) Print min/max values");
            System.out.println("6) Print successor and predecessor");
            System.out.println("7) Remove a node");
            System.out.println("8) End");
            System.out.print("9) Selection: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a value to insert: ");
                    int valueToInsert = scanner.nextInt();
                    tree.root = tree.insert(tree.root, valueToInsert);
                    System.out.println(valueToInsert + " inserted.");
                    break;

                case 2:
                    System.out.print("Inorder Traversal: ");
                    tree.inorder(tree.root);
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Node Connections: ");
                    tree.printConnections(tree.root);
                    break;

                case 4:
                    System.out.print("Enter a value to search: ");
                    int valueToSearch = scanner.nextInt();
                    boolean found = tree.search(tree.root, valueToSearch);
                    System.out.println("Search for " + valueToSearch + ": " + (found ? "Found" : "Not Found"));
                    break;

                case 5:
                    System.out.println("Min Value: " + tree.findMin(tree.root));
                    System.out.println("Max Value: " + tree.findMax(tree.root));
                    break;

                case 6:
                    System.out.print("Enter a value to find successor and predecessor: ");
                    int valueToFind = scanner.nextInt();
                    Node successor = tree.findSuccessor(tree.root, valueToFind);
                    Node predecessor = tree.findPredecessor(tree.root, valueToFind);
                    System.out.println("Successor of " + valueToFind + ": " + (successor != null ? successor.data : "None"));
                    System.out.println("Predecessor of " + valueToFind + ": " + (predecessor != null ? predecessor.data : "None"));
                    break;

                case 7:
                    System.out.print("Enter a value to remove: ");
                    int valueToRemove = scanner.nextInt();
                    tree.root = tree.remove(tree.root, valueToRemove);
                    System.out.println(valueToRemove + " removed.");
                    break;

                case 8:
                    System.out.println("Ending the program...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please choose a valid operation.");
            }
        }
    }
}