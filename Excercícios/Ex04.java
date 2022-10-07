/*Leia o nome e um número qualquer do usuário. Escreva seu nome na tela a mesma quantidade de
vezes do número digitado */

import java.util.Scanner;

public class Ex04 {

  public static void main(String[] args) {

    Scanner ler = new Scanner(System.in);

    System.out.println("Digite seu nome: ");
    String nome = ler.nextLine();

    System.out.println("Número de vezes na tela: ");
    int numero = ler.nextInt();

    for (int i = 1; i < numero; i++) {
      System.out.println(nome);
    }

  }
}