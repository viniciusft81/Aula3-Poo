package poo;

import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    while (input.hasNext()){
      String linha = input.nextLine();

      System.out.println(linha.toUpperCase());
    }


//    if(args.length > 0) {
//      String nome = args[0];
//      System.out.println("Olá " + nome + " tudo bem?");
//    } else {
//      System.err.println("Forneça um argumento...");
//    }

    for(String x:args){

    }


  }
}
