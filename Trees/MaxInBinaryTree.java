public class MaxInBinaryTree{

public static void main(String args[]){
		BinaryTreeNode root = new BinaryTreeNode(1);
		BinaryTreeNode leftchild1 = new BinaryTreeNode(2);
		BinaryTreeNode rightchild1 = new BinaryTreeNode(3);
		BinaryTreeNode leftchild2 = new BinaryTreeNode(4);
		BinaryTreeNode rightchild2 = new BinaryTreeNode(5);
		BinaryTreeNode leftchild3 = new BinaryTreeNode(6);
		BinaryTreeNode rightchild3 = new BinaryTreeNode(7);
		root.setLeft(leftchild1);
		root.setRight(rightchild1);
		
		leftchild1.setLeft(leftchild2);
		leftchild1.setRight(rightchild2);

		rightchild1.setLeft(leftchild3);
		rightchild1.setRight(rightchild3);

		BinaryTraversal traversal=new BinaryTraversal();
					
		MaxInBinaryTree maxInBinaryTree=new MaxInBinaryTree();
		System.out.println(maxInBinaryTree.findMax(root));
	}
	
	public int findMax(BinaryTreeNode root){
		int max=Integer.MIN_VALUE;
		if(root !=null){
			int leftValue=findMax(root.left);
			int rightValue=findMax(root.right);
			if(leftValue > rightValue)
			{
				max=leftValue;
			}
			else
			{	
				max=rightValue;
			}

			if(root.data > max)
			{
				max=root.data;
			}
			
		}		
		return max;	
	}

}
