package com;


public class MiddleLinkedList {
	
	static ListNode head;

	public static void main(String[] args) {
		
		
		MiddleLinkedList mll = new MiddleLinkedList();
		mll.addfromlast(1);mll.addfromlast(2);mll.addfromlast(3);mll.addfromlast(4);mll.addfromlast(5);mll.addfromlast(6);
		
		//mll.printlist();
		
		ListNode tNode = head;
		
		System.out.println(mll.middleNode(tNode).val);
	}
	public void printlist()
	{
		ListNode tNode = head;
		while(tNode!=null)
		{
			System.out.print(tNode.val +" ");
			tNode = tNode.next;
		}
	}
	
	 public class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) 
		      { val = x;
		      	next=null;
		      }
		  }
	 
	 public void addfromlast(int new_data)
		{
			ListNode new_node = new ListNode(new_data);
			
			
			if(head==null)
			{
				head = new_node;
				return;
			}
			
			new_node.next = null;
			
			ListNode temp=head;
			
			while(temp.next!=null)
			{
				temp = temp.next;
			}
			
			temp.next = new_node;
		}
	 
	 public ListNode middleNode(ListNode head) {
		
		 ListNode slow=head;
		 ListNode fast=head;
		 
		 
		
		 while(fast.next!=null && fast.next.next!=null)
		 {
			 
			 slow=slow.next;
			 fast=fast.next.next;
			 
			 
		 }
		 if(fast.next!=null)
			 return slow.next;
		 
		 
		 
		 return slow;
	        
	    }
	 
	 

}
