package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
	
	public static void main(String[] args) {
		double a = 1;
		System.out.println(a); //implícita
		
		float b = (float) 1.12345678888; //explícita (CAST)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; //explícita (CAST)
		System.out.println(d);
		
		double e = 1.9999;
		int f = (int)e; //explícita (CAST)
		System.out.println(f);
	}

}
