import java.util.Scanner;

public class Ex09 {
  public static void main(String[] args) {
    Scanner ler;
    ler = new Scanner(System.in);

    int impar, par;

    impar = 0;
    par = 0;

    for (int i = 1; i < 20; i++) {
      System.out.println("Numero " + i + ":");
      int numero = ler.nextInt();

      if (numero % 2 == 0) {
        par += 1;
      } else {
        impar += 1;
      }

    }
    System.out.println(par + " números pares");
    System.out.println(impar + " números ímpares");
  }
}
