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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;

        ListNode fast = head, slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = reverseList(slow);
        ListNode firstHalf = head;

        ListNode temp = secondHalf;
        boolean isPalindrome = true;
        while(temp != null){
            if(firstHalf.val != temp.val){
                isPalindrome = false;
                break;
            }
            firstHalf = firstHalf.next;
            temp = temp.next;
        }
        return isPalindrome;
    }
    private ListNode reverseList(ListNode head){
        ListNode prev = null, curr = head, nextNode;

        while(curr != null){
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}