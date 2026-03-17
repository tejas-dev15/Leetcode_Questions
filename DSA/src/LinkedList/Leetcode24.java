package LinkedList;

public class Leetcode24 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    class Solution {
        public ListNode swapPairs(ListNode head) {

            if(head==null){
                return null;
            }
            else if(head.next==null){
                return head;
            }

            ListNode slow = head;
            ListNode fast = head.next;

            int temp = slow.val;
            slow.val = fast.val;
            fast.val = temp;
            while(fast.next != null){
                if(fast.next.next == null){
                    return head;
                }
                fast = fast.next.next;
                slow = slow.next.next;

                temp = slow.val;
                slow.val = fast.val;
                fast.val = temp;
            }
            return head;
        }
    }
}
