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
        SNode temp = head;
        while(temp.next!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
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
    public static void main(String[] args) {
        int arr[] = {1,2,3,9,9,9,9};
        SNode head = ConvertArrayToLL(arr);
         display(head);
        // System.out.println(LengthOfLL(head));
        // System.out.println(searchElementInLL(head,49));
}
}