import java.util.*;
class ParanthesisBalancing
{
	public boolean isValidParanthesis(String s)
	{
		Stack<Character> stk=new Stack<Character>();
		int i=0;
		boolean validParan=true;	
		while(i < s.length())
		{
		
			if(s.charAt(i)==')')
			{
			 if(!stk.isEmpty() && stk.peek()=='(')
				stk.pop();
			else
				validParan=false;
		
			}
			else if(s.charAt(i)==']')
			{
			 if(!stk.isEmpty() && stk.peek()=='[')
				stk.pop();
			else
				validParan=false;
		
			}
			else if(s.charAt(i)=='}')
			{
			 if(!stk.isEmpty() && stk.peek()=='{')
				stk.pop();
			else
				validParan=false;
		
			}
			else
			{
			stk.push(s.charAt(i));
			}
			i++;

		}
		return validParan;
	}
	public static void main(String args[])
	{
		String s="{[()]}}";
		ParanthesisBalancing paranthesisBalancing=new ParanthesisBalancing();
		System.out.println(paranthesisBalancing.isValidParanthesis(s));
		
	}
		
}
 
