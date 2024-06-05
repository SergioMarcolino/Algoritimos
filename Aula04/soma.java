package Aula04;
import java.util.Scanner;

public class soma {

    public static void main(String[] args) {
        System.out.println("este programa vai somar dois nnumeros");

        Scanner scanner = new Scanner(System.in);
        System.out.println("primeiro numero");
        int primeiNumero = scanner.nextInt();

        System.out.println("segundoNumero");
        int segundoNumero = scanner.nextInt();

        int resultadoDaSoma = primeiNumero + segundoNumero;
        System.out.println("resultado Da Soma " + resultadoDaSoma);

        scanner.close();

    }

}