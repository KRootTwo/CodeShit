public class Qn92i {
	public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode p1 = head, p2 = head;
		// left dest
		for (int i = 0; i < left - 1; i++) {
			p1 = p1.next;
		}

		// right dest
		for (int i = 0; i < right - 1; i++) {
			p2 = p2.next;
		}

		ListNode bl1 = p1, bl2 = p2.next.next;
		ListNode prevRevHead = p1.next;

		ListNode prev = null, curr = p1.next, later;
		int i = left;
		while (curr != null && i < right) {
			later = curr.next;
			curr.next = prev;
			prev = curr;
			curr = later;
		}
		prevRevHead.next = bl2;
		bl1.next = prev;
		return head;
    }
	public static void main(String[] args) {
		// int arr[] = {21, 65, 32, 59, 93, 15, 73, 24};
		//           0  1  2  3  4  5  6  7
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
		ListNode head = new ListNode();
		head = head.fromArr(arr);
		head.disp(head);
		head = reverseBetween(head, 2, 5);
		head.disp(head);
	}
}
 