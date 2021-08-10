public class void1
{
public static void main(String []args)
{
int x=5;
int y=3;
find(x,y);
System.out.println(x+", "+y);
}
public static void find(int x,int y)
{
int temp=0;
temp=x;
x=y;
y=temp;
System.out.println(x+","+y);
}

}
