import java.io.Console;
class ReadStringTest{
public static void main(String args[]){
Console c=System.console();
String n=c.readLine("Enter your name: ");
System.out.println("Welcome "+n);
}
}