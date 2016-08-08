import java.util.*;
public class MinimumSum{
public static void main(String args[])
{
int A[]={1,60,-10,70,-80,85};
int minNegative=Integer.MAX_VALUE,minPositive=Integer.MAX_VALUE,temp;
int j=A.length-1;
int i=0;
Arrays.sort(A);
while(i<j)
{
	temp=A[i]+A[j];
	if(temp < 0)
	{
		if(temp < minNegative)
		{
		minNegative=temp;
		
		}
	i++;
	}
	else if(temp > 0)
	{
		if(temp < minPositive)
		{
		minPositive=temp;
		}
	j--;	
	}
	
}
System.out.println(Math.abs(minNegative) > minPositive ? minPositive : minNegative);
}
}
