import java.util.*;
public class MaxBinaryTree{
	public int findMax(BinaryTreeNode root)
	{
		int maxValue=Integer.MIN_VALUE;
		if(root !=null)
		{
		int leftMax=Integer.MIN_VALUE;
		int rightMax=Integer.MIN_VALUE;
		if(root.left !=null)
			leftMax=findMax(root.left);
		if(root.right !=null)
			rightMax=findMax(root.right);
		if(leftMax > rightMax)
		{
			maxValue=leftMax;
		}
		else
		{
			maxValue=rightMax;
		}
		}
		if(root.data>maxValue)
		{
			maxValue=root.data;
		}
		return maxValue;
	}
	public void findMaxNonRecursive(BinaryTreeNode root)
	{
		int maxValue=Integer.MIN_VALUE;
		Queue<BinaryTreeNode> queue=new LinkedList<BinaryTreeNode>();
		queue.offer(root);
		while(!queue.isEmpty())
		{
		BinaryTreeNode current=queue.poll();
			if(maxValue < current.getData())
			{
				maxValue=current.getData();
			}
			if(current.left !=null)
			{
				queue.offer(current.left);
			}
			if(current.right !=null)
			{
				queue.offer(current.right);
			}			
		}
		System.out.println(maxValue);
	}

	public int findSize(BinaryTreeNode root)
	{
		int leftCount=root.left == null ? 0:findSize(root.left);
		int rightCount=root.right == null ? 0:findSize(root.right);
		return 1+leftCount+rightCount;
	}

	public int maxHeight(BinaryTreeNode root)
	{
		if(root == null)
		{
			return 0;
		}
		int leftDepth=0,rightDepth=0;
		if(root.left !=null)
			leftDepth=maxHeight(root.left);
		if(root.right !=null)
			rightDepth=maxHeight(root.right);
		if(leftDepth>rightDepth)
		{
			return leftDepth+1;
		}
		else
		{
			return rightDepth+1;
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
		MaxBinaryTree binaryTree=new MaxBinaryTree();
		System.out.println(binaryTree.findMax(root));
		binaryTree.findMaxNonRecursive(root);
		System.out.println(binaryTree.findSize(root));
		System.out.println(binaryTree.maxHeight(root));
	}
}
