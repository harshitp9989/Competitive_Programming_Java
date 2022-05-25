package Linked_list_package;

import java.util.NoSuchElementException;

public class CircularSinglyLinkedList {
	
	private int length;
	private ListNode last;
	
	public CircularSinglyLinkedList()
	{
		length=0;
		last=null;
	}
	
	class ListNode
	{
		private int data;
		private ListNode next;
	
		public ListNode(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public int length()
	{
		return length;
	}
	
	public boolean isEmpty()
	{
		return length == 0;
	}
	
	public void createCircularLinkedList()
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
	
	public void display()
	{
		if(last==null)
		{
			return;
		}
		ListNode first = last.next;
		while(first!=last)
		{
			System.out.print(first.data+"-->");
			first=first.next;
		}
		System.out.println(first.data);
	}
	
	public void insertFirst(int data)
	{
		ListNode newNode = new ListNode(data);
		if(last==null)
		{
			last=newNode;
			last.next=last;
		}
		else
		{
			newNode.next=last.next;
			last.next=newNode;
		}
		length++;
	}
	
	public void insertLast(int data)
	{
		ListNode newNode = new ListNode(data);
		if(last==null)
		{
			last=newNode;
			last.next=last;
		}
		else
		{
			newNode.next=last.next;
			last.next=newNode;
			last=last.next;
		}
		length++;
	}
	
	public ListNode removeFirst()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException("Circular Singly Linked List is already empty");
		}
		if(last.next==last)
		{
			ListNode temp =last;
			last.next=null;
			last=null;
			length--;
			return temp;
		}
		else
		{
			ListNode temp=last.next;
			last.next=temp.next;
			length--;
			return temp;
			
		}
			
	}
	
	public static void main(String args[])
	{
		CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
		csll.createCircularLinkedList();
		csll.display();

		csll.insertFirst(20);
		csll.display();

		csll.insertLast(40);
		csll.display();

		csll.removeFirst();
		csll.display();
	}

}
