//import org.w3c.dom.Node;

import java.io.PrintStream;

public class DLL {

    private Node head;
    private int size ;
    public DLL() {
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
        size++;
    }

    public void insertLast(int value){
        Node  node = new Node(value);
        Node last = head;
        node.next = null;

        if(head == null){
            node.prev = null;
            head = node;
            return;
        }

        while (last.next != null){
            last = last.next;
        }

        last.next = node;
        node.prev = last;
    }
    public Node find(int value){
        Node temp = head;
        while (temp!=null){
            if(temp.value==value){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }


    public void insert(int after,int value){
        Node p = find(after);

        if(p==null){
            System.out.println("The value " + value + " is not in the DLL");
            return;
        }
        Node node = new Node(value);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next!=null){
            node.next.prev = node;
        }
    }

    public void display(){
        Node node = head;
        Node last = null;
        while(node!=null){
            System.out.print(node.value+" -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");
        System.out.println();
        System.out.print("Reversing");
        System.out.println();
        System.out.println();
        while(last!=null){
            System.out.print(last.value+" -> ");
            last = last.prev;
        }
        System.out.println("START");
        System.out.println();

    }



    private class Node {
        private int value;
        private Node next;
        private Node prev;
        public Node(int value) {
            this.value = value;
        }

        public Node(Node next, Node prev, int value) {
            this.next = next;
            this.prev = prev;
            this.value = value;
        }

    }
}
