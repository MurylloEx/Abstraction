package Pacote;

import java.util.Scanner;

public class DesafioCedulas {
	
	
	static int QtdCed(int valor, int ced)
    {
        if (valor >= ced)
        {
            int resto = valor % ced;
            int qtd = (valor - resto) / ced;
            System.out.println(qtd + " nota(s) de R$ " + ced);
            return resto;
        }
        else
        {
        	System.out.println("0 nota(s) de R$ " + ced);
            return valor;
        }
    }
	
	public static void main(String args[]) {
		System.out.println("Forneça um valor em reais:");
		Scanner sc = new Scanner(System.in);
		int valor = sc.nextInt();
        System.out.println(valor);
        valor = QtdCed(valor, 100);
        valor = QtdCed(valor, 50);
        valor = QtdCed(valor, 20);
        valor = QtdCed(valor, 10);
        valor = QtdCed(valor, 5);
        valor = QtdCed(valor, 2);
        QtdCed(valor, 1);
		
        
        
		sc.close();
	}
	
	
	
}
