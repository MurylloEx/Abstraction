import java.util.Scanner;

public class questao7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mb, mbps, res, a;								
		Scanner s = new Scanner(System.in);
		System.out.println("Digite o tamanho do arquivo em MB: ");
		mb = s.nextInt(); 
		System.out.println("Informe a velocidade da internet em MBPS: " );
		mbps = s.nextInt(); 
		res = mb/60;
		a = res*mbps;
		System.out.println("O tempo aproximado de download será de " +res + (" minutos"));
		
		
	}

}
