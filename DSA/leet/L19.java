public class L19 {

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		int s = 0;
		for(ListNode t = head; t != null; t = t.next) {
			s++;
		}
		if (n < 0 || n > s) { return head; }
		if (s == 1) {
			if (n == 1) return null;
			else return head;
		} else if (s == n) {
			return head.next;
		}
		 System.out.println(s);
		
		int id = s - n + 1;
		if (id == 1) return head.next;
		ListNode p = head;
		for (int i = 1; i < id - 1; i++) {
			p = p.next;
		}
		p.next = p.next.next;
		return head;
	}
	
	
	public static void printList(ListNode head) {
        ListNode current = head;

        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) { 
            	System.out.print(" -> ");
            }
            current = current.next;
        }

        System.out.println();
    }
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		ListNode current = head;
		current.next = new ListNode(2);
//		for (int i = 2; i <= 11; i++) {
//		    current.next = new ListNode(i);
//		    current = current.next;
//		}
		printList(head);

		ListNode t = removeNthFromEnd(head, 2);
		printList(t);
	}

}
