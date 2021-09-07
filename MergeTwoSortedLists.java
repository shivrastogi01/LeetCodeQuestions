class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode resultHead = new ListNode(0); 
        ListNode tem1 = l1, tem2 = l2, current = resultHead; 
        
        while( tem1 != null || tem2 != null){
            int n1 = (tem1 != null) ? tem1.val : 100; 
            int n2 = (tem2 != null) ? tem2.val : 100; 
            
            if(n1 < n2){
                current.next = new ListNode(n1); 
                tem1 = tem1.next; 
                current = current.next;
            } else {
                current.next = new ListNode(n2); 
                tem2 = tem2.next; 
                current = current.next;
            }
        }        
        return resultHead.next;
    }
}