import java.util.Scanner;

public class Ex012 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int pos, neg, zero;
    pos = 0;
    neg = 0;
    zero = 0;

    for (int i = 1; i < 10; i++) {
      System.out.print("Digite um Número : ");
      int numero = ler.nextInt();

      if (numero == 0) {
        zero += 1;
      }

      if (numero > 0) {
        pos += 1;
      }
      if (numero < 0) {
        neg += 1;
      }
    }
    System.out.println("");
    System.out.println("Positivos: " + pos);
    System.out.println("Negativos: " + neg);
    System.out.println("Zeros: " + zero);
  }
}