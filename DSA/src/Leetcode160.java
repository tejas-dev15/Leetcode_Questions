public class Leetcode160 {


      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }
     

        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

            ListNode fast_0 = headA;
            ListNode fast_1 = headB;

            if(headA == null && headB == null){
                return null;
            }

            if(fast_0 == fast_1){
                return fast_0;
            }

            while(fast_0 != fast_1){

                if(fast_0==fast_1){
                    return fast_0;
                }

                if(fast_0 != null){
                    fast_0 = fast_0.next;
                }else{
                    fast_0 = headB;
                }

                if(fast_1 !=null){
                    fast_1 = fast_1.next;
                }else{
                    fast_1 = headA;
                }
                if(fast_0==fast_1){
                    return fast_0;
                }
            }
            return null;
        }

}
