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
    public ListNode reverseKGroup(ListNode head, int k) {
       ListNode temp = head;
        
        // Initialize a pointer to track the
        // last node of the previous group
        ListNode prevLast = null;
        
        // Traverse through the linked list
        while (temp != null) {
            
            // Get the Kth node of the current group
           ListNode kThNode = getkthnode(temp, k);
            
            // If the Kth node is NULL
            // (not a complete group)
            if (kThNode == null) {
               
                // If there was a previous group,
                // link the last node to the current node
                if (prevLast != null) {
                    prevLast.next = temp;
                }
                
                // Exit the loop
                break;
            }
            
            // Store the next node
            // after the Kth node
            ListNode nextNode = kThNode.next;
            
            // Disconnect the Kth node
            // to prepare for reversal
            kThNode.next = null;
            
            // Reverse the nodes from
            // temp to the Kth node
            reverseLinkedList(temp);
            
             // Adjust the head if the reversal
            // starts from the head
            if (temp == head) {
                head = kThNode;
            } else {
                
                prevLast.next = kThNode;
            }
            
          
            prevLast = temp;
            
            // Move to the next group
            temp = nextNode;
        }
        
        // Return the head of the
        // modified linked list
        return head;
        
    }
    public ListNode getkthnode(ListNode head,int k){
        ListNode temp = head;
        while (temp != null && --k > 0) {
            temp = temp.next;
        }
        return temp;
    }
    public ListNode  reverseLinkedList(ListNode head){
         if(head==null){
            return head;
        }
        ListNode prev=null;
        ListNode  pres=head;
        ListNode next=pres.next;
        while(pres!=null){
          pres.next=prev;
            prev=pres;
            pres=next;
            if(next!=null){
            next=next.next;
            }
        }
        head=prev;
        
        return head;
    }
}