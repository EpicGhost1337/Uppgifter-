
public class Rep_Uppgifte_5_6 {
	
	String  name;
	int age;
 
	public Rep_Uppgifte_5_6(String name, int age){
		
		this.name = name;
	    this.age = age;
	    
	}
	
	public static void oldestPerson(Rep_Uppgifte_5_6 p1, Rep_Uppgifte_5_6 p2) {
		
		if(p1.age > p2.age){
			System.out.println(p1.name);
		}
		else{
			System.out.println(p2.name);
		}
		
	}
	
	public static void main(String[] args) {
		Rep_Uppgifte_5_6 Baok = new Rep_Uppgifte_5_6("Jocke",23 );
		Rep_Uppgifte_5_6 Pöjke = new Rep_Uppgifte_5_6("Pöjke",100 );
		Rep_Uppgifte_5_6 Andy = new Rep_Uppgifte_5_6("Andy",18 );
		Rep_Uppgifte_5_6 Vet_ej = new Rep_Uppgifte_5_6("Vet_ej",0 );
		
	
	}
	
	
}
