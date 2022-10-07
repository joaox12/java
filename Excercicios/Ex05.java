
import java.util.Scanner;

public class Ex05 {

  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);

    int soma;
    soma = 0;
    for (int i = 1; i < 10; i++) {
      System.out.print("Número " + i + ": ");
      int numero = ler.nextInt();
      soma = numero + soma;
    }

    System.out.println("Soma de todos os Números : " + soma);

  }
}