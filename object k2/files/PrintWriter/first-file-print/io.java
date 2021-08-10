import java.io.*;
public class io
{
public static void main(String []args)throws IOException
{
FileWriter writer=new FileWriter("first.txt",false);
//FileWriter NAME=new FileWriter("NAME of TXT file",boolean expration);
//false erase all text Writings
//true will not erase all Writings,all it will out it to next line

PrintWriter out1=new PrintWriter(writer);
//PrintWriter NAME=new PrintWriter(FileWriter NAME);

// or PrintWriter out=new PrintWriter(new FileWriter("firsr.txt",true));
out1.println("Hello");
out1.println("world");
out1.close();

}
}