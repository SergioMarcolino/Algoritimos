package Aula4;
import java.util.Scanner;

public class Raizcubica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular a raiz quadrada: ");
        double numero = scanner.nextDouble();

        double RaizCubica = Math.cbrt(numero);

        System.out.println("A raiz quadrada de: " + numero + " é: " + RaizCubica);

        scanner.close();
    }
}
