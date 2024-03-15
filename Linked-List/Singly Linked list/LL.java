class SNode{
    int data;
    SNode next;
    SNode(int data){
        this.data = data;
        this.next = null;
    }
}

public class LL{

    public static SNode ConvertArrayToLL(int[] arr){

        SNode head = new SNode(arr[0]);
        SNode temp = head;

        for(int i=1; i<arr.length; i++){
            temp.next = new SNode(arr[i]);
            temp = temp.next;
        }
        return head;
    }

// display the linked list
    public static void display(SNode head){
       
        while(head!=null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    // Count the length of the linked list
    public static int LengthOfLL(SNode head){
        SNode temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    // Search an element in the linked list
    public static boolean searchElementInLL(SNode head, int key){
        SNode temp = head;
        
        while(temp!=null){
            if(temp.data == key){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    // Odd Even List

    public static SNode oddEvenList(SNode head) {
        if( head == null || head.next == null ){
           return head;
       }
    
     
       SNode odd = head;
       SNode even = head.next;
       SNode newHead = head.next;
       while(even != null && even.next != null){
       odd.next = odd.next.next;
       even.next = even.next.next;
    
       odd = odd.next;
       even = even.next;
       }
    
       odd.next = newHead;
    
       
    
      return head;
    } 

//    Reverse the linked list

public static SNode reverseLL(SNode head){

    if(head == null || head.next == null){
        return head;
    }

    SNode temp = head;
    SNode prev = null;
    while(temp != null){

        SNode front = temp.next;  
        temp.next = prev;  

        prev = temp;  
 
        temp = front; 
    }

    return prev;
}

    

    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        SNode head = ConvertArrayToLL(arr);

        
        // System.out.println(LengthOfLL(head));
        // System.out.println(searchElementInLL(head,49));
        //  head = oddEvenList(head);
        head = reverseLL(head);
        display(head);


         

}
}