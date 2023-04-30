// we basicaly uses linked-list with one extra pointer; where head points to the root node 
class NodeBT {
	int key;
	NodeBT left, right;

	public NodeBT(int item)
	{
		key = item;
		left = right = null;   
	}
}
class J12_BT {
	public static void main(String[] args)
	{

		// create root
		NodeBT root = new NodeBT(1);

/* following is the tree after above statement

  1
/    \
null null */

		root.left = new NodeBT(2);

		root.right = new NodeBT(3);

/* 2 and 3 become left and right children of 1

      1
   /      \
  2        3
/   \     /    \
null null null null */

		root.left.left = new NodeBT(4);

/* 4 becomes left child of 2


    1
 /     \
 2       3
/ \    /    \
4  NULL NULL NULL
/ \
NULL NULL
*/		
		printInorder(root);  		//  L Root R
		System.out.println(" ");
		printPreorder(root);		// Root L R
		System.out.println(" ");
		printPostorder(root);		// R L Root
	}

	// Method to print inorder traversal
	static void printInorder(NodeBT node)
    {
        if (node == null) return;

        /* first recur on left child */
        printInorder(node.left);
        /* then print the data of node */
        System.out.print(node.key + " ");
        /* now recur on right child */
        printInorder(node.right);
    }

	// Method to print preorder traversal
    static void printPreorder(NodeBT node)
    {
        if (node == null) return;

        /* first print data of node */
        System.out.print(node.key + " ");
        /* then recur on left sutree */
        printPreorder(node.left);
        /* now recur on right subtree */
        printPreorder(node.right);
    }
	// Method to print postorder traversal.
    public static void printPostorder(NodeBT node)
    {
        if (node == null) return;

        // first recur on left subtree
        printPostorder(node.left);
        // then recur on right subtree
        printPostorder(node.right);
        // now deal with the node
        System.out.print(node.key + " ");
    }
}


/* Binary Tree  
 
> A binary tree is a tree data structure composed of nodes, each of which has at most, two children, referred to as left and right nodes and the tree begins from root node.

# Each node in the tree contains the following:
* Data
* Pointer to the left child
* Pointer to the right child

most popular tree data structure that is used a lot is based on Binary Tree. Binary Search Tree is the most used tree data structure and it is a binary tree variation.

 */

/*
 * 
 * Tree
________________

                 1 //Root Node
                / \
      left     2    3      right
              / \  / \
             4  5  6  7 //Leaf Nodes
 * 
 *  // PreOrder Traversal (Root-Left-Right): 1,2,4,5,3,6,7
 *  // InOrder Traversal (Left-Root-Right): 4,2,5,1,6,3,7
 *  // PostOrder Traversal (Left-Right-Root): 4,5,2,6,7,3,1
 * 
 *  // PreOrder : Preorder traversal is used to create a copy of the tree. Preorder traversal is also used to get prefix expressions on an expression tree.
 * 
 * // InOrder : In the case of binary search trees (BST), Inorder traversal gives nodes in non-decreasing order.
 * 
 * // PostOrder : Postorder traversal is used to delete the tree. Postorder traversal is also useful to get the postfix expression of an expression tree
 * 
 */
 