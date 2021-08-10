/*
 E.x: Write a Java program that can maintain information about a student. Create
a method that the user to provide array of tipe students (name, DOB and stage),
another method to print all students’ information on the screen. Test your methods
in a complete java program. Finally check equality between first and second
elements.
*/
import java.util.Scanner;
class Student/* if you put the class in main class you should writed as( public static class )or ( static class )*/
{
String name;
String DOB;
int stage;
}//close the class of(Student)

/////////////////////////////////////////////////////////////
public class get_Student_information
{
public static void main(String []arg)
{
Student s[]=new Student[3];// you should enetilaized the number of element by array
for(int i=0;i<s.length;i++)
s[i]=new Student();
fill_array(s);// method of input
print_array(s);// method of output


if(s[0].name.equals(s[1].name ) &&
s[0].DOB.equals(s[1].DOB) &&
s[0].stage==s[1].stage)
System.out.println("Yes, they are equal");
else System.out.println("No, they aren’t equal");
}
////////////////////////////////////////////////////////////
public static void fill_array(Student a[])// to input
{
Scanner input= new Scanner(System.in);
for(int i=0;i<a.length;i++)
{
System.out.println("Enter name: ");
a[i].name=input.nextLine();
System.out.println ("Enter Date of birth: ");
a[i].DOB=input.nextLine();
System.out.println ("Enter stage: ");
a[i].stage=input.nextInt();
input.nextLine();
}
}
//////////////////////////////////////////////////////////
public static void print_array(Student a[])// to output
{
for(int i=0;i<a.length;i++)
{
System.out.println(a[i].name+" "+a[i].DOB+" "+a[i].stage);
}
}

}//you close the class (get_Student_information) at the end