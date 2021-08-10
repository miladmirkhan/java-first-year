 import java.util.Scanner;
  public class week
  {
    public static void main(String[] args) {
  Scanner in= new Scanner(System.in);

	int weeks1 = 3;
    int days1 = 7;

    // outer loop prints weeks
    for (int i = 1; i <= weeks1; ++i)
    {
      System.out.println("Week: " + i);

      // inner loop prints days
      for (int j = 1; j <= days1; ++j)
      {
        System.out.println("  Day: " + j);
      }
    }
  }}
