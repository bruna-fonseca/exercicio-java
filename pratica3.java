import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int repetidor = 0;
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
                repetidor++;
            }
        }
        
        if (repetidor > 0) {
            System.out.println("Nome foi encontrado: " + repetidor + " vezes");
        } else {
            System.out.println("Nome não encontrado");
        }

	}
}
