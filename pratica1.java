// Escreva um programa para receber a quantidade de pessoas contraminadas com o corona vírus nas 5 cidades principais
// cidades de um estado. Ao final mostrar quantas cidades tiveram pessoas contaminadas iguais ou superiores a média geral


import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    int[] cidades = new int[5];
	    int acumulador = 0;
	    int contador = 0;
	    
	    for (int repetidor = 0; repetidor < cidades.length; repetidor++) {
	        System.out.println("Insira o número de casos de covid-19:");
	        cidades[repetidor] = input.nextInt();
	    }
	    
	    for (int index = 0; index < cidades.length; index++) {
	        acumulador = acumulador + cidades[index];
	    }
	    
	    int media = acumulador / cidades.length;
	    
	    for (int index = 0; index < cidades.length; index++) {
    	    if (cidades[index] >= media) {
    	        contador++;
    	    }
	    }
	    System.out.println("O número de cidades que estão na média ou acima na quatidade de casos é de:" + contador);
	}
}