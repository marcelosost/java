import java.util.Locale;
import java.util.Scanner;

import javax.print.event.PrintJobListener;

public class Exercicio2 {
  public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
    System.out.println("Digite aqui o valor a ser calculado:");
		double R, A, pi = 3.14159;
 	    R = sc.nextDouble();
	    A = pi * R * R;
	    System.out.printf("A=%.4f%n", A);

		sc.close();
	}
}