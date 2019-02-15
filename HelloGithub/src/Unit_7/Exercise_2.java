package Unit_7;

import java.io.*;
import java.util.*;

public class Exercise_2 {
	public static void main(String[] args) throws FileNotFoundException {
		int f = 0;
		int n = 0;
		int ft = 0;
		int sn = 0;
		File search = new File(
				"C:\\Users\\s-tsengl\\Documents\\github-get-started-LukeGTseng-master\\HelloGithub\\src\\Unit_7\\numsearch.txt");
		Scanner s = new Scanner(search);
		ArrayList<Integer> list = new ArrayList<Integer>();
		while (s.hasNext()) {
			list.add(s.nextInt());
		}
		f = binarySearch(list,5);
		n = binarySearch(list,9);
		ft = binarySearch(list,43);
		sn = binarySearch(list,79);
		System.out.println("Five: " + f);
		System.out.println("Nine: " + n);
		System.out.println("Forty-Three: " + ft);
		System.out.println("Seventy-Nine: " + sn);
	}

	public static int binarySearch(ArrayList<Integer> list, int target)
	{
	    int min = 0;
	    int max = list.size() - 1;
	    
	    while (min <= max)
	    {
	        int mid = (min + max) / 2;
	        if (list.get(mid) < target)
	            min = mid + 1;
	        else if (list.get(mid) > target) 
	            max = mid - 1;
	        else 
	            return mid;
	    }
	   return -(min + 1);
	}

}
