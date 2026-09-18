/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1=new ListNode(0);
        ListNode dummy2=new ListNode(0);
        ListNode l1=dummy1;
        ListNode l2=dummy2;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x){
             l1.next=temp;
             l1=l1.next;
            }
            else if(temp.val>=x){
                l2.next=temp;
                l2=l2.next;
            }
            temp=temp.next;
        }
        l2.next=null;
        l1.next=dummy2.next;
        return dummy1.next;
    }
}