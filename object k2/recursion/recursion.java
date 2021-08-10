public class recursion
{
public static void main(String[]args)
{
System.out.println(fraction(3));
}
public static int fraction(int n)
{
if(n!=0)

return (n+fraction(n-1));
else
return 0;
}

}