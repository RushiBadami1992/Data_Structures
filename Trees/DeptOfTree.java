public class DeptOfTree{

	public static void main(String args[])
	{
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

	//	rightchild1.setLeft(leftchild3);
	//	rightchild1.setRight(rightchild3);
		DeptOfTree dpt=new DeptOfTree();
		System.out.println(dpt.lca(root,leftchild1,rightchild1).data); 


	}	
	public int sizeOfTree(BinaryTreeNode root){
		if(root==null)
			return 0 ;
		int leftMax=sizeOfTree(root.left);
		int rightMax=sizeOfTree(root.right);
		return (leftMax < rightMax ?leftMax+1:rightMax+1); 	
	}
	
/*	public int maxSumAtLevel(BinaryTreeNode root){
	if(root ==null)
		{
			return 0;
		}	
	
	return (max(prevMax,maxSumAtLevel(root.left.data)+maxSumAtLevel(root.right.data),level-1)

	}*/

	public BinaryTreeNode lca(BinaryTreeNode root,BinaryTreeNode a,BinaryTreeNode b)
	{
		BinaryTreeNode left,right;
		if(root==null)
		{
			return root;
		}
		if(root==a || root==b)
		{
			return root;
		}
		left=lca(root.left,a,b);
		right=lca(root.right,a,b);
		if(left !=null && right !=null)
		{
			return root;
		}
		return(left !=null)?left:right;	
	}
}
