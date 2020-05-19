package com;

public class OddEvenLinkedList {
	
	Node head;
	
	class Node{
		
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	
	public static Node oddEvenList(Node head) {
	
	Node odd=head;
	Node temp=head;
	int count=0;
	Node even = null;
	
	
	while(temp!=null)
	{
		count++;
		{
			if(count%2==0)
			{
				even=temp.next;
			}
			else
			{
				odd=temp.next.next;
			}
		}
		
		temp=temp.next;
	}
	
	while(even!=null)
	{
		odd.next=even;
		even=even.next;
	}
	return head;
        
    }

	public static void main(String[] args) {
		
		//Node head= oddEvenList(head);

	}

}
