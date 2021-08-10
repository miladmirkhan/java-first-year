/*
if its binarysort or not binay sort
*/

public class bolianBinary
{
public static boolean sortDesendin(int a[])
{
for(int i=0;i<a.length-2;i++)
{
if(a[i]<a[i+1])
return false;
}
return true;
}
public static boolean sortAsending(int a[])
{
for(int i=0;i<a.length-2;i++)
{
	if(a[i]>a[i+1])
	return false;
	}
	return true;
}
public static void main(String[]args)
{
int []a={444,333,234,130};
int []b={1,23,45,76,898,1004};

System.out.println(sortDesendin(a));
System.out.println(sortDesendin(b));
System.out.println(sortAsending(a));
System.out.println(sortAsending(b));


}

}