import java.util.*;

public class School {
	private String courseName;
	private String teacherName;
	private int roomNumber;
	private int period;
	private final static int MAX_CLASS_SIZE = 30;
	private static String[] students;
	ArrayList<String> list = new ArrayList<String>();
	Scanner s = new Scanner(System.in);

	public static School readFromInput() {
		School newSchool = new School();
		System.out.println("Enter the Course Name: ");
		newSchool.addCourse();
		System.out.println("Enter the Teacher Name: ");
		newSchool.addTeacher();
		System.out.println("Enter the Room Number: ");
		newSchool.addRoom();
		System.out.println("Enter the Period: ");
		newSchool.addPeriod();
		Scanner in = new Scanner(System.in);
		while (in.hasNextLine() && isClassFull() == false) {
			System.out.println("Do you want to add a student? Type \"yes\" or \"no\".");
			if (in.nextLine().equals("yes")) {
				newSchool.addStudent();
			} else if (in.nextLine().equals("no")) {
				break;
			} else {
				System.out.println("Invalid input. Try Again.");
			}
		}
		return newSchool;
	}

	public void addCourse() {
		courseName = s.nextLine();
	}

	public void addTeacher() {
		teacherName = s.nextLine();
	}

	public void addRoom() {
		roomNumber = s.nextInt();
	}

	public void addPeriod() {
		period = s.nextInt();
	}

	public void addStudent() {
		list.add(s.nextLine());
		students = list.toArray(new String[list.size()]);
	}
	public static boolean isClassFull() {
		if(students == null) {
			return true;
		
		}else if (students != null && students.length < MAX_CLASS_SIZE) {
			return true;
		} else {
			System.out.println("Class Full!");
			return false;
		}
	}

}
