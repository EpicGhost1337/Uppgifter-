
public class Uppgift_2 {

		
	public static void main(String[] args) {
		
		System.out.println(reverse("Baok" + "Hej" + "dö"));	
	}
	
	public static String reverse(String input) {
		
		if (input.length() == 1) {
			
			return input;
		}
		
		else {
			return reverse(input.substring(1))+" " + input.charAt(0);
		}
    }		
}

