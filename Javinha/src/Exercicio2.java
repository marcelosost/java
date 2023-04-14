import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

        System.out.println("Insira o valor A");
        double valora = sc.nextDouble();
        System.out.println("Insira o valor B");
		double valorb = sc.nextDouble();
        double soma = valora + valorb;
		System.out.printf("SOMA = %.0f%n", + soma);
		
		sc.close();
		}
}
