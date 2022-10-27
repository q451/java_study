package linkedList;

import java.util.Stack;

public class LinkedTest {
    public static void main(String[] args) {
        ListNode res = LinkedTest.mergeListNode(LinkedTest.getList(),LinkedTest.getList1());
        for (int i =0; i<LinkedTest.length(res);i++){
            System.out.println(res.val);
            res = res.next;
        }
//        System.out.println(res);
    }

    public static int length(ListNode listNode){
        if (listNode == null){
            return 0;
        }
        int count = 0;
        while (listNode != null){
            count++;
            listNode = listNode.next;
        }
        return count;
    }

    public static ListNode getList(){
        ListNode A = new ListNode(1);
        ListNode B = new ListNode(11);
        ListNode C = new ListNode(31);
        ListNode D = new ListNode(22);
        A.next = B;
        B.next = C;
        C.next = D;
        D.next = null;
        return A;
    }

    public static ListNode getList1(){
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(10);
        ListNode c = new ListNode(8);
        ListNode d = new ListNode(31);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        return a;
    }

    public static ListNode reserveListNode(ListNode listNode){
        Stack<ListNode> stack = new Stack<>();
        while (listNode != null){
            stack.push(listNode);
            listNode = listNode.next;
        }
        ListNode head = stack.pop();
        ListNode result = head;
        while (!stack.empty()){
            ListNode temp = stack.pop();
            head.next = temp;
            head = head.next;
        }
        head.next = null;
        return result;
    }

    public static ListNode mergeListNode(ListNode list1,ListNode list2){
        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }
        //第一个几点不知道，所有设置为0，取得时候直接去result.next
        ListNode result = new ListNode(0);
        ListNode temp = result;
        while (list1 != null && list2 != null){
            if(list1.val <= list2.val){
                temp.next = list1;
                list1 = list1.next;
            }else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        temp.next = list1 == null ? list2:list1;
        return result.next;
    }

}
