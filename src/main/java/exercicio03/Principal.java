package exercicio03;

import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    while (input.hasNext()){
      String linha = input.nextLine();

      System.out.println(linha.toUpperCase());
    }
  }
}
