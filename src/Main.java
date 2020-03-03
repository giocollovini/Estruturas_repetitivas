import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x = 0;
		int soma = 0;

		System.out.println("---->>>LER UM VALOR E EFETUAR A SOMA AT� QUE O VALOR ZERO SEJA DIGITADO<<----");
		System.out.println("Entre com um Valor:");
		x = sc.nextInt();

		while (x != 0) {
			soma += x;
			System.out.println("Entre com um Valor:");
			x = sc.nextInt();
		}

		System.out.println("A SOMA DO VALORES �:" + soma);

		// ==========================================================================================
		int y = 0;
		int aux = 0;
		int somatorio = 0;

		System.out.println();
		System.out.println("---->>>LER UM VALOR E EFETUAR A SOMA AT� QUE O VALOR ZERO SEJA DIGITADO<<----");
		System.out.println("Entre com o numero de repeti��es:");
		y = sc.nextInt();

		for (int i = 0; y > i; i++) {
			aux++;
			System.out.println("Entre com " + aux + "� Valor:");
			y = sc.nextInt();
			somatorio += y;
		}

		System.out.println("A SOMATORIO DOS VALORES �:" + somatorio);

		// ==========================================================================================
		double celsius = 0.0;
		double fahrenheit = 0.0;
		char resposta = 's';

		System.out.println();
		System.out.println("---->>>LER O VALOR DA TEMPERATURA EM CELSIUS E CONVERTER PARA FAHRENHEIT<<----");

		do {
			System.out.print("Entre com a temperatura em CELSIUS: ");
			celsius = sc.nextDouble();
			fahrenheit = 9.0 * celsius / 5.0 + 32.0;

			System.out.printf("Equivalente em FAHRENHEIT �:  %.1f%n", fahrenheit);
			System.out.print("Deseja repetir (s/n)? ");
			resposta = sc.next().charAt(0);
		} while (resposta != 'n');

		// ==========================================================================================

		System.out.println();
		System.out.println("---->>>DEMOSNSTRA��O DO LA�O FOR EACH<<----");

		//Criei um vetor e inicializei com os valores
		String[] vect = new String[] { "Maria", "Bob", "Alex" };
		
		//La�o que mostra os valores do Vetor
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		//La�o FOR EACH que mostra os valores
		System.out.println();
		System.out.println("La�o FOR EACH");
		for (String obj : vect) {
			System.out.println(obj);
		}

	}

}
