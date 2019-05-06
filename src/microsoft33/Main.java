package microsoft33;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Integer[] nums = {2, 1, 5, 7, 2, 0, 5};
		ArrayList<Integer> i = new ArrayList<>(); 
		
		List<Integer> numbers = Arrays.asList(nums);
		numbers.stream()
			   .forEach(x -> {i.add(x);
			   				  calc(i);}
					    );
		
	}

	private static void calc(ArrayList<Integer> array) {
		
		if(array.size() < 2) {System.out.println(array.get(0));}
		else if(array.size() % 2 == 1) {
			int x = array.size() / 2;
			array.sort(null);
			System.out.println(array.get(x));
		}else {
			int x = array.size() / 2;
			array.sort(null);
			int a = (array.get(x) + array.get(x-1));
			if(a % 2 == 1) {
				double b = (double)  a / 2;
				System.out.println(b);
			}else {
				int b = a/2;
				System.out.println(b);
			}
		}
	}
}
