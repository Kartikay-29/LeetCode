/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null; 

        }
        ListNode currA=headA;
        ListNode currB=headB;
        int lengthA=0;
        int lengthB=0;
        while(currA!=null){
            lengthA++;
            currA=currA.next;
        }
        while(currB!=null){
            lengthB++;
            currB=currB.next;
        }
        currA=headA;
        currB=headB;
        if(lengthA>lengthB){
            for(int i=0; i<lengthA-lengthB;i++){
            currA=currA.next;
            }
        }
        else{
            for(int i=0;i<lengthB-lengthA;i++){
                currB=currB.next;
            }
        }
        while(currA!=null && currB!=null){
            if(currA==currB){
                return currA;
            }
            currA=currA.next;
            currB=currB.next;
        }
        return null;
    }
}