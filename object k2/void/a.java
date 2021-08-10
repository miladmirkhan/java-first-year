public class a
{
public static void sum(int []x)
{
	for(int i=0;i<x.length;i++)
	{
		System.out.print(x[i]+3+" ");
}
}

public static void main (String[]args)
{

int[]x={54,6,2,42,3,2};
for(int i=0;i<x.length;i++){
	System.out.print(x[i]+" ");
}
System.out.println();
	sum(x);
}
}