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

         // Dummy düğüm oluşturuluyor, geri dönüş değeri olarak kullanılacak
        ListNode dummy = new ListNode(-1);
        // Şu anki düğüm başlangıçta dummy düğümü
        ListNode current = dummy;

        // Her iki liste de boş olmadığı sürece devam eden bir döngü
        while (list1 != null && list2 != null) {
            // list1'in değeri list2'den küçük veya eşitse
            if (list1.val <= list2.val) {
                // Şu anki düğümü list1'e bağla
                current.next = list1;
                // list1'de bir sonraki düğüme geç
                list1 = list1.next;
            } else {
                // list2'nin değeri list1'den küçükse
                // Şu anki düğümü list2'ye bağla
                current.next = list2;
                // list2'de bir sonraki düğüme geç
                list2 = list2.next;
            }
            // Şu anki düğümü ilerlet
            current = current.next;
        }

        // Bir liste tamamlandığında, diğer listedeki düğümleri sona ekler
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        // Dummy düğümün bir sonraki düğümü, birleştirilmiş listeyi temsil eder
        return dummy.next;


        
        
    }
}