public class nestedloop
{
 public static void main(String[] args)
{
 // outer loop
 for (int i = 1; i <= 8; i++)
{
 // inner loop to print the numbers
 for (int j = 1; j < i; j++)
{
 System.out.print(j);
 }
 System.out.println("");
 }

 }
}