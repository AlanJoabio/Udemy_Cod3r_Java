package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		String s = "Bom Dia X";
		s = s.replace("X", "Senhora");
		s = s.toUpperCase();
		s = s.concat("!!!");
		
		System.out.println(s);
		
		String x = "Alan".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Joabio")
				.toUpperCase()
				.concat("!!");
		System.out.println(y);
		
		//Tipo primitivo não tem o operador "."
		int a = 3;
		//a.
		System.out.println(a);
	}

}
