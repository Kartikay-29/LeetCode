class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0, head);
        ListNode slow = start;
        ListNode fast = start;

        boolean flag = false;
        while (fast != null && fast.next != null) {
            if (n-- == 0) 
                flag = true;
            if (flag)
                slow = slow.next; 
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return start.next;
    }
}