package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(0));
		
		String s = "Boa tarde";
//		s = s.toUpperCase();
//		s = "Bom dia;";
		System.out.println(s.concat("!!"));
		System.out.println(s +"!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = "33 Anos";
		var salario = 12345.987;
		
		System.out.println("Nome: "+ nome + "\nSobrenome: "
		                 + sobrenome + "\nIdade: "+ idade 
		                 + "\nSalario: "+ salario);
		System.out.printf("Nome: %s %s tem %s e ganha R$ %.2f. ", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nNome: %s %s tem %s e ganha R$ %.2f. ", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase Qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 8));
	}

}
