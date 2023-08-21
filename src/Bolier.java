import org.w3c.dom.Node;

public class Bolier {
    public static void main(String[] Arg){
        System.out.println("Hellow");
        ListNode[] arry= new ListNode()[]{1,2,3,4,5};
        reverseList(arry,2,4);
    }


    public ListNode create_linkList(int[] array){
        
        ListNode list=null;
        int i=0;
        while( i<array.length){
            Node new_node= new Node(array[i]);
            if(list==null){
                
                list=new_node;
            }else{

            }
            i++;
        }
        return null;

    }


    public ListNode reverseList(ListNode head, int left, int right) {
        ListNode tempnext;
        ListNode prev=null;
        ListNode current= head;
        int i=0;
        while( current!=null){
            tempnext= current.next;
            if(right<=i && i<=left){
                current.next=prev;
            }
            
            prev=current;
            current=tempnext;
            i++;
        }
        
        return prev;
    }

    
}



 // Definition for singly-linked list.
  class ListNode {
      public Node head;
        int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


