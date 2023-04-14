import java.util.Scanner;

public class Exercicio3 {
      public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      
      System.out.println("Vamos começar os cálculos deste exercício:");
      int a, b, c, d, dif;

      System.out.println("Digite o valor de a");
      a = sc.nextInt();      
      System.out.println("Digite o valor de b");
      b = sc.nextInt();
      System.out.println("Digite o valor de c");
      c = sc.nextInt();
      System.out.println("Digite o valor de d");
      d = sc.nextInt();

      dif = a * b -c * d;
      System.out.println("A diferença é de : " + dif);
      //System.out.printf("A=%.4f%n", A);
        sc.close();
    }
  }
