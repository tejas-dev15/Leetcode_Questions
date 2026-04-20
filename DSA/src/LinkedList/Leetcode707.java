package LinkedList;

public class Leetcode707 {
    class MyLinkedList {
        Node head;
        int size = 0;

        class Node {
            int val;
            Node next;

            Node(int val) {
                this.val = val;
            }
        }

        public MyLinkedList() {
            head = null;
        }

        public int get(int index) {
            if (index >= size || index < 0) {
                return -1;
            }
            Node temp = head;
            int count = 0;
            while (count != index) {
                temp = temp.next;
                count++;
            }
            return temp.val;
        }

        public void addAtHead(int val) {

            Node node = new Node(val);
            node.next = head;
            head = node;
            size++;
        }

        public void addAtTail(int val) {
            if (head == null) {
                addAtHead(val);
                return;
            }

            Node node = new Node(val);
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
            size++;
        }

        public void addAtIndex(int index, int val) {
            if (index > size) {
                return;
            }
            if (index < 0) {
                addAtHead(val);
                return;
            }
            if (index == size) {
                addAtTail(val);
                return;
            }
            if (index == 0) {
                addAtHead(val);
                return;
            }
            Node temp = head;
            Node node = new Node(val);
            int count = 1;
            while (count < index) {
                temp = temp.next;
                count++;
            }
            Node nxt = temp.next;
            temp.next = node;
            node.next = nxt;
            size++;
        }

        public void deleteAtIndex(int index) {
            if (index >= size || index < 0) {
                return;
            }
            Node temp = head;
            if (index == 0) {
                Node delhead = head;
                head = head.next;
                delhead.next = null;
                size--;
                return;
            }
            int count = 1;
            while (count < index) {
                temp = temp.next;
                count++;
            }

            temp.next = temp.next.next;

            size--;
        }
    }
}

