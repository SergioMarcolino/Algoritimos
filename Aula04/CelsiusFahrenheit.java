package Aula04;
import java.util.Scanner;

public class CelsiusFahrenheit {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
         System.out.println("calcular Celsius para Fahrenheit");

         System.out.println("Celsius");
         double celsius = scanner.nextInt();


         double conversao = (celsius * 1.8 + 32) ;
         System.out.println("Fahrenheit: " + conversao);

        scanner.close();

    }
    
}
