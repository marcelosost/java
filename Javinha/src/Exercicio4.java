import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {
      public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
      
      System.out.println("Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por hora e calcula o salário  esse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas decimais.:");
      int num, nhoras;
      double valorhora;

      System.out.println();
      System.out.println("Digite o numero do funcionario");
      num = sc.nextInt();      
      System.out.println("Digite o numero de horas trabalhadas");
      nhoras = sc.nextInt();
      System.out.println("Digite o valor-hora do funcionário");
      valorhora = sc.nextDouble();
      System.out.println();
      System.out.println("O número do funcionário é : " + num);
      System.out.println();
      System.out.println("O salário do funcionário é de: U$ " + (nhoras * valorhora));
      //System.out.printf("A=%.4f%n", A);
        sc.close();
    }
  }
