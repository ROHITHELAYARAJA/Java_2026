public class LL {

  private Node head;
  private Node tail;
  private int size ;
  public LL(){
      this.size = 0;
  }

  public void insertRec(int value, int index){
      head =  insertRec(value, index, head);

  }
  private Node insertRec(int value,int index,Node node){
      if(index==0){
          Node temp = new Node(value,node);
          size++;
          return temp;
      }
      node.next = insertRec(value,--index,node.next);
      return node;
  }

  public void display(){
      Node temp = head;
      while(temp!=null){
          System.out.print(temp.value+" -> ");
          temp = temp.next;
      }
      System.out.print("END");
  }

  public void insertFirst(int value){
      Node node = new Node(value);
      node.next = head;
      head = node;


      if(tail == null){
          tail = head;
      }
      size++;
  }
    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int value ,int index)
    {
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next = node;
    }

    public int deleteFirst(){
      int val  = head.value;
      head = head.next;
      if(head == null){
          tail = null;
      }
      size--;
      return val;
    }

    public int delete(int index){
      if(index==0){
          deleteFirst();
      }
      if(index==size-1){
          deleteLast();
      }
      Node prev = get(index);
      int val = prev.next.value;
      prev.next = prev.next.next;

      size--;
      return val;


    }

    public  int deleteLast(){
      if(size<=1){
          deleteFirst();
      }
      int val  = tail.value;
      Node secondLast = get(size - 1);
      tail = secondLast;
      tail.next = null;
      return val;

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

    public  Node get(int index){
      Node temp = head;
      for (int i = 1; i < index; i++) {
          temp = temp.next;
      }
      return temp;
    }

// IMPORTANT IMPORTANT IMPORTANT IMPORTANT IMPORTANT IMPORTANT IMPORTANT IMPORTANT IMPORTANT IMPORTANT IMPORTANT IMPORTANT IMPORTANT
  private static class Node{
      private int value;
      private Node next;
      public Node(int value){
          this.value = value;
          this.next = null;
      }
      public  Node(int value,Node next){
          this.value = value;
          this.next = next;
      }
  }
// IMPORTANT IMPORTANT IMPORTANT IMPORTANT IMPORTANT IMPORTANT IMPORTANT IMPORTANT IMPORTANT IMPORTANT IMPORTANT IMPORTANT IMPORTANT

  public void Duplicates(){
      Node temp = head;
      while(temp.next!=null){
          if(temp.value==temp.next.value){
              temp.next=temp.next.next;
              size--;
          }
          else{
              temp = temp.next;
          }
      }
      tail = temp;
      tail.next = null;
  }

  public static LL merge(LL x, LL y){

      Node a = x.head;
      Node b = y.head;
      LL node = new LL();
      while(a!=null &&b!=null){
          if(a.value<b.value){
              node.insertLast(a.value);
              a =  a.next;
          }
          else{
              node.insertLast(b.value);
              b =  b.next;
          }
      }
      while(a!=null){
          node.insertFirst(a.value);
          a =  a.next;
      }
      while(b!=null){
          node.insertLast(b.value);
          b =  b.next;
      }
      return node;
  }
    public static Node findTail(Node head) {

        if (head == null || head.next == null) {
            return head;
        }

        return findTail(head.next);
    }


    public static boolean hasCycle(Node head) {
      Node fast = head;
      Node slow = head;
      while(fast!=null && fast.next!=null){
          slow = slow.next;
          fast = fast.next.next;
          if(slow==fast){
              return true;
          }
      }
      return false;
    }

    public static int lengthCycle(Node head) {
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) {
                int length = 0;
                Node temp = slow;
                do {
                    temp = temp.next;
                    length++;
                } while (temp != slow);
                return length;
            }
        }
        return 0;
  }
    public static int lastElement(Node temp) {
        if (temp == null) {
            return 0;
        }

        return 1 + lastElement(temp.next);
    }
    static void main() {
        LL obj = new LL();
        obj.insertFirst(1);
        obj.insertLast(1);
        obj.insertLast(1);
        obj.insertLast(3);
        obj.insertLast(3);
        obj.display();
        System.out.println();
        obj.Duplicates();
        obj.display();

        LL obj2 = new LL();
        obj2.insertFirst(1);
        obj2.insertLast(5);
        obj2.insertLast(9);
        LL obj3 = new LL();
        obj3.insertFirst(2);
        obj3.insertLast(4);
        System.out.println();

        LL ans = merge(obj2,obj3);
        ans.display();
        Node x = findTail(obj.head);
        System.out.println();
        System.out.println(x.value);
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);


        System.out.println();



        System.out.println(lastElement(head));
    }
}
