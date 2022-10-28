/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listproject;

/**
 *
 * @author Metch
 */
public class Stack extends NodeDoublyLinkedList {

    private Node top;

    Stack() {
        super();
        top = null;
    }

    public void Push(Node n) {
        insert(getSize(), n);
        top = getNode(getSize() - 1);
    }

    public Node Pop() {
        Node n = remove();
        top = getNode(getSize() - 1);
        return n;
    }

    public Node getTop() {
        top = getNode(getSize() - 1);
        return top;
    }

    public void MakeEmpty() {
        size = 0;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }

    }
}
