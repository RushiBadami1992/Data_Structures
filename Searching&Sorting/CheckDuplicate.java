import java.util.HashSet;
public class CheckDuplicate{
public static void main(String args[])
{
HashSet<Integer> checkDuplicate=new HashSet<Integer>();
int[] A={1,2,3,4,2,5,6,7,8,9};
for(int i=0;i<A.length;i++)
{
	if(checkDuplicate.add(A[i])==false)
	{
		System.out.println(A[i]);
		break;
	}
}
}
}
