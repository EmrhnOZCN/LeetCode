/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
     public boolean hasCycle(ListNode head) {


        HashSet<ListNode> hashSet = new HashSet();


        ListNode temp =head;

        while (temp!=null ){
        
            if(hashSet.contains(temp)){
                

                return true;
                
            } 

           hashSet.add(temp);
            
           temp=temp.next;
            
        }




        return false;
    }
}