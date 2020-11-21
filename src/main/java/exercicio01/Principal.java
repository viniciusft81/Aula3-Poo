package exercicio01;

import java.util.Scanner;

public class Principal {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    float l1,l2,l3;

    System.out.println("Formar um triangulo");
    System.out.print("Entre com o lado 1: ");
    l1 = input.nextFloat();

    System.out.print("Entre com o lado 2: ");
    l2 = input.nextFloat();

    System.out.print("Entre com o lado 3: ");
    l3 = input.nextFloat();

    if(l1 == l2 && l1 == l3 && l2==l3){
      System.out.println("É um triangulo Equilatero.");
    } else if (l1 == l2 || l1 == l3 || l2 == l3){
      System.out.println("É um triangulo Isosceles.");
    } else if(l1 != l2 && l1 !=l3 && l2 != l3) {
      System.out.println("É um triangulo Escaleno");
    }
  }
}
