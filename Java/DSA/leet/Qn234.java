public class Qn234 {
	public static boolean isPalindrome(ListNode head) {
		long i = 0;
		while (head != null) {
			i = i * 10 + head.val;
			head = head.next;
		}
		long rev = 0, j = i;
		while (j != 0) {
			rev = rev * 10 + (j % 10);
			j /= 10;
		}
		return i == rev;
	}
	public static boolean isPalindromeOp(ListNode head) {
		ListNode fast = head, slow = head;
		
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode prev = null, later, curr = slow;
		while (curr != null) {
			later = curr.next;
			curr.next = prev;
			prev = curr;
			curr = later;
		}
		while (prev != null) {
			if (head.val != prev.val) {
				return false;
			}
			head = head.next;
			prev = prev.next;
		}
		return true;
	}
	public static void main(String[] args) {
		
	}
}
