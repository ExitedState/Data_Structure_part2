package datastr.implement.tree;

public class BTNode {
    Object element;
    BTNode left;
    BTNode right;

    BTNode(Object element, BTNode left, BTNode right) {
        this.element = element;
        this.left = left;
        this.right = right;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public BTNode getLeft() {
        return left;
    }

    public void setLeft(BTNode left) {
        this.left = left;
    }

    public BTNode getRight() {
        return right;
    }

    public void setRight(BTNode right) {
        this.right = right;
    }

}
