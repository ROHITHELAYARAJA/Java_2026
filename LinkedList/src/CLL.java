public class CLL {

    private Node head;
    private Node tail;

    public CLL(){
        head = null;
        tail = null;
    }

    public void insert(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public  void display(){
        Node temp = head;
        if(head!=null){
            do {
                System.out.print(temp.value+" -> ");
                temp = temp.next;
            }while(temp!=head);
        }
    }
    public void delete(int value){
       Node temp = head;

        if(temp==null){
            return;
        }

        if(temp.value==value){
            head = head.next;
            tail.next = head;
            return;
        }

        do {
            Node n =  temp.next;
            if(n.value==value){
                temp.next = n.next;
                break;
            }
            temp = temp.next;
        }while(temp!=head);
    }




    public class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(Node next, int value) {
            this.next = next;
            this.value = value;
        }
    }
}
