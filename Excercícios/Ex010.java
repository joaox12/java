import java.util.Scanner;

public class Ex010 {

  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    int dados;
    dados = 0;

    for (int i = 1; i < 20; i++) {
      System.out.println("Numero " + i + ":");
      int numero = ler.nextInt();

      if (numero >= 0 && numero <= 100)
        dados += 1;
    }
    System.out.println("São " + dados + " números entre 0 e 100");
  }
}