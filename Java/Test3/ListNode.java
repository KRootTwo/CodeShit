public class ListNode {
    int val;
    ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { 
    	this.val = val; 
    	this.next = next; 
    }
    public ListNode fromArr(int[] vals) {
        if (vals.length == 0) return null;

        ListNode head = new ListNode(vals[0]);
        ListNode current = head;

        for (int i = 1; i < vals.length; i++) {
            current.next = new ListNode(vals[i]);
            current = current.next;
        }

        return head;
    }
    public void disp(ListNode ln) {
        if (ln == null) return;
        for (ListNode head = ln; head != null; head = head.next) {
            System.out.print(head.val + "->");
        }
        System.out.print("NULL\n");
    }
}
