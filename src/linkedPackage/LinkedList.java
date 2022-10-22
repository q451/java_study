package linkedPackage;

public class LinkedList {
    public class Node{
        public int data;
        public Node next;
    }
    private Node head = null;

    public Node find(int val){
        Node p = head;
        while(p != null && p.data!=val){
            p = p.next;
        }
        return p;
    }
    void insert(Node b, Node x){
        if (b == null){
            x.next = head;
            head = x;
        }else {
            x.next = b.next;
            b.next = x;
        }
    }

    void remove(Node a,Node b){
        if (a==null){
            head = head.next;
        }else {
            a.next = b.next;//a.next.next
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
    }
}
