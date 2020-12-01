package Lista1.Questao1;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pressione \n[1] para criar um novo estudante; \n[2] para calcular m�dia; \n[3] Para ver o numero de matricula; \n[4] Para obter endere�o; \n[0] para sair.");
		boolean bFlag = true;
		Estudante e = null;
		while(bFlag) {
			System.out.println("\nDigite a pr�xima a��o [0, 1, 2, 3, 4]...");
			switch (sc.nextLine()) {
			case "1":
				System.out.println("Criando novo estudante...\n");
				System.out.println("Digite o nome:");
				String nome = sc.nextLine();
				System.out.println("Digite o Endere�o:");
				String endereco = sc.nextLine();
				System.out.println("Digite a Matr�cula:");
				int matricula = Integer.parseInt(sc.nextLine());
				System.out.println("Digite a nota 1:");
				float nota1 = Float.parseFloat(sc.nextLine());
				System.out.println("Digite a nota 2:");
				float nota2 = Float.parseFloat(sc.nextLine());
				System.out.println("Digite a nota 3:");
				float nota3 = Float.parseFloat(sc.nextLine());
				System.out.println("Digite a nota 4:");
				float nota4 = Float.parseFloat(sc.nextLine());
				e = new Estudante(nome, matricula, endereco, nota1, nota2, nota3, nota4);
				System.out.println("Estudante criado!");
				break;
			case "2":
				if (e != null) {
					System.out.println("A m�dia do estudante �: " + e.calcularMedia());
				}
				else {
					System.out.println("Crie um estudante primeiro!");
				}
				break;
			case "3":
				if (e != null) {
					System.out.println("A matr�cula do estudante �: " + e.getMatricula());
				}
				else {
					System.out.println("Crie um estudante primeiro!");
				}
				break;
			case "4":
				if (e != null) {
					System.out.println("O endere�o do estudante �: " + e.getEndereco());
				}
				else {
					System.out.println("Crie um estudante primeiro!");
				}
				break;
			case "0":
				bFlag = false;
				break;
			default:
				System.out.println("Digite uma a��o v�lida.");
				break;
			}
		}
		sc.close();
	}
	
}
