package LinkedList;

public class Leetcode234 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }


        public boolean isPalindrome(ListNode head) {

            if (head.next == null) {
                return true;
            }
            if (head == null) {
                return false;
            }

            ListNode middle = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                middle = middle.next;
                fast = fast.next.next;
            }

            ListNode prev = null;
            ListNode current = middle;

            while (current != null) {
                ListNode nxt = current.next;
                current.next = prev;
                prev = current;
                current = nxt;
            }

            ListNode temp = head;

            while (prev != null) {
                if (temp.val == prev.val) {
                    prev = prev.next;
                    temp = temp.next;
                } else {
                    return false;
                }
            }
            return true;

        }
    }
}