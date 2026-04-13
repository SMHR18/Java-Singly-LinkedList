public class lls7 {
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
    
    // ----Print List------------------------------------

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

    // ----searching------------------------------------
    public boolean search(int key){
        Node currNode = head;
        while(currNode != null){
            if(currNode.data == key){
                return true;
            }
            currNode = currNode.next;
        }
        return false;
    }

    // ----Length Calculation------------------------------------
    public int length(){
        int count = 0;
        Node currNode = head;
        while(currNode != null){
            count++;
            currNode = currNode.next;
        }
        return count;
    }
    
    

    
    public static void main (String[] args){
        lls7 list =  new lls7();
        list.head = list.new Node(1);
        list.head.next = list.new Node(2);
        list.head.next.next = list.new Node(3);
        System.out.println("list:");
        list.printlist();

        System.out.println("Search valid value :");
        System.out.println(list.search(2));

        System.out.println("Search invalid value :");
        System.out.println(list.search(5));

        System.out.println("Length of the list :");
        System.out.println(list.length());

        System.out.println("\nName: Syed Muhammad Huzaifa Raza\n"+"Seat number: EB25210006097\n"+"Section A");

        }
    
}
