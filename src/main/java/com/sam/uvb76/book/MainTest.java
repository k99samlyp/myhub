package com.sam.uvb76.book;


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

class Solution {

    public ListNode ReverseList(ListNode head) {
        ListNode p = head;
        ListNode q;
        ListNode t = p.next;

        while(true){
            q = t.next;
            t.next = p;
            p =t;
            t = q;
            if(q == null){
                break;
            }
        }
        return p;

    }
}



public class MainTest {

    public static void main(String[] args) {

        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        Solution s1 = new Solution();
        System.out.println(s1.ReverseList(n1).val);
    }


}
