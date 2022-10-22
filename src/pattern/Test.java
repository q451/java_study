package pattern;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class ListNode {
  int val;
  ListNode next;
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
public class Test {
    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode head1 = new ListNode(8);
        ListNode head2 = new ListNode(4);
        ListNode head3 = new ListNode(9);
        head.next = head1;
        head1.next = head2;
        head2.next = head3;
        head3.next = null;

        Test t = new Test();
        int last = t.length(head)-1;//2
        ListNode pre = head;
        for(int i =0;i<last;i++){
            pre = pre.next;
        }
        pre.next = pre.next.next;
        System.out.println(head);
    }
    public int length(ListNode head){
        int len = 0;
        while (head != null){
            len++;
            head = head.next;
        }
        return len;
    }

    public boolean t(int[] nums){
        Set<Integer> set = new HashSet<>();
        return true;
    }
}
