package exercicio02;

import java.util.Scanner;

public class Principal {
  public static void main(String[] args) {
    float n, h=0;

    Scanner input = new Scanner(System.in);

    System.out.print("Entre com o valor para soma harmonica:");
    n = input.nextFloat();

    while (n > 0) {
      h = h + 1/n;
      n--;
    }
    System.out.println("Valor da soma harmonica é: " + h);

  }
}
