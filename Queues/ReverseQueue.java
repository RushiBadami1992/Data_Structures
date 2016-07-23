import java.util.*;
public class ReverseQueue
{
public LinkedQueue queueReverse(LinkedQueue queue)throws Exception
{
	Stack<Integer> stack=new Stack<Integer>();
	while(!queue.isEmpty())
	{
//	System.out.println("Second Check");
	stack.push(queue.deQueue());
	}
	while(!stack.isEmpty())
	{
//	System.out.println("Third Check");
		queue.enQueue(stack.pop());	
	}
	return queue;
}
public void display(LinkedQueue queue)throws Exception
{
	while(!queue.isEmpty())
	{	
		System.out.println(queue.deQueue());
	}
}

public static void main(String args[])
{
	ReverseQueue reverseQueue=new ReverseQueue();
	LinkedQueue linkedqueue=new LinkedQueue();
	//Example
	linkedqueue.enQueue(50);
	linkedqueue.enQueue(60);
	linkedqueue.enQueue(70);
	linkedqueue.enQueue(80);
	linkedqueue.enQueue(90);
	linkedqueue.enQueue(100);
	//System.out.println(linkedqueue.isEmpty());
	try
	{	
	linkedqueue=reverseQueue.queueReverse(linkedqueue);
	reverseQueue.display(linkedqueue);
	}catch(Exception e)
	{
	System.out.println(e);
	}
}
}
