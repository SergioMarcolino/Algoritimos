package Aula4;
import java.util.Scanner;

public class PerimetroRetangulo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
         System.out.println("calcular perimetro de um retangulo");

         System.out.println("Altura");
         int altura = scanner.nextInt();

         System.out.println("base");
         int base = scanner.nextInt();

         int perimetro = 2 * (altura + base);
         System.out.println("perimetro:" + perimetro);

         scanner.close();
    }
    
}
