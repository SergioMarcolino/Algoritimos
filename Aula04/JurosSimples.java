package Aula04;
import java.util.Scanner;

public class JurosSimples {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
         System.out.println("Calcular Juros");

         System.out.println("capital");
         double capital = scanner.nextDouble();

         System.out.println("Taxa");
         double taxa = scanner.nextDouble();

         System.out.println("Tempo");
         double tempo = scanner.nextDouble();

         double valor = ((capital * taxa * tempo) /100) ;
         System.out.println("valor:" + valor);

         scanner.close();

    }
    
}
