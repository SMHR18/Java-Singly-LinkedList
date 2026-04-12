public class lls2 {

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
    
    // ----Delete at the beginning------------------------------------
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while(lastNode.next != null){
            secondLast = secondLast.next;
            lastNode = lastNode.next;
        }

        secondLast.next = null;

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
        lls2 list =  new lls2();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);

        System.out.println("list:");
        list.printlist();
        
        list.Last(4);
        list.Last(5);
        list.printlist();
        
        list.deleteFirst();
        list.printlist();

        list.deleteLast();
        list.printlist();


        System.out.println("\nName: Syed Muhammad Huzaifa Raza\n"+"Seat number: EB25210006097\n"+"Section A");

        }

    }
