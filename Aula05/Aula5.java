package Aula05;
import java.util.Scanner;

public class Aula5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double soma, media = 0.0;

        System.out.println("primeiro numero:");
        soma = scanner.nextDouble();

        System.out.println("Segundo numero:");
        soma = soma + scanner.nextDouble();

        System.out.println("Terceiro numero:");
        soma = soma + scanner.nextDouble();

        
         media =  soma /3;
        System.out.println("media:" +media);

    

        
        scanner.close();
    }
}

