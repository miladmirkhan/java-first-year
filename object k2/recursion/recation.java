public class recation
{
	public static void main(String[]args)
	{
		System.out.println(Fractorial(3));
	}
	public static int Fractorial(int n)
	{
	if(n!=0)
	return(n*Fractorial(n-1));
	else
	return 1;
	}
}