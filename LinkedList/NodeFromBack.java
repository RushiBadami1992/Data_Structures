class NodeFromBack{
public static int counter=1;
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
		NodeFromBack nodeFromBack=new  NodeFromBack();
		System.out.println(nodeFromBack.getNthNodeFromBack(node1,2));
		System.out.println(nodeFromBack.recursNodeFromBack(node1,2).data);
										
		
}	

public int getNthNodeFromBack(ListNode head,int n){
	
	ListNode first=head;
	ListNode second=head;
	int i=0;
	
	while(i<n)
		{
		first=first.next;
		i++;
		}

	while(first!=null){
	first=first.next;
	second=second.next;
	}
return second.data;
}
public ListNode recursNodeFromBack(ListNode head,int n){
		ListNode result=head;
		if(head !=null){
			result=recursNodeFromBack(head.next,n);
			
			if(n==counter++)
				{
				//	System.out.println("Yo "+ " "+head.data);
					result=head;	
					//return head.data;
				}	
		}
		return result;	
	}
	

}	
