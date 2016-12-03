public class DetectCycle{

public static void main(String args[]){
		ListNode node1=new ListNode(5);
		ListNode node2 =new ListNode(4);
		ListNode node3=new ListNode(10);
		ListNode node4=new ListNode(11);
		ListNode node5=new ListNode(12);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		node5.next=node2;
		DetectCycle cycle=new DetectCycle();	
		cycle.detectCycle(node1);

}

public void detectCycle(ListNode head){
	ListNode slowPtr=head;
	ListNode fastPtr=head;
	boolean loopExit=false;
	while(fastPtr !=null){
		fastPtr=fastPtr.next.next;
		slowPtr=slowPtr.next;
		if(fastPtr==slowPtr){
			loopExit=true;
			break;
			}
		}

	
	slowPtr=head;
	if(loopExit==true)
	{
		while(fastPtr!=null)
		{
			fastPtr=fastPtr.next;
			slowPtr=slowPtr.next;
			if(slowPtr==fastPtr)
			{
				System.out.println(slowPtr.data);
				break;
			}	
		}
	}	
}
}
