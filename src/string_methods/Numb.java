package string_methods;

public class Numb {

	public static void main(String[] args) {
		
        String s = "h78hd6ht6882h7e65dghdyre4";
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sum += Integer.parseInt(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println("Sum of all numbers in String: " + sum);
    }

	
	
	
	
	
	}

