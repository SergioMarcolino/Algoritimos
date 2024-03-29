import java.util.Scanner;

public class AreaQuadrado {

    public static void main(String[] args) {

        System.out.println("Cálculo da área do retângulo");
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("Base");
        int base = scanner.nextInt();

        System.out.println("Altura");
        int altura = scanner.nextInt();

        int area = base * altura; // Cálculo da área
        System.out.println("Resultado da área:" + area);

        scanner.close();


    }
}