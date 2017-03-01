
public class AVLInsertion{
	
	AVLNode root;
	
	public AVLNode rightRotate(AVLNode y){
	AVLNode x=y.left;
	AVLNode T2=x.right;

	x.right=y;
	y.left=T2;
	
	x.height=Math.max(height(x.left),height(x.right))+1;
	y.height=Math.max(height(y.left),height(y.right))+1;
	return x;
	}
	
	public AVLNode leftRotate(AVLNode x){
	AVLNode y=x.right;
	AVLNode T2=y.left;
	
	y.left=x;
	x.right=T2;

	x.height=Math.max(height(x.left),height(x.right))+1;
	y.height=Math.max(height(y.left),height(y.right))+1;
	
	return y;	
	}

	public int height(AVLNode node){
		if(node==null){
			return 0;
		}
		else{
			return node.height;
		}	
	}
	
	public int getBalanced(AVLNode node){
	if(node	== null){	
		return 0;
		}	
	else {
		return height(node.left)-height(node.right);
 		}	
	}

	public  void preOrder(AVLNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }
	public AVLNode insert(AVLNode node,int data){
		if(node ==null)
		{
		return (new AVLNode(data));	
		}
		else if(data < node.data){
		node.left=insert(node.left,data);
		}
		else if(data > node.data){
		node.right=insert(node.right,data);		
		}
		else{
		return node;
		}
		node.height=Math.max(height(node.left),height(node.right))+1;
		int balance=getBalanced(node);
		
		if (balance > 1 && data < node.left.data)
            return rightRotate(node);
 
        // Right Right Case
        if (balance < -1 && data > node.right.data)
            return leftRotate(node);
 
        // Left Right Case
        if (balance > 1 && data > node.left.data) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
 
        // Right Left Case
        if (balance < -1 && data < node.right.data) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }
 
        /* return the (unchanged) node pointer */
        return node;
	}
	 public static void main(String[] args) {
        AVLInsertion tree = new AVLInsertion();
 
        /* Constructing tree given in the above figure */
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 25);
 
        
        System.out.println("Preorder traversal" +
                        " of constructed tree is : ");
        tree.preOrder(tree.root);
    }
	
}
