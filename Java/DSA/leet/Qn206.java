public class Qn206 {
	public static ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;
		ListNode later;
		
		while (curr != null) {
			later = curr.next;
			curr.next = prev;
			prev = curr;
			curr = later;
		}
		return prev;
	}
	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		ListNode head = new ListNode();
		head = head.fromArr(arr);
		head.disp(head);
		
		head = reverseList(head);
		head.disp(head);
	}
}
