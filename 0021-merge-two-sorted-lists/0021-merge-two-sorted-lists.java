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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        // Creating a temp node, which will be used as the return value
        ListNode temp = new ListNode(-1);
       
        // The current node initially points to the temp node
        ListNode head = temp;

        // Loop until both lists are not empty
        while (list1 != null && list2 != null) {
            // If the value in list1 is less than or equal to the value in list2
            if (list1.val <= list2.val) {
                // Connect the current node to list1
                head.next = list1;
                // Move to the next node in list1
                list1 = list1.next;
            } else {
                // If the value in list2 is greater than the value in list1
                // Connect the current node to list2
                head.next = list2;
                // Move to the next node in list2
                list2 = list2.next;
            }
            // Move the current node forward
            head = head.next;
        }

        // Attach the remaining non-null list to the end
        if (list1 != null) {
            head.next = list1;
        } else {
            head.next = list2;
        }
      
        // The temp node's next should be the actual start of the merged list
        return temp.next;
    }
}
