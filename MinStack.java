package com;

import java.util.Stack;

public class MinStack {
	
	Node head;
	static Stack<Integer> stack;
	
	
	class Node{
		
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			next=null;
			
		}
		
		
	}

	public static void main(String[] args) {
		MinStack minStack = new MinStack();
		minStack.push(4);
		minStack.push(6);
		minStack.push(5);
//		minStack.push(1);
	//	minStack.pop();
	//	System.out.println(minStack.top());
		System.out.println(minStack.getmin1());
		
		//System.out.println(stack);

	}
	
	/** initialize your data structure here. */
    public MinStack() {
        stack=new Stack<Integer>();
        
    }
	
	public void printlist()
	{
		Node tNode=head;
		while(tNode!=null)
		{
			System.out.print(tNode.data +" ");
			tNode=tNode.next;
		}
	}
    
    public void push(int x) {
    	
//    	Node new_node = new Node(x);
//    	new_node.next = head;
//		head = new_node;
    	
    	stack.push(x);
        
    }
    
    public void pop() {
        
//    	if(head!=null)
//    	{
//    		head=head.next;
//    	}
    	if(!stack.isEmpty())
    	{
    		stack.pop();
    	}
    	
    }
    
    public int top() {
        
//    	if(head!=null)
//    	{
//    		return head.data;
//    	}
    	
    	int i=0;
    	if(!stack.isEmpty())
    	{
    		i=(int) stack.peek();
    	}
    	
    	
    	return i;
    }
    
    public int getMin() {
    	
    	int min=0;
    	if(head!=null)
    	{
    		min=head.data;
    	
    	while(head.next!=null)
    	{
    		if(head.next.data<min)
    		{
    			min=head.next.data;
    			
    		}
    		head=head.next;
    	}
    	
    	}
    	
        return min;
    }
    
    public int getmin1()
    {
    	int min=stack.peek();
    	
    	if(!stack.empty())
    	{
    		for(int i:stack)
    		{
    			if(i<min)
    				min=i;
    		}
 		
    	}
   	
    	return min;
    }
}



