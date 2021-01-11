package two;

public class Solution {

	ListNode l1;
	ListNode l2;
	ListNode l3;

	Solution() {
		l1 = new ListNode();
		l2 = new ListNode();
		l3 = new ListNode();
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

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		double first = 0;
		int pow = 0;
		ListNode n = l1;
		while (n.next != null) {
			n = n.next;
			System.out.println(n.val);
			first = first + (n.val * Math.pow(10, pow));
			pow++;
		}

		double second = 0;
		int secondPow = 0;
		ListNode m = l2;
		while (m.next != null) {
			m = m.next;
			second = (int) (second + (m.val * Math.pow(10, secondPow)));
			secondPow++;
		}

		int result = (int) (first + second);

		System.out.println(first);
		System.out.println(second);
		System.out.println(result);

		for (int i = result; i != 0; i /= 10) {
			addl3(i % 10);

		}

		return l3;
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

		Solution obj = new Solution();
		obj.addl1(2);
		obj.addl1(4);
		obj.addl1(3);
		obj.display(obj.l1);

		System.out.println();
		Solution obj2 = new Solution();

		obj2.addl2(5);
		obj2.addl2(6);
		obj2.addl2(4);
		obj.display(obj2.l2);

		System.out.println();

		Solution m = new Solution();
		ListNode n = m.addTwoNumbers(obj.l1, obj2.l2);
		System.out.println("**");

		m.display(n);
	}

}
