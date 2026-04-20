package LinkedList;

public class Leetcode1472 {
    Node head;
    Node current;
    class Node{
        String site;
        Node next;
        Node prev;

        Node(String site){
            this.site = site;
            next = null;
            prev = null;
        }
    }

    public void BrowserHistory(String homepage) {
        Node node = new Node(homepage);
        head = node;
        current = node;
    }

    public void visit(String url) {
        if(head==null){
            return;
        }

        Node node = new Node(url);
        current.next  = node;
        node.prev = current;
        current = node;
        current.next = null;
    }

    public String back(int steps) {
        if(steps < 0){
            return null;
        }

        for(int i =0; i<steps; i++){
            if(current.prev != null){
                current = current.prev;
            }else{
                return current.site;
            }
        }
        return current.site;
    }

    public String forward(int steps){
        if(steps< 0){
            return null;
        }

        for(int i =0; i<steps; i++){
            if(current.next != null){
                current = current.next;
            }else{
                return current.site;
            }
        }
        return current.site;
    }
}
