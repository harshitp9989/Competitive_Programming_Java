package Linked_list_package;

public class MergeSortedLists {
	
	private ListNode head;
	
	public static class ListNode{
		private int data;
		private ListNode next;
		
		public ListNode(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	public void display(ListNode head)
	{
		ListNode current = head;
		while(current != null)
		{
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.print("null\n");
	}

	public static ListNode merge(ListNode aa, ListNode bb)
	{
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		
		while(aa!=null && bb!=null)
		{
			if(aa.data<bb.data)
			{
				tail.next=aa;
				tail=tail.next;
				aa=aa.next;
			}
			else
			{
				tail.next=bb;
				tail=tail.next;
				bb=bb.next;
			}
			
			if(aa==null)
			{
				tail.next = bb;
			}
			if(bb==null)
			{
				tail.next = aa;
			}
		}
		return dummy.next;
	}

	
	public static void main(String args[]) {
		
		MergeSortedLists sll1 = new MergeSortedLists();
		
		MergeSortedLists sll2 = new MergeSortedLists();

		sll1.head = new ListNode(1);
		ListNode second1 = new ListNode(1);
		ListNode third1 = new ListNode(2);
		ListNode forth1 = new ListNode(3);
		ListNode fifth1 = new ListNode(8);
		ListNode sixth1 = new ListNode(9);

		sll1.head.next = second1;
		second1.next = third1;
		third1.next = forth1;
		forth1.next=fifth1;
		fifth1.next=sixth1;
		sixth1.next=null;
		
		
		sll2.head = new ListNode(0);
		ListNode second2 = new ListNode(1);
		ListNode third2 = new ListNode(2);
		ListNode forth2 = new ListNode(4);
		ListNode fifth2 = new ListNode(5);
		ListNode sixth2 = new ListNode(6);

		sll2.head.next = second2;
		second2.next = third2;
		third2.next = forth2;
		forth2.next=fifth2;
		fifth2.next=sixth2;
		sixth2.next=null;

		sll1.display(sll1.head);
		sll2.display(sll2.head);
		System.out.println("sll1.head : "+sll1.head);
		System.out.println("sll2.head : "+sll2.head);

		MergeSortedLists kk = new MergeSortedLists();
		kk.head = merge(sll1.head, sll2.head);
		System.out.println("Merging two sorted linkedLists..........");
		kk.display(kk.head);
		System.out.println("");

		
		sll1.display(sll1.head);
		sll2.display(sll2.head);
		System.out.println("sll1.head : "+sll1.head);
		System.out.println("sll2.head : "+sll2.head);
		
		System.out.println("kk.head : "+kk.head);


			
		}			
}
