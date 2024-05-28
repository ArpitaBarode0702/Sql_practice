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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode mid=findmid(head);
        ListNode lefth=head;
        ListNode righth=mid.next;
        
        mid.next=null;
        ListNode left=sortList(lefth);
        ListNode right=sortList(righth);
        return merge(left,right);
        
    }
    public ListNode merge(ListNode left,ListNode right){
        ListNode dummy = new ListNode(0);
    ListNode current = dummy;
    while (left != null && right != null) {
        if (left.val < right.val) {
            current.next = left;
            left = left.next;
        } else {
            current.next = right;
            right = right.next;
        }
        current = current.next;
    }
    if (left != null) {
        current.next = left;
    }
    if (right != null) {
        current.next = right;
    }
    return dummy.next;
    }
    public ListNode findmid(ListNode node){
        ListNode s=node;
        ListNode f=node.next;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            
        }
        return s;
    }
}