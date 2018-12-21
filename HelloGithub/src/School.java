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
		if (isClassFull() == false) {
			list.add(s.nextLine());
			students = list.toArray(new String[list.size()]);
		}

	}

	public static boolean isClassFull() {
		if (students == null) {
			return false;

		} else if (students != null && students.length < MAX_CLASS_SIZE) {
			return false;
		} else {
			System.out.println("Class Full!");
			return true;
		}
	}

}
