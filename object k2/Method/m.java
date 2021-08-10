public class m
{
public static String inv(String s)
{
String temp="";
int b=s.length();
for(int i=0;i<b;i++)
{
char c=s.charAt(i);
if(c!='a'&&c!='A')
{
temp=temp+c;
}
}
return temp;
}
public static void main(String[]args)
{
System.out.println(inv("miladAA"));
}
}