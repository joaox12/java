import java.util.Scanner;

public class Ex07 {
  public static void main(String[] args) {
    int idade, soma;
    float media;
    Scanner exibe = new Scanner(System.in);

    media = 0;
    soma = 0;

    for (int c = 1; c <= 20; c++) {
      System.out.print("Idade " + c + ": ");
      idade = exibe.nextInt();

      soma = soma + idade;
      media = soma / c;
    }

    System.out.println("Média: " + media);
  }
}
