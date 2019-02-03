package pratice.BinaryTrees;


public class treehashs {

	class Node
	{

		Node left,right;
		int key;

		Node(int info)
		{

			key=info;
			left=right=null;
		}

	}	Node root;

	treehashs()
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
	
	public static void main(String args[])
	{
		
		sampletest st= new sampletest();
		st.insert(67);
		st.insert(55);
		st.insert(33);
		st.insert(88);
		st.insert(4);
		st.insert(99);
        st.inorder();
}

}
