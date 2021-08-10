public class forrecur
{
public static int Factorial(int n)
{
int l=1;
int i;

for(i=2;i<=n;i++)
{
l= l*i;
}
return l;
}

public static void main(String[]args)
{

System.out.println(Factorial(4));

}
}
