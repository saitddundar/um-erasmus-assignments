public class BinarySearchTree {
    Node root;

    public Node insert(Node root, int value) {

        if (root == null) {
            return new Node(value);
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        }
        else if (value > root.data) {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public void printConnections(Node root) {
        if (root != null) {
            System.out.print("Node " + root.data + " -> ");
            if (root.left != null) {
                System.out.print("Left: " + root.left.data + " ");
            } else {
                System.out.print("Left: null ");
            }
            if (root.right != null) {
                System.out.print("Right: " + root.right.data);
            } else {
                System.out.print("Right: null");
            }
            System.out.println();
            printConnections(root.left);
            printConnections(root.right);
        }
    }

    public boolean search(Node root, int value) {
        if (root == null) {
            return false;
        }
        if (value < root.data) {
            return search(root.left, value);
        } else if (value > root.data) {
            return search(root.right, value);
        } else {
            return true;
        }
    }

    public int findMin(Node root) {
        Node current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.data;
    }

    public int findMax(Node root) {
        Node current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.data;
    }


    public Node findSuccessor(Node root, int value) {
        Node current = searchNode(root, value);
        if (current == null) return null;

        if (current.right != null) {
            return findMinNode(current.right);
        } else {
            Node successor = null;
            Node ancestor = root;
            while (ancestor != current) {
                if (value < ancestor.data) {
                    successor = ancestor;
                    ancestor = ancestor.left;
                } else {
                    ancestor = ancestor.right;
                }
            }
            return successor;
        }
    }

    public Node findPredecessor(Node root, int value) {
        Node current = searchNode(root, value);
        if (current == null) return null;

        if (current.left != null) {
            return findMaxNode(current.left);
        } else {
            Node predecessor = null;
            Node ancestor = root;
            while (ancestor != current) {
                if (value > ancestor.data) {
                    predecessor = ancestor;
                    ancestor = ancestor.right;
                } else {
                    ancestor = ancestor.left;
                }
            }
            return predecessor;
        }
    }

    public Node searchNode(Node root, int value) {
        if (root == null || root.data == value) return root;
        if (value < root.data) return searchNode(root.left, value);
        return searchNode(root.right, value);
    }

    public Node findMinNode(Node root) {
        while (root.left != null) root = root.left;
        return root;
    }

    public Node findMaxNode(Node root) {
        while (root.right != null) root = root.right;
        return root;
    }

    public Node remove(Node root, int value) {
        if (root == null) {
            return root;
        }

        if (value < root.data) {
            root.left = remove(root.left, value);
        } else if (value > root.data) {
            root.right = remove(root.right, value);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.data = findMin(root.right);
            root.right = remove(root.right, root.data);
        }
        return root;
    }

}
