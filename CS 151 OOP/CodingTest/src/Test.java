
public class Test {
	 public static boolean isValid(String s) {
	        boolean flag = false;
	        for (int i = 0; i < s.length() ; i= i +2){
	            if (s.charAt(i) == '(' && s.charAt(i+1) == ')' || s.charAt(i) == '[' && s.charAt(i+1) == ']' || s.charAt(i) == '{' && s.charAt(i+1) == '}'){
	                flag = true;
	            } else {
	            	flag = false;
	            	break;
	            }
	        }
	        return flag;
	    }
	public static void main (String [] arg) {
		System.out.println(isValid("()[]{)"));
	}
}
