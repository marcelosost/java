public class Exercicos6 {
  
}
import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println(
        "Testes em relação a estrutura cond simples e composta");
      hora = sc.nextInt();

      if (hora < 12) {
        System.out.println("Bom dia!");
      }
      else if (hora < 18) {
        System.out.println("Boa tarde!");
      }
      else {
        System.out.println("Boa noitee!");
      }
  }
    sc.close();
  }
