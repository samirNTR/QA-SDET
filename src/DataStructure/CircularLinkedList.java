package DataStructure;

public class CircularLinkedList {       //-------------------------------  1st class

	private ListNode last; // instance variable it should point to the last node fourth

	private int length;

	private class ListNode // Class to Define next and Data-----------------//2nd class
	{
		private int data;

		private ListNode next; // ListNode contains the data part and reference to next list node

		public ListNode(int data) // -------------1st Constructor
		{

			this.data = data;
		}

	}

	public CircularLinkedList() // ------------------2nd Constructor
	{
		last = null;
		length = 0;

	}

	public int length() {
		return length;

	}

	public boolean isEmpty() {

		return length == 0;
	}

	public void createCircularLinkedList() // Method to enter values in List-------------------function called 
	{
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(5);
		ListNode third = new ListNode(10);
		ListNode fourth = new ListNode(15);

		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = first;

		last = fourth;
	}

	public void display() {
		if (last == null) {
			return;
		}

		ListNode first = last.next;

		while (first != last) {

			System.out.println(first.data + " ");

			first = first.next;

		}

		System.out.println(first.data);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedList list = new CircularLinkedList();

		list.createCircularLinkedList();
		
		list.display();

	}

}
