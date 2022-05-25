package Linked_list_package;
import java.util.NoSuchElementException;

public class DoublyLinkedList {
	
	private ListNode head;
	private ListNode tail;
	private int length;
	
	public DoublyLinkedList()
	{
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	public class ListNode
	{
		private int data;
		private ListNode next;
		private ListNode previous;
		
		public ListNode(int data)
		{
			this.data=data;
			this.next=null;
			this.previous=null;
		}
	}
	
	public boolean isEmpty()
	{
		return (length == 0); 
	}
	
	public int length()
	{
		return length;
	}
	
	public void insertLast(int value)
	{
		ListNode newNode = new ListNode(value);
		if(isEmpty())
		{
			head=newNode;  // only works with head ; backward printing
			newNode.previous=tail;
			tail=newNode;
//			tail=head=newNode;
			
		}
		else
		{
			tail.next=newNode; 
			newNode.previous=tail;
			tail=newNode;

		}
		length++;
	}
	
	public void insertFirst(int value)
	{
		ListNode newNode = new ListNode(value);
		if(isEmpty())
		{
			System.out.println("head:"+head.data);
			tail=newNode; //only working with tail ; forward printing
		}
		else
		{
			head.previous=newNode;
		}
		newNode.next=head;
		head=newNode;
		length++;
	}
		
	public void displayForward()
	{
		System.out.print("Printing forwards -->>   ");

		if(head == null )
		{
			return;
		}
		else
		{
			ListNode temp = head;
			while(temp!=null)
			{
				System.out.print(temp.data+"-->");
				temp=temp.next;
			}
			System.out.println("null");

		}
	}

	public void displayBackward()
	{
		System.out.print("Printing backwards-->>   ");

		if(tail == null )
		{
			return;
		}
		else
		{
			ListNode temp = tail;
			while(temp!=null)
			{
				System.out.print(temp.data+"-->");
				temp=temp.previous;
			}
			System.out.println("null");

		}
	}

	public ListNode deleteFirst()
	{
		if(isEmpty())
		{
			System.out.println("The list is empty");
			throw new NoSuchElementException();
		}
		
		ListNode temp = head;
		if(head==tail)
		{
			head=tail=null;
			length--;
			return temp;
		}
		else
		{
			head.next.previous=null;
			head=head.next;
			temp.next=null;
			length--;
			return temp;
		}
	}
	
	public ListNode deleteLast()
	{
		if(isEmpty())
		{
			System.out.println("The list is empty");
			throw new NoSuchElementException();
		}
		
		ListNode temp = tail;
		if(head==tail)
		{
			head=tail=null;
			length--;
			return temp;
		}
		else
		{
			tail=tail.previous;
			tail.next.previous=null;
			tail.next=null;
			length--;
			return temp;
			
		}
	}
	
	
	public static void main(String args[])
	{
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insertLast(1);
		dll.insertLast(10);
		dll.insertLast(15);
		dll.insertLast(25);
		
		dll.insertFirst(11);
		dll.insertFirst(22);
		dll.insertFirst(33);
		dll.insertFirst(44);


		
		dll.displayForward();
		dll.displayBackward();
		
		dll.deleteFirst();
		dll.displayForward();
		
		dll.deleteLast();
		dll.displayForward();

		
	}
	
}
