import java.io.*;
import java.io.FileWriter;
import java.util.Scanner;
public class odd
{
public static void method(int a[],String s1,String s2)throws IOException
{
FileWriter wright= new FileWriter(s1+".txt",true);
PrintWriter out=new PrintWriter(wright);

FileWriter wright1= new FileWriter(s2+".txt",true);
PrintWriter out1=new PrintWriter(wright1);

for(int i=0;i<s1.length();i++)
{
if(a[i]%2==0){
out(a[i]);}
else{
out1(a[i]);
}
wright.close();
wright1.close();
out.close();
out1.close();
}
private static void out1(int i) {
}
private static void out(int i) {
}
public static void main(String[]args)throws IOException
{
Scanner in=new Scanner (System.in);
System.out.println("enter the first file name");
String s1=in.nextLine();
System.out.println("enter the first file name");
String s2=in.nextLine();

int[]s={33,4,3,4,24,223,1,2,1,5,7,9,8,7,5,3,4,7,8};
System.out.print(method(s,s1,s2));
}
}





