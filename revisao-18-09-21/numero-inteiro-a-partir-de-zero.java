import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int contador;
		int repetidor = 0;
		
		System.out.println("Insira qualquer número inteiro:" );
		contador = input.nextInt();
		
		while (repetidor <= contador) {
		    if (repetidor % 2 == 0) {
		        System.out.println(repetidor);
		    }
		    repetidor = repetidor + 1;
		}
	}
}
