class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}

public class InsertionAndDeletion {
    // Convert array to linked list
    public static Node ConvertArrayToLL(int[] arr){
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i=1; i<arr.length; i++){
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }
// display the linked list
    public static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    // insert at the beginning of the linked list
    public static Node insertAtBeginning(Node head, int data){
        Node temp = new Node(data);
        temp.next = head;
        return temp;
    }

    // insert at the end of the linked list
    public static Node insertAtEnd(Node head,int data){
        Node temp = new Node(data);
        if(head==null){
            return temp;
        }
        Node last = head;
        while(last.next!=null){
            last = last.next;
        }
        last.next = temp;

        return head;

    }

    // insert at kth position
    public static Node insertAtKthPosition(Node head, int data, int k){
        Node temp =  new Node(data);
        if(k==1){
            temp.next = head;
            return temp;
        }
        // Node prev = null;
        Node curr = head;
        int count = 0;
        while(curr!=null){
            count++;
            if(count == k-1){
                Node x =  new Node(data);
                x.next = curr.next;
                curr.next = x;
                
                break;
            }
            curr = curr.next;
        }
        return head;
    }

    // insert before a given value
    public static Node insertBeforeValue(Node head, int value, int data){
        if(head == null)return null;
        if(head.data == value){
            Node temp = new Node(data);
            temp.next = head;
            return temp;
        }
        Node temp = head;
        while(temp.next!=null){
            if(temp.next.data == value){
                Node x = new Node(data);
                x.next = temp.next;
                temp.next = x;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    // delete the first Node of the linked list
    public static Node deleteFirstNode(Node head){
        if(head == null)return null;
        Node temp = head;
        head = head.next;
        temp = null;
        return head;
    }

    // delete the last Node of the linked list
    public static Node deleteLastNode(Node head){
        if(head == null)return null;
        if(head.next == null)return null;
        Node temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }


//  delete  at kth position
public static Node deleleAtKthPosition(Node head, int k){
          
    if(head == null)return null;
    if( k == 1){
        Node temp = head;
        head = head.next;
        temp = null;
        return head;
    }

    Node temp = head;
    Node prev = null;
    int count = 0;
    while(temp!=null){
        count++;
        if(count == k){
          prev.next = prev.next.next;
          temp = null;
          break;
        }
        prev = temp;
        temp = temp.next;
    }

    return head;
}

// delete a value from the linked list
public static Node deleteValue(Node head, int value){
    if(head == null)return null;
    if(head.data == value){
        Node temp = head;
        head = head.next;
        temp = null;
        return head;
    }
    Node temp = head;
    Node prev = null;
    while(temp!=null){
        if(temp.data == value){
            prev.next = prev.next.next;
            temp = null;
            break;
        }
        prev = temp;
        temp = temp.next;
    }

    return head;
}

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Node head = ConvertArrayToLL(arr);
        // head = insertAtBeginning(head, 4);
        // head = insertAtEnd(head, 6);
        // head = insertAtKthPosition(head, 7, 3);
        // head = insertBeforeValue(head, 5, 34);

        // head = deleleAtKthPosition(head,  3);
        // head = deleteValue(head, 34);
        // head = deleteLastNode(head);
        // head = deleteFirstNode(head);

        display(head);
    }
}
