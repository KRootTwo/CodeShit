public class Qn2 {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        int carry = 0;
        while (l1 != null || l2 != null) {
        	int a, b;
        	
        	if (l1 != null) {
        		a = l1.val;
        		l1 = l1.next;
        	} else { a = 0; }
        	
        	if (l2 != null) {
        		b = l2.val;
        		l2 = l2.next;
        	} else { b = 0; }
        	
        	
        	carry += a + b;
        	
        	curr.next = new ListNode((int)(carry % 10));
        	carry /= 10;
        	curr = curr.next;
        }
        if (carry != 0) {
        	curr.next = new ListNode(carry);
        }
        return dummy.next;
    }
	public static void main(String[] args) {
		int list1[] = {9, 9, 9, 9, 9, 9, 9};
		int list2[] = {9, 9, 9, 9};
		
		ListNode ln1 = new ListNode();
		ListNode ln2 = new ListNode();
		
		ln1 = ln1.fromArr(list1);
		ln2 = ln2.fromArr(list2);
		
		ln1.disp(ln1);
		ln2.disp(ln2);
		System.out.println("\nRES\n");
		
		ListNode res = addTwoNumbers(ln1, ln2);
		res.disp(res);
	}

}
/*
 * long res = 0, a = 0, b = 0;
        while (l1 != null) {
        	a = a * 10 + l1.val;
        	l1 = l1.next;
        }
        while (l2 != null) {
        	b = b * 10 + l2.val;
        	l2 = l2.next;
        }
        res = a + b;
        if (res == 0) return new ListNode(0);
        ListNode d = new ListNode();
        ListNode curr = d;
        while (res != 0) {
        	curr.next = new ListNode((int)(res % 10));
        	res /= 10;
        	curr = curr.next;
        }
        return d.next;
*/
