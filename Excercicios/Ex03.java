//*Leia o nome do usuário e escreva o nome dele na tela 10 vezes */

import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("Digite seu nome");
    String nome = ler.nextLine();

    for (int i = 0; i < 10; i++) {
      System.out.println(nome);

    }
  }
}
