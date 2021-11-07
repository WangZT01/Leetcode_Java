package LinkedList;

import java.util.ArrayList;

public class PalindromeLinkedList_234 {


    public static boolean isPalindrome(ListNode head) {

        ArrayList<Integer> a = new ArrayList<Integer>();

        while(head.next != null){
            a.add(head.val);
            head = head.next;
        }
        a.add(head.val);
        boolean result = true;

        for(int i = 0 ; i < a.size()-i-1 ; i++){
            if(a.get(i) != a.get(a.size()-i-1) ){
                return false;
            }
        }
        return result;
    }
}

/**
 * class Solution {
 *     public boolean isPalindrome(ListNode head) {
 *
 *         ListNode slow = head;
 *         ListNode fast = head;
 *
 *         while(fast!=null && fast.next!=null){
 *             fast = fast.next.next;
 *             slow = slow.next;
 *         }
 *
 *         if(fast!=null){
 *             slow = slow.next;
 *         }
 *         ListNode right = reverse(slow);
 *         ListNode left = head;
 *         while(right!=null && left!=null){
 *             if(right.val!= left.val) return false;
 *             right = right.next;
 *             left = left.next;
 *         }
 *         return true;
 *     }
 *
 *
 *     ListNode reverse(ListNode node){
 *         ListNode prev = null;
 *         while(node!=null){
 *             ListNode temp = node.next;
 *             node.next = prev;
 *             prev = node;
 *             node = temp;
 *         }
 *         return prev;
 *     }
 */