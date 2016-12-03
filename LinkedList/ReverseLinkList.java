public class ReverseLinkList{
	
public static void main(String args[]){
	ReverseLinkList reverseList=new ReverseLinkList();
	ListNode node1=new ListNode(5);
	ListNode node2 =new ListNode(4);
	ListNode node3=new ListNode(10);
	ListNode node4=new ListNode(11);
	ListNode node5=new ListNode(12);
	node1.next=node2;
	node2.next=node3;
	node3.next=node4;
	node4.next=node5;
	ListNode rev=reverseList.reverseList(node1);
	while(rev !=null){
	System.out.println(rev.data);
	rev=rev.next;
	}

}

public ListNode reverseList(ListNode head){
if(head==null || head.next==null){
return head ;
}
ListNode second=head.next;
head.next=null;
ListNode rest=reverseList(second);
second.next=head;
return rest;
}
}
