import java.util.LinkedList;

public class LL {

    Node head;
    int size;
    
    public class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
//inserting node at first position

public void insertFirst(String data){
    Node newNode = new Node(data);
    if(head==null){
        head=newNode;
        return;
    }
    newNode.next=head;
    head=newNode;
}

//insert at last function
public void insertEnd(String data){
    
}

//display function
public void displayList(){
    if(head==null){
        System.out.println("The list is empty");
    }
    Node currNode = head;
    while(currNode!=null){
        System.out.print(currNode.data+"-->");
        currNode=currNode.next;
    }
    System.out.println("Null");
}



    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst("a");
        list.insertFirst("is");
        list.displayList();
    }
}
