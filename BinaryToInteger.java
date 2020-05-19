package com;

public class BinaryToInteger {
	
	static ListNode head;
	
	class ListNode{
		int value;
		ListNode next;
		
		ListNode(int x)
		{
			this.value=x;
			next=null;
		}
	}

	public static void main(String[] args) {
		
		BinaryToInteger binaryToInteger = new BinaryToInteger();
		binaryToInteger.add(0);
		binaryToInteger.add(1);
		binaryToInteger.add(1);
		
		//binaryToInteger.printlist();
		System.out.println(binaryToInteger.getDecimalValue(head));
	}
	
	public void add(int x)
	{
		ListNode node=new ListNode(x);
		node.next=head;
		head=node;
	}
	
	public void printlist()
	{
		while(head!=null)
		{
			System.out.print(head.value+" ");
			head=head.next;
		}
	}
	
    public int getDecimalValue(ListNode head) {
	
	String binary = String.valueOf(head.value);
	head=head.next;
	
	while(head!=null)
	{
		binary=binary+String.valueOf(head.value);
		head=head.next;
	}
	
	int decimal=Integer.parseInt(binary,2);
	return decimal;
        
    }

}
