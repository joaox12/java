import java.util.Scanner;

public class Ex011 {
  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);

    int num, tabuada;
    Scanner exibe = new Scanner(System.in);

    System.out.print("Digite um número inteiro positivo: ");
    num = exibe.nextInt();

    tabuada = 0;

    for (int c = 0; c <= 10; c++) {
      tabuada = num * c;
      System.out.println(num + " x " + c + " = " + tabuada);
    }

  }
}
