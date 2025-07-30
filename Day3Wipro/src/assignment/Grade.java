/*3.The total number of students in a class are 90 out of which 45 are boys. If 50% of the total students secured grade 'A' out of which 20 are boys, then write a program to calculate the total number of girls getting grade 'A'.
 * */
package assignment;

public class Grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total_students=90;
		int total_grade=(int)(0.5*total_students);
		int gradeA_boys=20;
		int gradeA_girls=total_grade-gradeA_boys;
		System.out.println("Total number of girls getting grade 'A': "+gradeA_girls);
	}

}
