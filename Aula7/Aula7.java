package Aula7;
import java.util.Scanner;

public class Aula7 {
   

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int c1 = 0;
        int c2 = 12;
        int ad1 = 13;
        int ad2 = 19;
        int ja1 = 20;
        int ja2 = 25;
        int adt1 = 26;
  

        int idade = 34;

        System.out.println("idade");
        idade = scanner.nextInt();

        if (idade >= c1 && idade <= c2) {
            System.out.println("criancas");
            
        }
        else if (idade >= ad1 && idade <= ad2) {
            System.out.println("adolescente");
        }
        else if (idade >= ja1 && idade <= ja2) {
            System.out.println("adulto");
            
        }
        else if (idade >= adt1 ) {
            System.out.println("idoso");
        }
        else {
            System.out.println("idadde invalida");
        }
        scanner.close();
    }
    
}
