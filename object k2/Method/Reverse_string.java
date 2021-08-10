public class Reverse_string {

   public static void main(String args[])
   {
	 String a="milad mirkhan majeed";
     String b="";
	 for(int i=a.length()/* Dont forger the () for String */-1/*becouse array start at 0 and String start at 1 */;i>=0;i--)
	 {
      System.out.print(a.charAt(i)+" ");
	 }
}
}