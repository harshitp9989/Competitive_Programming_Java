package Linked_list_package;

public class AddLinkedLists {
	
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
	
	public static ListNode add(ListNode aa, ListNode bb)
	{
		ListNode dummy = new ListNode(0);
		ListNode temp = dummy;
		int carry = 0;
		
		while(aa!=null || bb!=null)
		{
			int x = (aa==null)? 0:aa.data;
			int y = (bb==null)? 0:bb.data;
			int sum = carry + x+y;
			carry = (int)(sum/10);
			
			temp.next = new ListNode((int)(sum%10));
			temp=temp.next;
			if(aa!=null)
			{
				aa=aa.next;
			}
			if(bb!=null)
			{
				bb=bb.next;
			}
		}
		
		if(carry>0)
		{
			temp.next=new ListNode(carry);
		}
		
		return dummy.next;
		
	}
	
	public static void main(String args[]) {
		
		AddLinkedLists sll1 = new AddLinkedLists();
		
		AddLinkedLists sll2 = new AddLinkedLists();

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

		AddLinkedLists kk = new AddLinkedLists();
		kk.head = add(sll1.head, sll2.head);
		System.out.println("adding two linkedLists..........");
		kk.display(kk.head);
		
		System.out.println("");
		sll1.display(sll1.head);
		sll2.display(sll2.head);
			
		}			
}
