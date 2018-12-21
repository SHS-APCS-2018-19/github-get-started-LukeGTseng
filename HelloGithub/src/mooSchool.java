import java.util.*;
public class mooSchool {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		School[] totalClasses = null;
		ArrayList<String> list = new ArrayList<String>();
		for(;;) {
			System.out.println("Type \"1\" to create a new class\nType \"2\" to add a student to the class\nType \"3\" to get details about all the classes\\nType \\\"3\\\" to list total amount of classes");
			int num = s.nextInt();
			if(num == 1) {
				list.add(School.readFromInput());
				totalClasses = list.toArray(new School[list.size()]);
			} else if(num == 2) {
				
			} else if(num == 3) {
				
			}
		}
	}
}
