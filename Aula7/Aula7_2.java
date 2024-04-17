package Aula7;

import java.util.Scanner;

public class Aula7_2 {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("digite um numero");
    int digito = scanner.nextInt();

        switch (digito) {
            case 1:
            System.out.println("coca-cola, custa R$ 7,00");
                
                break;
        
            default:
                break;
        }
    }
    
}
