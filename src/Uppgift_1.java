
public class Uppgift_1 {
	
	public static int sum(int...Number){
		
		int sum = 0;
		for (int n : Number) {
			sum += n;
			
      		}
		return sum;
		}
	public static void main(String[] args) {
		System.out.println(sum(1,2,3,4,6,7,8,9,10));
	}
		
		
	}

