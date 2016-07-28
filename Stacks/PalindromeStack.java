import java.util.*;
public class PalindromeStack
{
	public boolean checkPalindrome(String s)
	{
		Stack<Character> stk=new Stack<Character>();
		int i=0;
		for(i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='X')
			break;
			
			stk.push(s.charAt(i));
			
		}
		i++;
//		System.out.println(stk.size());		
		while(i <s.length())
		{
			//System.out.println(s.charAt(i)+" "+stk.peek());
			if(stk.isEmpty())return false;

			if((char)stk.pop()!=s.charAt(i))return false;
			
			i++;	
		}
		return true;
	}

	public static void main(String args[])
	{	
	PalindromeStack paliString=new PalindromeStack(); 
	String s="abcfXfcba";
	System.out.println(paliString.checkPalindrome(s)); 
	}
}
