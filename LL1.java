public class LL1 {
    public static void main(String[] args){
        LL1 list  = new LL1();
        list.insertFirst(3);
        list.insertFirst(15);
        list.insertFirst(13);
        list.insertLast(22);

        list.display();
    }
    public Node head;
    public Node tail;
    public int size;
    public LL1(){
        this.size = 0; 
    }

    public class Node{
        int value;
        Node next;

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
        public Node(int value){
            this.value = value;
        }
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

    public void display(){
        Node temp = head ;
        while( temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END.");
    }

    public void insertLast(int value){
        Node node = new Node(value);
        if(tail == null){
            insertFirst(value);
            return;
        }
        tail.next = node;
        tail = node;
        size ++;
    }

}
