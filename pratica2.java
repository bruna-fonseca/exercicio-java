import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] nomes = new String[6];
		String nomeBuscado;
		
		for (int index = 0; index < nomes.length; index++) {
		    System.out.println("Insira um nome, por favor:");
		    nomes[index] = input.next();
		}
		
	    System.out.println("Agora, insira um nome para buscar na lista");
	    nomeBuscado = input.next();

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals(nomeBuscado)) {
                System.out.println("Encontrado na posição:" + i);
            } else {
                System.out.println("Não encontrado");
            }
        }
	}
}
