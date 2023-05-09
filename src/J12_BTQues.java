class Node{
    int data;
	Node left, right;

	Node(int item)
	{
		data = item;
		left = right = null;
	}
}
public class J12_BTQues {
    Node root;

    public static void main(String[] args)
	{
		J12_BTQues tree = new J12_BTQues();

		tree.root = new Node(1);
		tree.root.left = new Node(3);
		tree.root.right = new Node(5);
		tree.root.left.left = new Node(7);
		tree.root.left.right = new Node(9);
		tree.root.right.left = new Node(11);
		tree.root.right.right = new Node(13);

		tree.printNode(tree.root); // print the tree to the screen
		// print the size of the tree
		System.out.println("\nTree size is " + tree.sizeOfTree(tree.root));
		// print element at kth level
        tree.printKDistant(tree.root, 1);
		// print the height of the tree (based on node height); // [Note - 1]
		System.out.println("\n Height of tree is "	+ tree.maxDepth(tree.root));
		// Maximum value in the tree
		System.out.println("maximum value is " + tree.maxNum(tree.root));

	}
/*
         1
       /   \
      3      5
    /  \    / \
   7    9  11  13

*/

// print all nodes in the tree
	void printNode(Node root){
		if(root == null){
			return;
		}
		System.out.print(root.data + " ");
		printNode(root.left);
		printNode(root.right);
	}
// find the total number of nodes in the tree.
	int sizeOfTree(Node root){
		if(root == null) return 0;
		else{
			return (sizeOfTree(root.left) + 1 + sizeOfTree(root.right));
		}
	}
// print all the element at kth distance
    void printKDistant(Node node, int k)
	{
		if (node == null|| k < 0 )
			//Base case
			return;
		if (k == 0)
		{
			System.out.print(node.data + " ");
			return;
		}
	    //recursively traversing
		printKDistant(node.left, k - 1);
		printKDistant(node.right, k - 1);	
	} 

/* Compute the "maxDepth" of a tree -- the number of
	nodes along the longest path from the root node
	down to the farthest leaf node.*/
	int maxDepth(Node node) // [ Note -1] // max node finding
	{
		if (node == null)
			return 0;
		else {
			/* compute the depth of each subtree */
			int lDepth = maxDepth(node.left);
			int rDepth = maxDepth(node.right);

			/* use the larger one */
			if (lDepth > rDepth)
				return (lDepth + 1);
			else
				return (rDepth + 1);
		}	
	}

	int  maxNum(Node root){
		
		if(root == null) return Integer.MIN_VALUE;
		// else return Math.max(root.data , Math.max( maxNum(root.left), maxNum(root.right)));
 
		int ans = root.data;
		int ldata = maxNum(root.left);
		int rdata = maxNum(root.right);

		if (ldata > ans) ans = ldata;
		if (rdata > ans) ans = rdata;
		return ans;
	}
}

/*
 * [Note -1]: (Height of BT) : height can be counted as total no of edgaes or total no of nodes, in the tree from the root to the deepest node,
 * > Nodes: Height of the tree is the maximum number of nodes in the tree from the root to the deepest node, Height of the empty tree is 0.);
 * > Edgaes: Height of the tree is the maximum number of edges in the tree from the root to the deepest node; (basicaly it is maximum node - 1);
 * 
 * 
 * [Note - 2]: In Binary Search Tree, we can find maximum by traversing right pointers until we reach the rightmost node. But in Binary Tree, we must visit every node to figure out maximum
 * 
 */