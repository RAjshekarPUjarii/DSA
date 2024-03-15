
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
        if(arr.length == 0)return null;
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

    // delete at the Kth position of the doubly linked list
    public static Node deleteAtKthPos(Node head, int k){

        if(head == null)return null;


        Node temp = head;
        int count = 0;
        while(temp!=null ){
            count++;
            if(count == k ){
                break;
            }
            temp = temp.next;
            
        }
        
        
       
        Node prev = temp.back;
        Node front = temp.next;
        
        if(front == null && prev == null){
            return null;
        }else if(front == null){
            return deleteAtTail(head);
        }else if(prev == null){
            return deleteAtHead(head);
        }

        prev.next = front;
        front.back = prev;
        temp.next = null;
        temp.back = null;

        return head;
        
    }

    // delete the node with the given value
    private static void deleteNode(Node temp){
         Node prev = temp.back;
        Node front = temp.next;
        if(front==null){
            prev.next = null;
            temp.back = null;
            return;
        }
        
       
        prev.next = front;
        front.back = prev;
        
        temp.next = null;
        temp.back = null;
        
       
        return;
}

//   Insertion problems
// 1. Insertion at the head
public static Node insertAtHead(Node head, int data){

    if(head == null){
        return new Node(data);
    }
    Node temp = new Node(data);
    temp.next = head;
    head.back = temp;
    return temp;
}

// 2. Insertion at the tail
public static Node insertAtTail(Node head, int data){
    if(head == null){
        return new Node(data);
    }
    Node temp = head;
    while(temp.next!=null){
        temp = temp.next;
    }
    Node newNode = new Node(data);
    temp.next = newNode;
    newNode.back = temp;
    newNode.next = null;
    return head;
}

//  insert before the tail
public static Node insertBeforeTail(Node head, int data){
    if(head == null){
        return new Node(data);
    }
   Node newNode = new Node(data);
    if(head.next == null){
   newNode.next = head;
   newNode.back = null;
   head.back = newNode;
}

Node temp =head;
while(temp.next!= null){
    temp = temp.next;
}
Node back = temp.back;

back.next = newNode;
newNode.back = back;

newNode.next = temp;
temp.back = newNode;



return head;
}

public static Node oddEvenList(Node head) {
    if( head == null || head.next == null ){
       return head;
   }

 
   Node odd = head;
   Node even = head.next;
   Node newHead = head.next;
   while(even != null && even.next != null){
   odd.next = odd.next.next;
   even.next = even.next.next;

   odd = odd.next.next;
   even = even.next.next;
   }

   odd.next = newHead;

   

  return head;
} 

   
    public static void main(String[] args) {
    
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        Node head =  convertArr2DLL(arr);
        // head = deleteAtHead(head)
        // head = deleteAtTail(head);
        //   head = deleteAtKthPos(h ead,9);
        //  deleteNode(head.next);
        
        // insertions
        // head = insertAtHead(head,990);
        // head = insertAtTail(head,757);
        // head = insertBeforeTail(head, 100);

        head = oddEvenList(head);
       
        display(head);

    }
}
