package Unit_7;

import java.util.*;
import java.io.*;

public class Exercise_3Names {
	public static void main(String[] args) throws FileNotFoundException {
		String[] arr = new String[20];
		File search = new File("C:\\Users\\s-tsengl\\.eclipse\\names.txt");
		Scanner s = new Scanner(search);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextLine();
		}
		System.out.println(Arrays.toString(selectionSort(arr)));
	}

	public static String[] selectionSort(String[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j].compareTo(arr[min]) < 0) {
					min = j;
				}
			}
			String temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		return arr;
	}
}
