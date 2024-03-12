
class Node{
    int data;
    Node next;
    Node back;

    Node(int data, Node next, Node back){
        this.data = data;
        this.next = next;
        this.back = back;
    }

    Node(int data){
    this.data = data;
    this.next =null;
    this.back = null;
   }

}


public class DLL {
//    display the doubly linked list
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
// convert array to doubly linked list
    public static Node convertArr2DLL(int[] arr){
        Node head = new Node(arr[0],null,null);
        Node prev = head;
        for(int i =1;i<arr.length; i++){
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    // delete at the Head of the doubly linked list
     public static Node deleteAtHead(Node head){
        if(head == null || head.next== null)return null;
        Node prev = head;
        head = head.next;
        head.back = null;
        prev.next = null;
        prev = head;
     return head;
     }

    //  delete at the Tail of the doubly linked list
    public static Node deleteAtTail(Node head){
        if(head == null || head.next== null)return null;
        Node tail = head;
      
        while(tail.next!=null){
            tail = tail.next;
        }
        Node prev = tail.back;
        prev.next  = null;
        tail.back = null;
        return head;
        
    }
   
    public static void main(String[] args) {
    
        int arr[] = {1,2,3,4};
        Node head =  convertArr2DLL(arr);
        
        head = deleteAtTail(head);
       
        display(head);

    }
}
