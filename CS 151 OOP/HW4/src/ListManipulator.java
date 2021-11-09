/**
 * HW4 Excercise 1
 * @author Truong Phu Vu
 * @since 10/19/2021
 */
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

public class ListManipulator {
	//constructor
	ListManipulator(){
		
	}
	
	/**
	 * 
	 * @param myLst
	 * @param ascending
	 * @return ascended myLst if ascending is true
	 * 		   descended myLest if ascending is false
	 */
	public ArrayList<Integer> sort(ArrayList<Integer> myLst, Boolean 
			ascending){
		if (ascending == true) {
			Collections.sort(myLst);
		} else {
			Collections.sort(myLst, Collections.reverseOrder());
		}
		return myLst;
	}
	
	public ArrayList<Integer> swapLargestSmallest(ArrayList<Integer> 
	myLst){
		int max = Collections.max(myLst);
		int min = Collections.min(myLst);
		Collections.swap(myLst, myLst.indexOf(min), myLst.indexOf(max));
		return myLst;
	}
	
	public void table(ArrayList<Integer> myLst) {
		Map<Integer, Integer> table = new HashMap<Integer, Integer>();
		for (int i = 0; i < myLst.size(); i++) {
			if (!table.containsKey(myLst.get(i))) {
				table.put(myLst.get(i), Collections.frequency(myLst, myLst.get(i)));
			}
		}
		
		TreeMap<Integer, Integer> sortedTable = new TreeMap<Integer, Integer>();
		sortedTable.putAll(table);
		
		for (Integer key : sortedTable.keySet()) {
			System.out.println("Value: " + key + ", " + "Appears " + sortedTable.get(key) + " times" );
		}
	}
	
}
