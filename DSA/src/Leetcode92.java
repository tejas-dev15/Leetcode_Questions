public class Leetcode92 {

      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    class Solution {
        public ListNode reverseBetween(ListNode head, int left, int right) {

            if(head==null){
                return null;
            }

            if(head.next == null && left==1 && right ==1){
                return head;
            }

            ListNode slow = head;
            ListNode fast = head;
            int count = 1;
            int count2 = 1;
            ListNode before = null;
            while(count != left || count2 != right){

                if(count+1==left){
                    before =slow;
                }

                if(count != left){
                    if(slow != null){
                        slow = slow.next;
                        count++;
                    }
                }

                if(count2 != right){
                    if(fast != null){
                        fast = fast.next;
                        count2++;
                    }
                }
            }

            ListNode after;
            if(fast !=null){
                after = fast.next;
            }else{
                after = null;
            }

            ListNode prev = null;
            ListNode curr = slow;
            int count3 = 0;
            while(count3 != (right - left) + 1 && curr != null){
                ListNode nxt = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nxt;
                count3++;
            }
            if(before!=null){
                before.next = prev;
            }
            slow.next= after;
            if(left==1){
                return prev;
            }
            return head;
        }
    }
}
