import java.util.*;
public class StackReversal
{
public static Stack<Integer> stack=new Stack<Integer>();
public static void reverseStack(Stack stack)
{
	if(stack.isEmpty())return ;
	else
	{
	int temp=(int)stack.pop();
	reverseStack(stack);
	insertStack(stack,temp);
	}
}
public static void insertStack(Stack stack,int data)
{
	if(stack.isEmpty()){
		stack.push(data);
		return;
	}
	else
	{
	int temp=(int)stack.pop();
	insertStack(stack,data);
	stack.push(temp);
	}
}

public static void main(String[] args)
{
	
	StackReversal stackReversal=new StackReversal();	
	stack.push(10);
	stack.push(20);
	stack.push(30);
	stack.push(40);
	stack.push(50);
	stack.push(60);
	reverseStack(stack);
	
	while(!stack.isEmpty())System.out.println(stack.pop());
		
	
}	
}
