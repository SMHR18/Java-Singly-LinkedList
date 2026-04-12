public class lls {
 
    // ----Node Class------------------------------------
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    // ----Linked List Class------------------------------------
    class LinkedList{
             LinkedList(){
                head = null;
             }
    }
    
    // ----Insert at the beginning------------------------------------
    public void addFirst(int data){
        Node newNode = new Node (data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // ----Insert at the end------------------------------------
    public void Last(int data){
        Node newNode = new Node (data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    //print
    public void printlist(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->" );
            currNode = currNode.next;
        }

        System.out.println("Null");

    }
    
    

    
    public static void main (String[] args){
        lls list =  new lls();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);

        System.out.println("list:");
        list.printlist();
        
        list.Last(4);
        list.Last(5);
        list.printlist();
        }
}
