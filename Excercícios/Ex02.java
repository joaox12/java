
//*Escreva um algoritmo que calcule a soma dos números de 1 a 15.  */

public class Ex02 {

  public static void main(String[] args) {
    int soma;

    soma = 0;
    for (int i = 0; i <= 15; i++) {
      soma = soma + i;
      System.out.println(i);

    }
    System.out.println("Soma: " + soma);
  }

}
