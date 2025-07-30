package assignment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
/*12.Create a class called Student with the following details: RollNo, StudName, MarksInEng, 
MarksInMaths and MarksInScience. Write getters and setters for the all variables. RollNo
should be automatically generated whenever a new student is added.

	     Create a class called Standard with 8 students’ details and write separate method for each of 
the following tasks and invoke the same.
1. To display the entire roll no and the name of the students in the class in the ascending order of roll no.
2. To display the roll no and the name of the student who has got the highest percentage.
3. To display the roll no and the name of the student who scored highest mark 
in mathematics.
4. To display the roll no and the name of the student in the ascending order of the total marks in mathematics and science alone.
5. To display the roll no, name, total marks, percentage and rank of all the students in the descending order of rank.
*/
import java.util.List;
class Student
{
	private static int rollincr=1;
	private int RollNo;
	private String StudName;
	private int MarksInEng;
	private int MarksInMaths;
	private int MarksInScience;

	public Student(String studName, int marksInEng, int marksInMaths, int marksInScience) {
		super();
		RollNo = rollincr++;
		StudName = studName;
		MarksInEng = marksInEng;
		MarksInMaths = marksInMaths;
		MarksInScience = marksInScience;
	}
	public int getRollNo() {
		return RollNo;
	}
	public String getStudName() {
		return StudName;
	}
	public void setStudName(String studName) {
		StudName = studName;
	}
	public int getMarksInEng() {
		return MarksInEng;
	}
	public void setMarksInEng(int marksInEng) {
		MarksInEng = marksInEng;
	}
	public int getMarksInMaths() {
		return MarksInMaths;
	}
	public void setMarksInMaths(int marksInMaths) {
		MarksInMaths = marksInMaths;
	}
	public int getMarksInScience() {
		return MarksInScience;
	}
	public void setMarksInScience(int marksInScience) {
		MarksInScience = marksInScience;
	}
	public int getTotalMarks() {
        return MarksInEng+MarksInMaths+MarksInScience;
	}
	public double getPercentage() {
        return getTotalMarks()/3.0;
    }
	
}
class Standard {
    private List<Student> students;
    public Standard(List<Student> students) 
    {
        this.students = students;
    }
    
    public void displayByRollNo() {
        students.stream()
            .sorted(Comparator.comparingInt(Student::getRollNo))
            .forEach(s->System.out.println("Roll No:" + s.getRollNo() + "Name: " + s.getStudName()));
    }
    public void displayHighestPercentage() {
        Student topStudent = students.stream()
            .max(Comparator.comparingDouble(Student::getPercentage))
            .orElse(null);
        if (topStudent != null) {
            System.out.println("Highest % -> Roll No: " + topStudent.getRollNo() + "Name: " + topStudent.getStudName());
        }
    }

    public void displayHighestMathMark() {
        Student topMath = students.stream()
            .max(Comparator.comparingInt(Student::getMarksInMaths))
            .orElse(null);
        if (topMath != null) {
            System.out.println("Highest Maths -> Roll No: " + topMath.getRollNo() + "Name: " + topMath.getStudName());
        }
    }
    public void displayMathScienceTotalAscending() {
        students.stream()
            .sorted(Comparator.comparingInt(s -> s.getMarksInMaths() + s.getMarksInScience()))
            .forEach(s -> {
                int total = s.getMarksInMaths() + s.getMarksInScience();
                System.out.println("Roll No: " + s.getRollNo() + ", Name: " + s.getStudName() + "Math+Sci: " + total);
            });
    }
    public void displayWithRank() {
        List<Student> ranked = new ArrayList<>(students);
        ranked.sort(Comparator.comparingInt(Student::getTotalMarks).reversed());
        int rank = 1;
        for (Student s : ranked) {
            System.out.printf("Rank %d -> Roll No: %d, Name: %s, Total: %d, Percentage: %.2f",
                rank++, s.getRollNo(), s.getStudName(), s.getTotalMarks(), s.getPercentage());
        }
    }
}

public class StudentApp {
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	    List<Student> studentList = Arrays.asList(
	      new Student("Vinitha",85,90,88),
          new Student("Ravi",78,80,82),
          new Student("Priya",92,96,94),
          new Student("Arjun",60,55,65),
          new Student("Divya",88,89,91),
          new Student("Kiran",70,72,75),
          new Student("Meena",66,68,70),
          new Student("Surya",95,99,97)
      );
      Standard std = new Standard(studentList);
      System.out.println("1.Roll No & Names in Ascending Order of Roll No:");
      std.displayByRollNo();
      System.out.println("2.Student with Highest Percentage:");
      std.displayHighestPercentage();
      System.out.println("3.Student with Highest Marks in Mathematics:");
      std.displayHighestMathMark();
      System.out.println("4.Ascending Order of Total Marks (Math + Science):");
      std.displayMathScienceTotalAscending();
      System.out.println("5.Roll No,Name,Total,Percentage and Rank:");
      std.displayWithRank();
	}


}
