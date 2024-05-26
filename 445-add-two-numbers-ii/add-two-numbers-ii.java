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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
       ListNode temp=dummy;
        ListNode l1head=reverse(l1);
        ListNode l2head=reverse(l2);
        int carry=0;
        while(l1head!=null || l2head!=null || carry==1){
            int sum=0;
            if(l1head!=null){
                sum+=l1head.val;
                l1head=l1head.next;
            }
            if(l2head!=null){
                sum+=l2head.val;
                l2head=l2head.next;
            }
            sum+=carry;
            carry=sum/10;
            ListNode newnode=new ListNode(sum%10);
            temp.next=newnode;
            temp=temp.next;
            
        }
        ListNode n=reverse(dummy.next);
        return n;
    }
    public ListNode reverse(ListNode l){
        ListNode prev=null;
        ListNode pres=l;
        ListNode next=l.next;
        while(pres!=null){
            pres.next=prev;
            prev=pres;
            pres=next;
            if(next!=null){
                next=next.next;
            }
        }
        l=prev;
        return l;
    }
}