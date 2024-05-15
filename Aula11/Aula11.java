package Aula11;

import java.util.Scanner;

public class Aula11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] vetor = new int [5];
        int soma = 0;
        double media = 0.0;

        for (int cont = 0; cont < vetor.length; cont++){
            System.out.println("numero");
            vetor [cont] = scanner.nextInt();

        }
        for (int cont = 0; cont < vetor.length; cont++){
            soma += vetor[cont];
        }

        media = soma/5;
        System.out.println("Media" +media);
    }
    
}
