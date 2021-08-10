public class fa
{
public static void main(String[]args)
{

System.out.println(fabincci(7));

for(int i=0;i<=10;i++)
{
	System.out.print(fabincci(i)+" ");

}
}

public static int fabincci(int n)
{

if(n==1||n==2){
return 1;}
if(n==0){
return 0;}
else
return fabincci(n-2)+fabincci(n-1);
}


}