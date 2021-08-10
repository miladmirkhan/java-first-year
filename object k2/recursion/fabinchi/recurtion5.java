//Using Recursion
public class recurtion5
        {
			public static int fabincci(int a)
        {
			if(a==0)
			return 0;
			if(a==1||a==2)
			return 1;
			else
			return fabincci(a-1)+fabincci(a-2);
		}
	public static int fibonacciRecursion(int n)
	    {
	if(n == 0)
	    {
		    return 0;
	    }
	if(n == 1 || n == 2){
			return 1;
		}
	return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
	    }

    public static void main(String args[]) {

	int maxNumber = 10;

	System.out.println("Fibonacci Series of "+maxNumber+" numbers: ");
	for(int i = 3; i <= maxNumber; i++){
			System.out.print(fibonacciRecursion(i) +" ");
			System.out.print(fabincci(i)+" ");
		}
 	    }
        }


