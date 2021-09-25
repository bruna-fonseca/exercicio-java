import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int idade, matriculasResponsavel = 0,  matriculasSucesso = 0, matriculasFeitas, matriculasRejeitadas = 0;
		float porcentagemDeRejeitados;
		String nomeResponsavel;
		
		for (int contador = 1; contador <= 6; contador++) {
		    System.out.println("Insira a idade do aluno " + contador);
		    idade = input.nextInt();
		    
		    if (idade < 15) {
		        matriculasRejeitadas++;
		        System.out.println("Aluno não pode se matricular");
		    } else if (idade >= 15 && idade < 21) {
		        matriculasResponsavel++;
		        System.out.println("Aluno só poderá se matricular com o responsável e receber o nome do responsável");
		        System.out.println("Informe nome do responsável:");
		        nomeResponsavel = input.next();
		    } else if (idade > 21) {
		        System.out.println("Aluno pode se matricular");
		        matriculasSucesso++;
		    }
		    
		}
	    matriculasFeitas = matriculasSucesso + matriculasResponsavel;
	    porcentagemDeRejeitados = (matriculasRejeitadas * 100) / 6;
	    
	    System.out.println("A porcentagem de rejeição é de: " + porcentagemDeRejeitados + "%");
	    System.out.println("O número de matrículas feitas com responsáveis: " + matriculasResponsavel);
	    System.out.println("O número total de matrículas realizadas: " + matriculasFeitas);
	}
}
