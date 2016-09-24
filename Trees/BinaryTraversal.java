public class BinaryTraversal
{

	public void preOrder(BinaryTreeNode root)
	{	
	if(root!=null)
		{	
			System.out.print(root.getData()+" ");
			preOrder(root.getLeft());			
			preOrder(root.getRight());
		}
	}
	public void inOrder(BinaryTreeNode root)
	{
		if(root !=null)
		{
			inOrder(root.getLeft());
			System.out.print(root.getData()+ " ");
			inOrder(root.getRight());					
		}
	}
	public void postOrder(BinaryTreeNode root)
	{
		if(root !=null)
		{
			postOrder(root.getLeft());
			postOrder(root.getRight());
			System.out.print(root.getData()+" ");					
		}
	}
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

		rightchild1.setLeft(leftchild3);
		rightchild1.setRight(rightchild3);

		BinaryTraversal traversal=new BinaryTraversal();
		
		traversal.preOrder(root);
		System.out.println();
		traversal.inOrder(root);
		System.out.println();
		traversal.postOrder(root);
		System.out.println();

	}
}
