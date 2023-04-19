class Node{
    int key;
    Node left,right;
    public Node(int item){
        key = item;
        left = right = null;
    }
}
public class J09_BinaryTree {
    public static void main(String[] args) {
        
        

    }
}

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
 * 
 */