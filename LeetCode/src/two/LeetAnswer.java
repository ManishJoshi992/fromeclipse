package two;


public class LeetAnswer {

	ListNode l1;
	ListNode l2;
	ListNode l3;

	LeetAnswer() {
		l1 = new ListNode();
		l2 = new ListNode();
		l3 = new ListNode();
	}

	public void addl1(int a) {

		ListNode n = new ListNode(a);
		ListNode temp = l1;

		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = n;
	}

	public void addl2(int a) {

		ListNode n = new ListNode(a);
		ListNode temp = l2;

		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = n;
	}

	public void addl3(int a) {

		ListNode n = new ListNode(a);
		ListNode temp = l3;

		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = n;

		// display(l3);
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode dummyHead = new ListNode(0);
		ListNode p = l1, q = l2, curr = dummyHead;
		int carry = 0;
		while (p != null || q != null) {
			int x = (p != null) ? p.val : 0;
			int y = (q != null) ? q.val : 0;
			int sum = carry + x + y;
			carry = sum / 10;
			curr.next = new ListNode(sum % 10);
			curr = curr.next;
			if (p != null)
				p = p.next;
			if (q != null)
				q = q.next;
		}
		if (carry > 0) {
			curr.next = new ListNode(carry);
		}
		return dummyHead.next;
	}

	public void display(ListNode a) {

		ListNode n = a;
		String result = "";
		while (n.next != null) {
			n = n.next;
			result += n.val + "->";
		}
		System.out.println(result);
	}

	public static void main(String[] args) {

		LeetAnswer obj = new LeetAnswer();
		obj.addl1(2);
		obj.addl1(4);
		obj.addl1(3);
		obj.display(obj.l1);

		System.out.println();
		LeetAnswer obj2 = new LeetAnswer();

		obj2.addl2(5);
		obj2.addl2(6);
		obj2.addl2(4);
		obj.display(obj2.l2);

		System.out.println();

		LeetAnswer m = new LeetAnswer();
		ListNode n = m.addTwoNumbers(obj.l1, obj2.l2);
		System.out.println("**");

		m.display(n);
	}

}
