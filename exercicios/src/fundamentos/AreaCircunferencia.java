package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		//int raio = 3;
		double raio = 3.4;
		final double PI = 3.14159;
		
		double area = PI * raio * raio;
		
		System.out.println(area);
		
		raio =10;
		area = PI * raio * raio;
		System.out.println("Area = " + area + "m2");
	
		
		//System.out.println(pi * raio * raio );
	}

}
