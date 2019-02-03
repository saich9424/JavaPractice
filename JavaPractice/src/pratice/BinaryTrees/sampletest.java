package pratice.BinaryTrees;


class sampletest{


	class Node {

		Node left,right;
		int key;



		Node(int item)
		{
			key=item;
			left=right=null;
		}

	}

	Node root;


	public sampletest() {
		root= null;
	}

	void insert(int key)
	{
		root =insertrecords(root, key);

	}

	Node insertrecords(Node n, int key)
	{

		if(n==null)
		{
			n= new Node(key);
			return n;
		}

		if(key<n.key)
		{

			n.left=insertrecords(n.left,key);
		}


		else if(key>n.key)
		{

			n.right=insertrecords(n.right,key);
		}

		return n;

	}

	void inorder()
	{
		inorderrec(root)	;
	}


	void inorderrec(Node n)
	{

		if(n!=null)
		{
			inorderrec(n.left);
			System.out.println(n.key);
			inorderrec(n.right);
		}
	}
	public static void main(String args[])
	{


		sampletest st = new sampletest();


		st.insert(50); 
		st.insert(30); 
		st.insert(20); 
		st.insert(40); 
		st.insert(70); 
		st.insert(60); 
		st.insert(80); 

		/*st.insert(67);
		st.insert(55);
		st.insert(33);
		st.insert(88);
		st.insert(4);
		st.insert(99);*/

		st.inorder();


	}
}