class MergeKSortedList {
    public ListNode mergeKLists(ListNode[] lists) {
            if (lists == null || lists.length == 0) {
                return null;
            }
            return partition(lists, 0, lists.length - 1);
        }
        
        // partition k lists in pairs
        private ListNode partition(ListNode[] lists, int left, int right) {
            // base case
            if (left == right) {
                return lists[left];
            }
            int mid = left + (right - left) / 2;
            ListNode leftList = partition(lists, left, mid);
            ListNode rightList = partition(lists, mid + 1, right);
            return merge(leftList, rightList);
        }
        
        // merge 2 sorted linked list
        private ListNode merge(ListNode leftList, ListNode rightList) {
            ListNode result = new ListNode(0);
            ListNode curr = result;
            while (leftList != null && rightList != null) {
                if (leftList.val < rightList.val) {
                    curr.next = leftList;
                    leftList = leftList.next;
                } else {
                    curr.next = rightList;
                    rightList = rightList.next;
                }
                curr = curr.next;
            }
            if (leftList == null) {
                curr.next = rightList;
            }
            if (rightList == null) {
                curr.next = leftList;
            }
            return result.next;
        }
}