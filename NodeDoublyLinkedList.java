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
public class NodeDoublyLinkedList {

    private Node beginMarker;
    private Node endMarker;
    int size;

    NodeDoublyLinkedList() {
        beginMarker = new Node();
        endMarker = new Node(null, null, null, beginMarker);
        beginMarker.setNext(endMarker);
        size = 0;
    }

    public void insert(int index, Node nodeNew) {

        if (index < 0 || index > size) {
            System.out.println("Out of bounds.");
            return;
        }

        int counter = 0;
        Node nNav = beginMarker;

        while (counter < index && nNav.getNext() != endMarker) {
            nNav = nNav.getNext();
            counter++;
        }

        Node temp = nNav.getNext();

        nodeNew.setNext(temp);
        nodeNew.setPrevious(nNav);
        temp.setPrevious(nodeNew);
        nNav.setNext(nodeNew);
        size++;
    }

    public void add(Node n) {
        insert(size, n);
    }

    public Node remove() {
        Node n = remove(size - 1);
        return n;
    }

    public Node remove(int idx) {

        Node temp = getNode(idx);
        Node tempPre = temp.getPrevious();
        Node tempNext = temp.getNext();

        tempPre.setNext(temp.getNext());
        tempNext.setPrevious(temp.getPrevious());

        return temp;
    }

    public void insert(Node newNode) {
        insert(size, newNode);
    }

    public String PrintList() {

        String NodeListStr = "";
        Node nNav = beginMarker;

        if (nNav != null) {
            while (nNav.getNext() != endMarker) {
                nNav = nNav.getNext();
                NodeListStr += nNav.toString();
            }

            System.out.println(NodeListStr);
        } else {
            System.out.println("List is Empty");
        }
        return NodeListStr;
    }

    public Node getNode1(int index) {
        if (index < 0 || index > size) {
            System.out.println("Out of bounds.");
            return null;
        }

        int counter = 0;
        Node nNav = beginMarker;

        while (counter < index && nNav.getNext() != endMarker) {
            nNav = nNav.getNext();
            counter++;
        }
        return nNav;
    }

    public Node getNode(int idx) {
        return getNode(idx, 0, size);

    }

    private Node getNode(int idx, int lower, int upper) {
        Node p;

        if (idx < lower || idx > upper) {
            throw new IndexOutOfBoundsException();
        }
        if (idx < size / 2) {
            p = beginMarker.getNext();
            for (int i = 0; i < idx; i++) {
                p = p.getNext();
            }
        } else {
            p = endMarker;
            for (int i = size; i > idx; i--) {
                p = p.getPrevious();
            }
        }
        return p;
    }

    public int getSize() {
        return size;
    }

    public void makeEmpty() {
        beginMarker = new Node();
        endMarker = new Node (null, null,null, beginMarker);
        beginMarker.setNext(endMarker);
        size = 0;
    }

    public Node find(int idx) {
        Node temp = null;

        temp = this.getNode(idx, idx, idx);

        return temp;
    }
}
