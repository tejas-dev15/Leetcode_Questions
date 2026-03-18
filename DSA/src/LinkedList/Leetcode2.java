package LinkedList;

public class Leetcode2 {

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next;
      }

       }

    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            ListNode Dummy = new ListNode(-1, null);
            ListNode temp =  Dummy;



            int sum = 0;
            int digit = 0;
            int carry =  0;
            while(l1 != null || l2 != null || carry!=0){
                sum = 0;
                digit = 0;

                int val1 = (l1 != null) ? l1.val : 0;
                int val2 = (l2 !=null) ? l2.val : 0;

                sum = val1 + val2 + carry;

                if(l1 != null){
                    l1 = l1.next;
                }
                if(l2 != null){
                    l2 = l2.next;
                }
                digit = sum % 10;
                carry = sum/10;

                ListNode newNode = new ListNode(digit);
                temp.next = newNode;
                temp = newNode;
            }

            return Dummy.next;

        }
    }
}
