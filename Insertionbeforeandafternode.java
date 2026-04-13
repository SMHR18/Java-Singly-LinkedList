public class lls5 {
    
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
    
    // ----Insert after the key node------------------------------------
    public void insertAfterNode(int data, int key){
        Node newNode = new Node (data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode != null && currNode.data != key){
            currNode = currNode.next;
        }

        if(currNode == null){
            System.out.println("Key not found");
            return;
        }

        newNode.next = currNode.next;
        currNode.next = newNode;
    }

    // ----Insert before the key node------------------------------------
    public void insertBeforeNode(int data, int key){
        Node newNode = new Node (data);
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        if(head.data == key){
            newNode.next = head;
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null && currNode.next.data != key){
            currNode = currNode.next;
        }

        if(currNode.next == null){
            System.out.println("Key not found");
            return;
        }

        newNode.next = currNode.next;
        currNode.next = newNode;
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
        lls5 list =  new lls5();
        list.head = list.new Node(1);
        list.head.next = list.new Node(2);
        list.head.next.next = list.new Node(3);
        System.out.println("list before :");
        list.printlist();

        System.out.println("Inserting 4 after 2");
        list.insertAfterNode(4, 2);
        System.out.println("list after :");
        list.printlist();

        System.out.println("Inserting 5 before 2");
        list.insertBeforeNode(5, 2);
        System.out.println("list after :");
        list.printlist();


        System.out.println("\nName: Syed Muhammad Huzaifa Raza\n"+"Seat number: EB25210006097\n"+"Section A");

        }
    
}
