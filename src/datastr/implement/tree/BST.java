package datastr.implement.tree;

public class BST {
    private BTNode root;

    public BST() {
        this.root = null;
    }

    private void setRoot(BTNode root) {
        this.root = root;
    }

    private BTNode getRoot() {
        return root;
    }

    public void add(Object object) {
        if (!(object instanceof Comparable obj)) {
            throw new IllegalArgumentException();
        }
        if (this.getRoot() == null) {
            this.setRoot(new BTNode(object, null, null));
        } else {
            BTNode current = this.getRoot();
            BTNode prev = current;
            while (current != null) {
                if (obj.compareTo(current.getElement()) < 0) {
                    prev = current;
                    current = current.getLeft();
                } else if (obj.compareTo(current.getElement()) > 0) {
                    prev = current;
                    current = current.getRight();
                } else {
                    return;
                }
            }
            if (obj.compareTo(prev.getElement()) > 0) {
                prev.setRight(new BTNode(object, null, null));
            } else {
                prev.setLeft(new BTNode(object, null, null));
            }
        }
    }

    public void printTree() {
        printInOrder(root);
    }

    private void printInOrder(BTNode node) {
        if (node == null) {
            return;
        }
        printInOrder(node.getLeft());
        System.out.print(node.getElement() + ",");
        printInOrder(node.getRight());
    }

}
