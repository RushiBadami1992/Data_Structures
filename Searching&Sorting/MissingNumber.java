class MissingNumber{
public static void main(String args[])
{
int a[]={1,3,4,2,5};
int X=0,Y=0;
for(int i=0;i<a.length;i++)
{
	X^=a[i];
}
for(int i=1;i<=a.length;i++)
{
	Y^=i;
}
System.out.println(X^Y); 
}
}
