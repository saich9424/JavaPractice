package pratice.BinaryTrees;

 class Node {
	
	Node left;
	Node right;
	
	int key;
	
	public Node(int key) {
		
		this.key= key;
		left=null;
		right= null;
	}
	
	
 }class BT
	{
		
		Node root;
		
		BT()
		{
			root= null;
		}

		
		BT(int key)
		{
			root = new Node(key);
		}
	}

	
	class BinaryClass
	{
		
	public static void main(String args[])
	{
		
		BT bt = new BT();
		bt.root= new Node(1);
		bt.root.left=new Node(2);
		bt.root.left.left= new Node(3);
		bt.root.right= new Node(4);
		bt.root.left.right= new Node(5);
		bt.root.right.left=new Node(6);
	}
	}
	
