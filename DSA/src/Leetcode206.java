public class Leetcode206{
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode reverseList(ListNode head) {

        if(head==null){
            return head;
        }
        else if(head.next == null){
            return head;
        }


        ListNode current = head;
        ListNode prev =null;
        ListNode nxt;

        while(current!= null){
            nxt = current.next;
            current.next = prev;
            prev = current;
            current = nxt;
        }


        return prev;
    }
}
