package Linked_list_package;

public class Impl_SingLinkList {
	
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
	
	public void length()
	{
		int count=0;
		ListNode current = head;
		while(current != null)
		{
			count++;
			current = current.next;
		}
		System.out.println("The length of the linked list is : "+count);
	}
		
	public void insertFirst(int x)
	{
		ListNode newNode = new ListNode(x);
		newNode.next = head;
		head=newNode;
		
	}
	
	public void insertLast(int y)
	{
		ListNode newNode = new ListNode(y);
		
		if(head==null)
		{
			head = newNode;
		}
		
		ListNode current = head;
		while(current.next!=null)
		{
			current=current.next;
			
		}
		current.next=newNode;
	}
	
	public void insert(int val, int pos)
	{
		ListNode newNode = new ListNode(val);
		if(pos==1)
		{
			newNode.next=head;
			head=newNode;
		}
		
			ListNode prev = head;
			for(int count=1;count<pos-1;count++)
			{
				prev=prev.next;
			}
			ListNode after = prev.next;
			prev.next=newNode;
			newNode.next=after;
		
	}
	
	public ListNode deleteFirst()
	{
		if(head==null)
		{
			return null;
		}
		ListNode temp = head;
		head=head.next;
		temp.next=null;
		return(temp);
	}
		
	public ListNode deleteLast()
	{
		if(head==null || head.next==null)
		{
			return head;
		}
		ListNode current = head;
		while(current.next.next!=null)
		{
			current=current.next;
		}
		ListNode ans = current.next;
		current.next=null;
		return ans;
		
	}
	
	public ListNode delete(int x) 
	{
		ListNode current = head;
		for(int i=1;i<x-1;i++)
		{
			current=current.next;
		}
		ListNode ans = current.next;
		current.next=current.next.next;
		return(ans);
	}
	
	public boolean find(ListNode head, int searchKey)
	{
		if(head==null)
		{
			return false;
		}
		else
		{
			ListNode current = head;
			while(current!=null)
			{
				if(current.data==searchKey)
					return true;
				else
				{
					current=current.next;
				}
			}
			return false;
		}
	}
	
	public void reverse(ListNode head1, Impl_SingLinkList sll1)
	{
		if(head1 == null)
		{
			System.out.println("null");
		}
		else
		{
			ListNode prev = null;
			ListNode current = head1;
			ListNode next = null;
			
			while(current!=null)
			{
				next = current.next;
				current.next=prev;
				prev=current;
				current=next;
//				System.out.println("Prev: "+prev.data);
			}
			head=prev;
			//sll1.head=prev;
			System.out.println("Head: "+head.data);
			sll1.display(head);
		}
	}
	
	public ListNode getMiddleNode()
	{
		if(head == null)
		{
			return null;
		}
		else
		{
			ListNode slowPtr = head;
			ListNode fastPtr = head;
			
			while(fastPtr!=null && fastPtr.next!=null)
			{
				fastPtr=fastPtr.next.next;
				slowPtr=slowPtr.next;
			}
			return slowPtr;
		}
	}
	
	public ListNode getNthNodeFromEnd(int n)
	{
		if(head==null)
		{
			return null;
		}
		
		if(n<=0)
		{
			throw new IllegalArgumentException("Index can't be negative");
		}
		
		ListNode mainPtr = head;
		ListNode refPtr = head;
		for(int count=1;count<n;count++)
		{
			refPtr=refPtr.next;
		}
		while(refPtr.next!=null)
		{
			refPtr=refPtr.next;
			mainPtr=mainPtr.next;
		}
		return mainPtr;
	}
	
	public void removeDuplicatesSorted()
	{
		if(head==null)
		{
			return;
		}
		ListNode current = head;
		while(current!=null && current.next!=null)
		{
			if(current.data==current.next.data)
			{
				current.next=current.next.next;
			}
			else
			{
				current=current.next;
			}
		}
		
	}
	
	public void insertInSortedList(int xx)
	{
		ListNode prev = null;
		ListNode current = head;
		ListNode newNode = new ListNode(xx);
		
		if(head.data > newNode.data)
		{
			newNode.next=head;
			head=newNode;
			
		}
		else
		{
		while(current.data<newNode.data && current!=null)
		{
			prev=current;
			current=current.next;
		}
		
		prev.next= newNode;
		newNode.next=current;
		}
	}
	
	public void deleteNode(int key)
	{
		ListNode prev = null;
		ListNode current = head;
		
		if(head.data==key)
		{
			head=head.next;
			System.out.println("deleted "+key);

		}
		else
		{
			while(current.data!=key && current!=null)
			{
				prev=current;
				current=current.next;
			}
			prev.next=current.next;
			System.out.println("deleted "+key);
		}
	}
		
		
	public static void main(String args[]) {
		Impl_SingLinkList sll = new Impl_SingLinkList();
		sll.head = new ListNode(10);
		ListNode second = new ListNode(20);
		ListNode third = new ListNode(30);
		ListNode forth = new ListNode(40);
			
		sll.head.next = second;
		second.next = third;
		third.next = forth;
		
		sll.insertFirst(111);
		sll.insertFirst(222);
		sll.insertFirst(333);
		
		sll.insertLast(777);
		sll.insertLast(888);
		sll.insertLast(999);
		
		sll.display(sll.head);
		
		sll.length();
		
		sll.insert(321,11);
		sll.display(sll.head);
		sll.length();
		
		System.out.println("The deleted node is: "+ sll.deleteFirst().data);
		sll.display(sll.head);
		System.out.println("The deleted node is: "+ sll.deleteLast().data);
		sll.display(sll.head);
		System.out.println("The deleted node is: "+ sll.delete(3).data);
		sll.display(sll.head);
		
		if(sll.find(sll.head, 111))
		{
			System.out.println("The given element is present in the linked list");
		}
		else
		{
			System.out.println("The given element is NOT present in the linked list");
		}
		
		sll.reverse(sll.head, sll);
		sll.display(sll.head);
		
		
		System.out.println("The middle node of the linked list is : "+sll.getMiddleNode().data);

		System.out.println("Getting nth node from end...."+sll.getNthNodeFromEnd(2).data);
		
		sll.insertLast(55);
		sll.insertLast(55);
		sll.insertLast(55);
		sll.display(sll.head);
		sll.removeDuplicatesSorted();
		sll.display(sll.head);
		
		sll.insertInSortedList(24);
		sll.display(sll.head);
		
		sll.deleteNode(24);
		sll.display(sll.head);
		}			
}
