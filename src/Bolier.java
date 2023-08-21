public class Bolier {
    public static void main(String[] Arg){
        System.out.println("Hellow");

    }


    public ListNode reverseList(ListNode head) {
        ListNode tempnext;
        ListNode prev=null;
        ListNode current= head;
        while( current!=null){
            tempnext= current.next;
            current.next=prev;
            prev=current;
            current=tempnext;
        }
        return prev;
    }

    
}



 // Definition for singly-linked list.
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


