import java.util.Scanner;

public class Ex06 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int soma;
    soma = 0;
    for (int i = 1; i < 20; i++) {
      System.out.println("Idade: " + i + ":");
      int num = ler.nextInt();
      soma = soma + num;
    }

    System.out.println("A soma das idades : " + soma);

  }
}
