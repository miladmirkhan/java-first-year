import java.util.ArrayList;
public class list
{
public static void main(String[]args)
{
ArrayList<Integer> grades=new ArrayList<Integer>();

grades.add(1);
grades.add(2);
grades.add(3);
grades.add(4);

// add the number to the 4th list num
//and shift the corent number to next list num
grades.add(4,44);
grades.add(5);
grades.add(6);
grades.add(7);
grades.add(8);
grades.add(9);
grades.add(9);

// this will change the 10th list num to 10
grades.set(10,10);

//index of means the num that on the list and get the place of that number
System.out.println(grades.indexOf(0));

//how to get your list
System.out.println(grades);

//how to get your list size
System.out.println("your list size");
System.out.println(grades.size());

//know the 1st number on list
//by puting the place of list
System.out.println(grades.get(0));

//how to know if list the place of list in empty
grades.isEmpty();
System.out.println(grades.isEmpty());

//to clear the list
grades.clear();
System.out.println(grades);


}}


