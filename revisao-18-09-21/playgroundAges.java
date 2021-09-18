import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        int qntPessoasMaioresIdade = 0;
        int maisVelho = 0;
        int[] idades = new int[7];
        int sum = 0;
        
        //inserindo as idades de 7 pessoas
        for (int i = 0; i <= idades.length -1; i++) {
    	    System.out.println("Insira a idade da pessoa " + i + ":");
            idades[i] = input.nextInt();
        }
        
        // verificar a quantidade de pessoas maiores de idade
        for (int contador = 0; contador <= idades.length - 1; contador++) {
            if (idades[contador] >= 18) {
                qntPessoasMaioresIdade++;
            }
        }
        
        // a idade da pesosa mais idosa
        for (int contador = 0; contador <= idades.length - 1; contador++) {
            if (idades[contador] > maisVelho) {
                maisVelho = idades[contador];
            }
        }
        
        // a idade da pessoa mais nova
        int maisNovo = idades[0];
        for (int contador = 0; contador <= idades.length - 1 ; contador++) {
            if (idades[contador] < maisNovo) {
                maisNovo = idades[contador];
            }
        }
        
        // a idade media
        int soma = 0;
        for (int index = 0; index <= idades.length - 1; index++) {
            soma = soma + idades[index];
        }
        
        float media = soma / idades.length;
        
        // quantidade de pessoas com a idade igual a maior idade do grupo 
        int velhoContador = 0;
        for (int index = 0; index <= idades.length -1; index++) {
            if (idades[index] == maisVelho) {
                velhoContador++;
            }
        }
        
        
        System.out.println("Quantidade de pessoas maiores de idade "+ qntPessoasMaioresIdade);
        System.out.println("A idade da pessoas mais velha " + maisVelho);
        System.out.println("A idade da pessoa mais nova " + maisNovo);
        System.out.println("A média de idade entres as pessoas é de: " + media);
        System.out.println("A quatidade de pessoas mais velhas com a mesma idade é de: " + velhoContador);
	}
}
