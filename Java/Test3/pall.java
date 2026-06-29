// Given a singly linked list, we have to check whether it is a palindrome or not.

public class pall {
	public static boolean palin (ListNode head) {
		ListNode turtle = head, hare = head;
		while (hare != null && hare.next != null) {
			turtle = turtle.next;
			hare = hare.next.next;
		}
		ListNode prev = null, curr = turtle, later;

		while (curr != null) {
			later = curr.next;
			curr.next = prev;
			prev = curr;
			curr = later;
		}
		// new head -> prev
		// 2 ptr

		ListNode left = head, right = prev;

		while (right != null) {
			if (left.val != right.val) {
				return false;
			}
			left = left.next;
			right = right.next;
		}

		return true;
	}
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 3, 2, 1};
		ListNode head = new ListNode();
		head = head.fromArr(arr);
		head.disp(head);
		System.out.println(palin(head));
	}
}