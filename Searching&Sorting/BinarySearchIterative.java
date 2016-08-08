class BinarySearchIterative
{
public static void main(String args[])
{
int data=2;
int[] A={1,2,3,4,5,6,7,8,9};
int low=0;
int high=A.length-1;

while(low <=high)
{
	int mid=(low+high)/2;
	if(A[mid]==data)
	{
		System.out.println(A[mid]);
		break;
	}
	else
	{
		if(A[mid] < data)
		{
		 low=mid+1;
		}
		else
		{
		high=mid-1;
		}
	}
}
}
}
