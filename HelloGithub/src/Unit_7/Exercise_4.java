package Unit_7;

import java.util.*;
import java.io.*;

public class Exercise_4 {

	public static void main(String[] args) throws FileNotFoundException {
		File search = new File(
				"C:\\Users\\s-tsengl\\Documents\\github-get-started-LukeGTseng-master\\HelloGithub\\src\\Unit_7\\names.txt");
		Scanner s = new Scanner(search);
		ArrayList<String> list = new ArrayList<String>();
		while (s.hasNextLine()) {
			list.add(s.nextLine());
		}
		list.add("Sam");
		String[] xd = new String[list.size()];
		xd = list.toArray(xd);
		insertionSort(xd);
		System.out.println(Arrays.toString(xd));
	}

	public static void insertionSort(String[] xd) {
		if (xd.length == 0) {
			System.out.println("xd is empty");
		} else if (xd.length == 1) {
			
			System.out.println("There is only 1 element in the xd");
		} else if (check(xd) == true) {
			System.out.println("All elements are the same");
		} else {
			for (int i = 1; i < xd.length; i++) {
				for (int j = i; j > 0 && xd[j].compareTo(xd[j - 1]) < 0; j--) {
					String temp = xd[j];
					xd[j] = xd[j - 1];
					xd[j - 1] = temp;
				}
			}
		}
	}

	public static boolean check(String[] xd) {
		for (int i = 1; i < xd.length; i++) {
			if (!xd[i - 1].equals(xd[i])) {
				return false;
			}
		}
		return true;

	}

}
