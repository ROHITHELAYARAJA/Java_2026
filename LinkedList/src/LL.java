public class LL {

  private Node head;
  private Node tail;
  private int size ;
  public LL(){
      this.size = 0;
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


  private class Node{
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
}
