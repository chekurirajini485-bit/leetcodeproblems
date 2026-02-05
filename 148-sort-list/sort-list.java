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
    
    // using merge sort
    public ListNode sortList(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }
    
        ListNode mid = middle(head);
        ListNode righHead = mid.next ; // rightHead of right when we divide list in 2 half
        mid.next = null ; 
        ListNode left = sortList(head);
        ListNode right = sortList(righHead);

        return merge(left,right) ;
    }

    public ListNode middle(ListNode head){
        ListNode fast = head.next ; // this is coz our even list divide in "why this see below "
        
        // 1 → 2 → 3 → 4
        // 2 and 2 if we take fast = head.next: // Left:  1 → 2
                                                // Right: 3 -> 4

        // 3 and 1  if we take fast = head ; : // Left: 1 → 2 → 3
                                               // Right: 4
        ListNode slow = head ;

        while(fast != null && fast.next != null){
            slow = slow.next ;
            fast = fast.next.next ;
        }

        return slow ;
    }

    public ListNode merge(ListNode list1 , ListNode list2 ){
        ListNode dummy = new ListNode();
        ListNode temp = dummy ;
        ListNode temp1 = list1 ;
        ListNode temp2 = list2 ;

        while(temp1 != null && temp2 != null){
            if(temp1.val < temp2.val){
                temp.next = temp1;
                temp1 = temp1.next ;
            }else{
                temp.next = temp2;
                temp2 = temp2.next ;
            }
            temp = temp.next ;
        }

        while(temp1 != null ){
            temp.next = temp1;
            temp1 = temp1.next ;
            temp = temp.next ;
        }

        while(temp2 != null ){
            temp.next = temp2;
            temp2 = temp2.next ;
            temp = temp.next ;
        }

        return dummy.next ;
    }

    // // this is using bubble sort using iteration but gives tle
    // public ListNode sortList(ListNode head) {

    //     if (head == null || head.next == null) {
    //         return head;
    //     }

    //     boolean swappe
    
    // initally true cause when there will be no swap we will do it false;
    //     while (swapped) {

    //         swapped = false;

    //         ListNode prev = null;
    //         ListNode first = head;
    //         ListNode second = head.next;

    //         while (second != null) {
    //             if (first.val > second.val && first == head) {
    //                 swapped = true;
                    
    //                 head = second;
    //                 first.next = second.next;
    //                 second.next = first;


    //                 // after swap pointer point correction
    //                 ListNode temp = second;
    //                 second = first;
    //                 first = temp;

    //             } else if (first.val > second.val) {
    //                 swapped = true;

    //                 prev.next = second;
    //                 first.next = second.next;
    //                 second.next = first;
                    
    //                 // after swap pointer point correction 
    //                 ListNode temp = second;
    //                 second = first;
    //                 first = temp;


    //             }
    //             // movement of pointer so that they move forword for nect comparison 
    //             prev = first;
    //             first = first.next;
    //             second = second.next;
    //         }

    //     }

    //     return head;
    // }
}