public class lls3 {

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

    // ----Delete Entire list------------------------------------
    public void deleteEntireList(){
    head = null;
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
        lls3 list =  new lls3();
         list.head = list.new Node(1);
         Node second = list.new Node(2);
         list.head.next = second;
        Node third = list.new Node(3);
        second.next = third;
        
        System.out.println("list before :");
        list.printlist();
        
        list.deleteEntireList();
        System.out.println("list after :");
        list.printlist();

        System.out.println("\nName: Syed Muhammad Huzaifa Raza\n"+"Seat number: EB25210006097\n"+"Section A");

        }
    
}
