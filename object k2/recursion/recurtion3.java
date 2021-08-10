public class recurtion3
{
public static boolean isPal(String s)
{//palendro mens if we reverse the string it whoud be the same
if(s.length() <= 1)
return true;

//s has at lest 2 chars
return s.charAt(0 /*first element at char */)==s.charAt(s.length()-1  /*last element at char */) && isPal(s.substring(1/* delete one element at starting of String */,s.length()-1/* delete one element at end */));
/* return s.charAt(0)==s.charAt(s.length()-1 && pal(s.substring(1,s.length()-1)); */
}
public static void main(String[]args)
{
System.out.println(isPal("bobtdtbob"));

String s="abcdefg";

int q= s.length()-1;
System.out.println(s.substring(1,q));

System.out.println(s.charAt(0));//first char
System.out.println(s.charAt(s.length()-1 ));//last char

}
}
