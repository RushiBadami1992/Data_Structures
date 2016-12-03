public class PrintReverseList{

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
	PrintReverseList reverseList=new PrintReverseList();
	reverseList.reverse(node1);
	}

public void reverse(ListNode head){
 if(head==null)
	return ;
	
reverse(head.next);
System.out.println(head.data);	
}
}
