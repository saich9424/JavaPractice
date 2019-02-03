package pratice.BinaryTrees;

public class sampletrees {

	class Node
	{

		Node left,right;
		int key;

		Node(int info)
		{

			key=info;
			left=right=null;
		}

	}
	Node root;

	sampletrees()
	{
		root=null;
	}

	

	void insert(int key)
	{

		root=insertdata(root,key);
	}

	Node insertdata(Node root, int key)
	{

		if(root==null)
		{
			root=new Node(key);
			return root;
		}

		if(key<root.key)
		{

			root.left=insertdata(root.left, key);
		}

		if(key>root.key)
		{

			root.right=insertdata(root.right, key);
		}
		return root;
	}

	void inorder()
	{
		inorderdata(root);
	}


	void inorderdata(Node N)
	{
		if(N!=null)
		{
			inorderdata(N.left);
			System.out.println(N.key);
			inorderdata(N.right);
		}

	}

	
	Node search(int key)
	{
		return  nodesearch(root,key) ;

	}

	
	void insertnodes(String a, String b)
	{
		
		
	}

	Node nodesearch(Node root, int key) 
	{ 
		// Base Cases: root is null or key is present at root 
		if (root==null || root.key==key) 
			return root; 

		// val is greater than root's key 
		if (root.key > key) 
			return nodesearch(root.left, key); 

		// val is less than root's key 
		return nodesearch(root.right, key); 
	} 
	public static void main(String args[])
	{

		sampletrees st= new sampletrees();
		st.insert(67);
		st.insert(55);
		st.insert(33);
		st.insert(88);
		st.insert(4);
		st.insert(99);
		st.inorder();
		System.out.println(st.search(55));
		st.inorderdata(st.search(55));

	}

}
