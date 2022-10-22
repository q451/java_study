package linkedPackage;
class Node{
    private String data;
    private Node next;

    public Node(String data){
        this.data = data;
    }
    public String getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }


}
public class NodeTest {
    public static void main(String[] args) {
        Node root = new Node("火车头");
        Node n = new Node("车厢A");
        Node n1 = new Node("车厢B");

        root.setNext(n);
        n.setNext(n1);

        System.out.println(root.getData());
        printNode(root);
    }

    public static void printNode(Node node){
        System.out.println(node.getData());
        if(node.getNext() != null){
            printNode(node.getNext());
        }
    }
}
