import java.util.Scanner;

public class Raizcubica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para calcular a raiz quadrada: ");
        double numero = scanner.nextDouble();

        double raizQuadrada = Math.sqrt(numero);

        System.out.println("A raiz quadrada de: " + numero + " é: " + raizQuadrada);

        scanner.close();
    }
}
