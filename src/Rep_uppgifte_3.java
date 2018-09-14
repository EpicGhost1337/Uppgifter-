import java.util.Scanner;

public class Rep_uppgifte_3 {
	
	private static Scanner sc;

	public static void main(String[] args) {

	sc = new Scanner(System.in);	

	double radie = sc.nextDouble();
	double diameter = 2*radie;
	double area = radie*radie*Math.PI;
	double volym = 4*Math.PI*radie*radie*radie/3;

	System.out.println("diameter "+ diameter);
	System.out.println("area "+ area);
	System.out.println("volym "+ volym);
	}
	

}
