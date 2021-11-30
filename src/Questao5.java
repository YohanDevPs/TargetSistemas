
public class Questao5 {

	public static void main(String[] args) {
	 
		String  nome = ("String de caracteres");
		char[] ch = nome.toCharArray();
		
		for (int i = nome.length()-1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
	}
}
