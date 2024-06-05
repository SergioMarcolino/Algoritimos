package Aula04;
import java.util.Scanner;

public class PerimetroQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("cálculo do perimetro co quadrado");

        System.out.println("Lado");
        int lado = scanner.nextInt();

        int perimetro = lado * 4 ;
        System.out.println("resultado do perimetro do quadrado:" + perimetro);

        scanner.close();
  }      
}        