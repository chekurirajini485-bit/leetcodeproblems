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
    int carry=0;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null)return l2;
        if(l2==null)return l1;
        ListNode node=new ListNode(0);
        ListNode ans=node,thead1=l1,thead2=l2;
        while(thead1!=null&&thead2!=null){
            int val=thead1.val+thead2.val+carry;
            node.next=new ListNode(val%10);
            carry=val/10;
            node=node.next;
            thead1=thead1.next;
            thead2=thead2.next;
        }
        if(thead1!=null){
            while(thead1!=null){
                int val=thead1.val+carry;
                node.next=new ListNode(val%10);
                carry=val/10;
                thead1=thead1.next;
                node=node.next;
            }
        }
        if(thead2!=null){
            while(thead2!=null){
                int val=thead2.val+carry;
                node.next=new ListNode(val%10);
                carry=val/10;
                thead2=thead2.next;
                node=node.next;
            }
        }
        if(carry!=0){
            node.next=new ListNode(carry);
            node=node.next;
            node=null;
        }
        return ans.next;
    }
}