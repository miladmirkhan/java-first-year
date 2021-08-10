import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class list4{

public static void main(String[] sdsfds){

List<Integer> allGrades =Arrays.asList(5,8,2,3,9,3,6,1);

//for sorting all number from small to big

Collections.sort(allGrades);

for(int grade : allGrades){
	System.out.println(grade);}

//for sorting all numbers from big to small

System.out.println("  ");
	Collections.reverse(allGrades);

	for(int grades : allGrades){
		System.out.println(grades);}



}}

