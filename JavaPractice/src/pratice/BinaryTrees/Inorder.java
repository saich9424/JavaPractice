package pratice.BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

class Node11{
	
	int key;
	Node11 right,left;
	
	Node11(int key)
	{
		
	this.key=key;
	right=null;
	left=null;
	}
}

class Inorder
{
	static void Inorder(Node11 n)
	{
	
		if(n==null)
		{
			return;
		}
		
		
		Inorder(n.left);
		System.out.println(n.key);
		Inorder(n.right);
		
		
	}
	
	static void insert(Node11 temp, int key) 
    { 
    
    
        Queue<Node11> q = new LinkedList<Node11>(); 
        q.add(temp); 
       
         
        while (!q.isEmpty()) { 
            temp = q.peek(); 
            q.remove(); 
       
            if (temp.left == null) { 
                temp.left = new Node11(key); 
                break; 
            } else
                q.add(temp.left); 
       
            if (temp.right == null) { 
                temp.right = new Node11(key); 
                break; 
            } else
                q.add(temp.right); 
        } 
    } 
	
public static void main(String args[])
{
	Node11 n = new Node11(1 );
	
	n.left =new Node11(2);
	n.left.left= new Node11(3);
	n.left.right= new Node11(4);
	n.right =new Node11(5);
	n.right.left= new Node11(6);
	n.right.right= new Node11(7);
	Inorder(n);

	insert(n,11);
	
	System.out.println);
	
	Inorder(n);
}

	
	
	

}
