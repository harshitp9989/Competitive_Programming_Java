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
	
	public void display()
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
		
		sll.display();
		
		sll.length();
		
		sll.insert(321,11);
		sll.display();
		sll.length();
		
		System.out.println("The deleted node is: "+ sll.deleteFirst().data);
		sll.display();
		System.out.println("The deleted node is: "+ sll.deleteLast().data);
		sll.display();
		System.out.println("The deleted node is: "+ sll.delete(3).data);
		sll.display();

		}
	
/** hello **/
		
}
