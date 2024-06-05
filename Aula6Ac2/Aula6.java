package Aula6Ac2;
import java.util.Scanner;

public class Aula6 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
    float nota, PesoUm = 0.15f, PesoDois = 0.30f, PesoTres = 0.10f, Pesoquatro = 0.45f, Media = 0.0f;

    System.out.println("Calculo de Média");
    
    System.out.println("Nota Ac1");
    nota = scanner.nextFloat() *PesoUm;

    System.out.println("Nota AC2:");
    nota = nota + scanner.nextFloat() *PesoDois;

    System.out.println("Nota AC3:");
    nota = nota + scanner.nextFloat() *PesoTres;

    System.out.println("Nota AC4:");
    nota = nota + scanner.nextFloat() *Pesoquatro;

    Media = (+nota);
    System.out.printf("MédiaFacens =  %.2f %n ", +Media);

    System.out.println("A nota é maior que 5?");
    if (Media >= 5 && Media <= 10) {
        System.out.println("Aprovado");
    }
    else {
        System.out.println("reprovado");
    }

        scanner.close();
    }
    
}