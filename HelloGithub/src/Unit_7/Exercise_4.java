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
		String[] array = new String[list.size()];
		array = list.toArray(array);
		insertionSort(array);
		System.out.println(Arrays.toString(array));
	}

	public static void insertionSort(String[] array) {
		if (array.length == 0) {
			System.out.println("Array is empty");
		} else if (array.length == 1) { 
			System.out.println("There is only 1 element in the array");
		} else {
			for (int i = 1; i < array.length; i++) {
				for (int j = i; j > 0 && array[j].compareTo(array[j - 1])<0; j--) {
					String temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
	}
}
