public class diviby
{
public static void main(String[]ared)
{
System.out.println(diviy (4));

System.out.println(mull (4));
}
public static double diviy (int t)
{
if(t!=0)
return t/diviy(t-1);
else
return 1;
}

public static int mull  (int a)
{
	if(a!=0)
	return a*mull(a-1);
	else
	return 1;
}

}