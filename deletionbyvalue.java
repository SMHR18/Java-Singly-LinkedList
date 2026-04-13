public class lls4 {
    
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

    // ----Delete  By Value------------------------------------
    public void deleteByValue(int data){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.data == data){
            head = head.next;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            if(currNode.next.data == data){
                currNode.next = currNode.next.next;
                return;
            }
            currNode = currNode.next;
        }
        System.out.println("Node with data " + data + " not found");
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
        lls4 list =  new lls4();
         list.head = list.new Node(1);
         list.head.next = list.new Node(2);
         list.head.next.next = list.new Node(3);
                 
        System.out.println("list before :");
        list.printlist();
        
        System.out.println("Deleting 2");
        list.deleteByValue(2);
        System.out.println("list after :");
        list.printlist();

        System.out.println("Deleting 4");

        list.deleteByValue(4);
        System.out.println("the value 4 is not in the list, so the list remains unchanged:");
        
         System.out.println("\nName: Syed Muhammad Huzaifa Raza\n"+"Seat number: EB25210006097\n"+"Section A");
        
        }
    
}
