package Aula09Ac2;
import java.util.Scanner;

public class Aula09 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Quantos alunos querem ver a nota?");
        int quantidadeDeAlunos = scn.nextInt();

        System.out.println("quantas notas por aluno?");
        int quantasNotas = scn.nextInt();


        for (int a = 1;  a <= quantidadeDeAlunos; a++){
            System.out.println("Qual o seu nome? ");
            String nome = scn.next();

            double tNota = 0.0, tPeso = 0.0;
            for (int i = 1; i <= quantasNotas; i++){
                System.out.println("qual o peso");
                double peso = scn.nextDouble();
                System.out.println("nota");
                double nota  = scn.nextDouble();

                tNota += nota * peso;
                tPeso += peso;
            }

                if (tPeso <= 1.0) {
                    double media = tNota / tPeso;
                    System.out.println("media de " + nome + ": " + media);
                    System.out.println(" status de aprovação: ");
                    if ( media <= 2) {
                        System.out.println(" Reprovado!!!");
                    }
                    else if (media >= 2.1 && media <= 4.9) {
                        System.out.println(" Precisa fazer a Sub!!!");
                    }
                    else {
                         System.out.println(" Aprovado");
                    }
                  }
                else {
                    System.out.println("Os pesos ultrapassaram o limite!!!");
            }    
        }
        scn.close();
    }
}
