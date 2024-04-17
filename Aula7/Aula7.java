import java.util.Scanner;


public class Aula7 {
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

    System.out.println("Aluno passou de semestre?");
    if ( Media <= 2) {
        System.out.println("Reprovado!!!");
    }
    else if (Media >= 2.1 && Media <= 4.9) {
        System.out.println("Precisa fazer a Sub!!!");
    }
    else {
        System.out.println("Aprovado");
    }

        scanner.close();
    }
    
}