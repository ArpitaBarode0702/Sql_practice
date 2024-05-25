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
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null){
            return head;
        }
        ListNode node=new ListNode(0);
        ListNode slow=node;
           ListNode fast=node;
           ListNode start=node;
        ListNode temp=head;
        start.next=head;
        int count=1;
        while(count<k){
            temp=temp.next;
            count++;
        }
        // int value1=temp.val;
        
        for(int i=1;i<=k+1;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        //int value2=slow.next.val;
        //swapping
        int val=temp.val;
        temp.val=slow.next.val;
        slow.next.val=val;
        return head;
    }
}