package Aula10Ac2;
import java.util.Scanner;

public class Aula10 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Quantos alunos querem ver a nota?");
        int quantidadeDeAlunos = scn.nextInt();

        System.out.println("Quantas notas por aluno?");
        int quantasNotas = scn.nextInt();

        for (int a = 1;  a <= quantidadeDeAlunos; a++) {
            System.out.println("Qual o seu nome? ");
            String nome = scn.next();

            double tNota = 0.0, tPeso = 0.0;
            boolean dadosCorretos = false;

            while (!dadosCorretos) {
                tNota = 0.0;
                tPeso = 0.0;
                for (int i = 1; i <= quantasNotas; i++) {
                    System.out.println("Qual o peso da nota " + i + "?");
                    double peso = scn.nextDouble();
                    System.out.println("Qual a nota " + i + "?");
                    double nota  = scn.nextDouble();

                    tNota += nota * peso;
                    tPeso += peso;
                }

                if (tPeso <= 1.0) {
                    dadosCorretos = true;
                } else {
                    System.out.println("Os pesos ultrapassaram o limite de 1.0. Deseja reinserir os dados para o aluno " + nome + "? (s/n)");
                    char resposta = scn.next().charAt(0);
                    if (resposta != 's' && resposta != 'S') {
                        break;
                    }
                }
            }

            if (!dadosCorretos) {
                System.out.println("Dados inválidos para o aluno " + nome + ". Prosseguindo para o próximo aluno.");
                continue;
            }

            double media = tNota / tPeso;
            System.out.println("Média de " + nome + ": " + media);
            System.out.println("Status de aprovação: ");
            if (media <= 2) {
                System.out.println("Reprovado!!!");
            } else if (media >= 2.1 && media <= 4.9) {
                System.out.println("Precisa fazer a Sub!!!");
            } else {
                System.out.println("Aprovado");
            }
        }
        scn.close();
    }
}