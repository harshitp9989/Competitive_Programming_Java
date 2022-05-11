package Linked_list_package;

public class LinkedList_loops {
	
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
	
	public void reverse(ListNode head1, LinkedList_loops sll1)
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
	
	public ListNode containsLoop()
	{
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		
		while(fastPtr!=null && fastPtr.next!=null)
		{
			fastPtr=fastPtr.next.next;
			slowPtr=slowPtr.next;
			
			if(fastPtr==slowPtr)
			{
				System.out.println("Loop found; slowPtr & fastPtr coincided at: "+slowPtr.data);
				return slowPtr;
			}
		}
		System.out.println("No loop found!");
		return null;
	}
	
	public ListNode getStartingNode(ListNode kk)
	{
		ListNode currentPtr = head;
		ListNode slowPtr = kk;
		
		while(slowPtr!=currentPtr)
		{
			slowPtr=slowPtr.next;
			currentPtr=currentPtr.next;
			if(slowPtr==currentPtr)
			{
				System.out.println("Found the starting node of loop through Floid's algorithm : "+ slowPtr.data);
				return slowPtr;
			}
		}
		return null;
	}
	
	public void removeLoop(ListNode meet)
	{
		ListNode temp = head;
		
		while(temp.next!=meet.next)
		{
			temp=temp.next;
			meet=meet.next;
		}
		System.out.println("Successfully removed loop...");
		meet.next=null;
	}
		
	public static void main(String args[]) {
		LinkedList_loops sll = new LinkedList_loops();
		sll.head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode forth = new ListNode(4);
		ListNode fifth = new ListNode(5);
		ListNode sixth = new ListNode(6);

		sll.head.next = second;
		second.next = third;
		third.next = forth;
		forth.next=fifth;
		fifth.next=sixth;
		sixth.next=third;
		
		ListNode meet = sll.containsLoop();
		sll.getStartingNode(meet);
		sll.removeLoop(meet);
		sll.display(sll.head);
		
				
		}			
}
