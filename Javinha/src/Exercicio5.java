import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println(
        "Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o   código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.");

    int cod1, qtpeca1, cod2, qtpeca2;
    double preco1, preco2, total;

    System.out.println("Digite o código da peça 1: ");
    cod1 = sc.nextInt();
    System.out.println("Digite a quantidade da peça 1: ");
    qtpeca1 = sc.nextInt();
    System.out.println("Digite o preço da peça 1: ");
    preco1 = sc.nextDouble();
    ///
    System.out.println("Digite o código da peça 2: ");
    cod2 = sc.nextInt();
    System.out.println("Digite a quantidade da peça 2: ");
    qtpeca2 = sc.nextInt();
    System.out.println("Digite o preço da peça 2: ");
    preco2 = sc.nextDouble();

    total = qtpeca1 * preco1 + qtpeca2 * preco2;
    System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

    sc.close();
  }
}
