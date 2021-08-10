public class recaes
{
  public static void main(String[] args)
  {
    int result = sum(5,11);
    System.out.println(result);
  }
  public static int sum(int start,int end)
  {
    if (end > start)
  {
      return end + sum(start, end-1);//formula
  }
    else
  {
      return end;
  }
}
}

/*

 public static int sum(int start,int end)
  {
    if (end > start)
  {
      return start + sum(start+1, end);//formula
  }
    else
  {
      return end;
  }
}

*/