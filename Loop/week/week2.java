  import java.util.Scanner;
  public class week2
  {
    public static void main(String[] args) {
  Scanner in= new Scanner(System.in);{
  int weeks = 4;
      int days = 7;

      // outer loop
      for(int i = 1; i <= weeks; ++i) {
        System.out.println("Week: " + i);

        // inner loop
        for(int j = 1; j <= days; ++j) {

          // continue inside the inner loop
          if(j % 2 == 0) {
            continue;
          }
          System.out.println("  Days: " + j);
        }
      }
   } }
}