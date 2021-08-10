public class recation7
{
	public static void main(String[]args)
	{
		System.out.println(Fractorial(3,6));
	}
	public static int Fractorial(int n,int m)
	{
	if(n<=m)
	return(n*Fractorial(n+1,m));
	else
	return 1;
	}

}