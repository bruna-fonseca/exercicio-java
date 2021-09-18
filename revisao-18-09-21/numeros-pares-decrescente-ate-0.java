import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Insira qualquer número inteiro:");
		numero = input.nextInt();
		
		for (int repetidor = numero; repetidor >= 0; repetidor--) {
		    if (repetidor % 2 == 0) {
		        System.out.println(repetidor);
		    }
		}
		
	}
}
