
/**
 * @author Truong Phu Vu
 * @since 11/9/2021
 */

import java.util.*;

public class MethodTest {
	private static <T> int count(ArrayList<T> obj) {
		return obj.size();
	}

	public static void main(String[] arg) {
		ArrayList<String> stringArr = new ArrayList<String>(Arrays.asList("Hello", "My", "Name", "Is", "Phu"));
		ArrayList<Integer> intArr = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		ArrayList<Double> doubleArr = new ArrayList<Double>(Arrays.asList(2.1,2.2,2.3,2.4,2.5,2.6,2.7,2.8));

		System.out.println("The number of elements in String ArrayList is " + count(stringArr));
		System.out.println("The number of elements in Integer ArrayList is " + count(intArr));
		System.out.println("The number of elements in Double ArrayList is " + count(doubleArr));

	}
}
