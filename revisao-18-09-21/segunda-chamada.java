import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int qntAlunos;
		int repetidor = 1;
		float notaAluno = 0;
		float media;
		
		System.out.println("Insira a quantidade de alunos que irão realizar a segunda chamada:");
		qntAlunos = input.nextInt();
		
		while (repetidor <= qntAlunos) {
		    System.out.println("Insira a nota do aluno " + repetidor);
		    notaAluno = notaAluno + input.nextFloat();
		    repetidor++;
		}
		
		media = notaAluno / qntAlunos;
		
		System.out.println("A media geral dos alunos é de: " + media);
	}
}
