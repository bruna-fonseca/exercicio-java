import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int repetidor = 0;
		int numerosPares = 0, numerosImpares = 0, numeroNegativos = 0, numerosPositivos = 0;
		int[] numeros = {10, 2, -2, -1, -5, 6, 7, 5, 29, 3};

		for (int index = 0; index < numeros.length; index++) {
		    if (numeros[index] % 2 == 0) {
		        numerosPares++;
		    } else {
		        numerosImpares++;
		    }
		}
		
		for (int index = 0; index < numeros.length; index++) {
		    if (numeros[index] > 0) {
		        numerosPositivos++;
		    } else {
		        numeroNegativos++;
		    }
		}
		
        if (numerosPares == numerosImpares) {
            System.out.println("Quantidade de números pares e ímpares é igual");
        } else if (numerosPares > numerosImpares) {
            System.out.println("Quantidade de números pares é maior que de ímpares");
        } else {
            System.out.println("Quantidade de números ímpares é maior que de pares");
        }
        
        if (numerosPositivos == numeroNegativos) {
            System.out.println("Quantidade de números positivos e negativos é igual");
        } else if (numerosPositivos > numeroNegativos) {
            System.out.println("Quantidade de números positivos é maior que de negativos");
        } else {
            System.out.println("Quantidade de números negativos é maior que de positivos");
        }
	}
}
