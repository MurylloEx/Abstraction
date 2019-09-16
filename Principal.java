
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean bFlag = true;
		while (bFlag) {
			System.out.println("[0] Humano | [1] Cachorro | [2] Gato | [3] Para sair\nDigite um número:");
			String digitado = s.nextLine();
			switch (digitado) {
				case "0":
					System.out.println("Digite um nome para o humano:");
					digitado = s.nextLine();
					//Criar o humano
					Humano h = new Humano(digitado);
					h.tipoAnimal();
					h.tipoComunicacao();
					h.tipoMovimento();
					h.tipoInteligencia();
					System.out.println("\n\n");
					
					break;
				case "1":
					System.out.println("Digite um nome para o cachorro.");
					digitado = s.nextLine();
					//Criar o cachorro
					Cachorro c = new Cachorro(digitado);
					c.tipoAnimal();
					c.tipoComunicacao();
					c.tipoMovimento();
					c.tipoInteligencia();
					System.out.println("\n\n");
					
					break;
				case "2":
					System.out.println("Digite um nome para o gato.");
					digitado = s.nextLine();
					//Criar o gato
					Gato g = new Gato(digitado);
					g.tipoAnimal();
					g.tipoComunicacao();
					g.tipoMovimento();
					g.tipoInteligencia();
					System.out.println("\n\n");
					
				case "3":
					bFlag = false;
					break;
				default:
					System.out.println("Você deve digitar um dos números acima.");
					break;
			}
		}
		s.close();
	}
	
}
