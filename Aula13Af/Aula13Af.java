package Aula13Af;
import java.util.Scanner;

public class Aula13Af {
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

        // Armazenar dados dos alunoss
        String[] nomes = new String[quantidadeDeAlunos];
        double[][] todasNotas = new double[quantidadeDeAlunos][quantasNotas];
        double[] medias = new double[quantidadeDeAlunos];

        for (int a = 0; a < quantidadeDeAlunos; a++) {
            System.out.println("Qual o seu nome?");
            nomes[a] = scn.next();

            double tNota = 0.0;
            double somaPesos = 0.0;

            for (int i = 0; i < quantasNotas; i++) {
                System.out.println("Nota " + (i + 1) + ":");
                todasNotas[a][i] = scn.nextDouble();
                tNota += todasNotas[a][i] * pesos[i];
                somaPesos += pesos[i];
            }

            medias[a] = tNota / somaPesos;
            System.out.println("Média de " + nomes[a] + ": " + medias[a]);
            System.out.println("Status de aprovação:");
            if (medias[a] <= 2) {
                System.out.println("Reprovado!!!");
            } else if (medias[a] > 2 && medias[a] <= 4.9) {
                System.out.println("Precisa fazer a Sub!!!");
            } else {
                System.out.println("Aprovado");
            }
        }

        // Permitir consultas de notas
        boolean consultar = true;
        while (consultar) {
            System.out.println("Deseja consultar a nota de algum aluno? (s/n)");
            char resposta = scn.next().charAt(0);

            if (resposta == 's' || resposta == 'S') {
                System.out.println("Digite o nome do aluno:");
                String nomeConsulta = scn.next();
                boolean achouAluno = false;

                for (int a = 0; a < quantidadeDeAlunos; a++) {
                    if (nomes[a].equalsIgnoreCase(nomeConsulta)) {
                        achouAluno = true;
                        System.out.println("Notas de " + nomes[a] + ": ");
                        for (int i = 0; i < quantasNotas; i++) {
                            System.out.println("Nota " + (i + 1) + ": " + todasNotas[a][i] + " com peso " + pesos[i]);
                        }
                        System.out.println("Média de " + nomes[a] + ": " + medias[a]);
                        break;
                    }
                }

                if (!achouAluno) {
                    System.out.println("Aluno não encontrado.");
                }
            } else {
                consultar = false;
            }
        }

        scn.close();
    }
}