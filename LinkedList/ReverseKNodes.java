public class ReverseKNodes{

	public static void main(String args[])
	{
		ListNode node1=new ListNode(5);
		ListNode node2 =new ListNode(4);
		ListNode node3=new ListNode(10);
		ListNode node4=new ListNode(11);
		ListNode node5=new ListNode(12);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		ReverseKNodes reverseKNodes=new ReverseKNodes();
		ListNode list=reverseKNodes.reverseKtimes(node1,2);
		reverseKNodes.printList(list);
		
	}
	public ListNode reverseKtimes(ListNode head,int k)
	{
		ListNode current=head;
		ListNode prev=null;
		ListNode next=null;
		int count=k;
		while(current!=null && count  > 0){
		next=current.next;
		current.next=prev;
		prev=current;
		current=next;
		count --;
		}
		
		if(current != null)
			{
			head.next=reverseKtimes(current,k);
			//System.out.println(head.next.data);
			}
		return prev;
	
	}
	public void printList(ListNode list)
	{
		while(list !=null)
		{
			System.out.println(list.data);
			list=list.next;
		}
	}
}
