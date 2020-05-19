package com;

public class CousinsBinaryTree {
	static TreeNode root;
	static class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int d) {
		    	  this.val = d;
		    	  left = right = null;
		      }
		 }

	public static void main(String[] args) {
		
		root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right=new TreeNode(5);
		root.left.left = new TreeNode(3);
		root.left.left.left = new TreeNode(4);
		root.right.right = new TreeNode(6);
		System.out.println(isCousins(root,3,6));
				
				

	}
		
	public static boolean isCousins(TreeNode root, int x, int y) {
	        
		int depth=0;
		int depth1=0;

		
		TreeNode head = root;
		TreeNode head1 = root;
		
		if(x==root.val || y==root.val)
			return false;

			while(head!=null)
			{
				if(head.left!=null)
				{
					if(x==head.left.val || y==head.left.val)
					{
						head=head.left;
						depth++;
						break;
						
					}
					head=head.left;
					depth++;
				}
					else if(head.right!=null)
	                {
												
	                    if(x==head.right.val || y==head.right.val)
	                    {
	                    	head=head.right;
	                    	depth++;
	                        break;
	                    }
	                    
	                    head=head.right;
						depth++;
	                }
			}
			
			while(head1!=null)
			{
                if(head1.right!=null)
                {               
	                if(y==head1.right.val || x==head1.right.val)
					{
	                	head1=head1.right;
	                	depth1++;
						break;
					}
	                head1=head1.right;
                    depth1++;
                }
				else if(head1.left!=null)
                {

					if(y==head1.left.val || x==head1.left.val)
                    {
                    	head1=head1.left;
                    	depth1++;
                        break;
                    }
                    
                    head1=head1.left;
                    depth1++;
                }
 		}


		if(depth==depth1)
		{
			return true;
		}
		
		return false;
	    }
	
	static int Depth(TreeNode node,String direction)  
    { 
		int Depth=0;
        if (node == null) 
            return 0; 
        else 
        { 
           if(direction.equalsIgnoreCase("left")) 
           {
	           while(node.left!=null)
	           {
	        	   Depth = Depth+1; 
	        	   node=node.left;
	   
	            }
           }
           else if(direction.equalsIgnoreCase("right")) 
           {
	           while(node.right!=null)
	           {
	        	   Depth = Depth+1; 
	        	   node=node.right;
	   
	            }
           }
        } 
        return Depth;
    } 

}
