package Aula12Af;
import java.util.Scanner;

public class Aula12Af {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Pesos fixos
        double[] pesos = { 0.15, 0.30, 0.10, 0.45 };
        int numPesos = pesos.length;

        System.out.println("Quantos alunos querem ver a nota?");
        int quantidadeDeAlunos = scn.nextInt();

        System.out.println("Quantas notas por aluno?");
        int quantasNotas = scn.nextInt();

        // Verificar se o número de notas corresponde aos pesos pré-definidos
        if (quantasNotas != numPesos) {
            System.out.println("O programa está configurado para exatamente " + numPesos + " notas com pesos fixos de 0.15, 0.30, 0.10, 0.45. Reinicie o programa e insira " + numPesos + " notas.");
            scn.close();
            return;
        }

        for (int a = 1; a <= quantidadeDeAlunos; a++) {
            System.out.println("Qual o seu nome?");
            String nome = scn.next();

            double[] notas = new double[quantasNotas];
            double tNota = 0.0;

            for (int i = 0; i < quantasNotas; i++) {
                System.out.println("Nota " + (i + 1) + ":");
                notas[i] = scn.nextDouble();
                tNota += notas[i] * pesos[i];
            }

            double media = tNota;
            System.out.println("Notas de " + nome + ": ");
            for (int i = 0; i < quantasNotas; i++) {
                System.out.println("Nota " + (i + 1) + ": " + notas[i] + " com peso " + pesos[i]);
            }
            System.out.println("Média de " + nome + ": " + media);
            System.out.println("Status de aprovação:");
            if (media <= 2) {
                System.out.println("Reprovado!!!");
            } else if (media > 2 && media <= 4.9) {
                System.out.println("Precisa fazer a Sub!!!");
            } else {
                System.out.println("Aprovado");
            }
        }
        scn.close();
    }
}