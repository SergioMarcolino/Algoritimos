package Aula08Ac2;
import java.util.Scanner;
public class Aula08 {
        public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
    
            System.out.println("quantas notas serâo?");
            int qnotas = scn.nextInt();
    
    
            double  peso = 0.0,  nota = 0.0, media = 0.0;
    
            for (int i = 1; i <= qnotas; i++){
                System.out.println("qual o peso");
                peso = scn.nextDouble();
                
                System.out.println("nota");
                nota  = scn.nextDouble();
                
    
                media += nota * peso;
    
    
            }
            if (media <= 10.0) {
                    System.out.println("media");
                    System.out.println(media);
            
                    System.out.println("Aluno passou de semestre?");
                    if ( media <= 2) {
                        System.out.println("Reprovado!!!");
                    }
                    else if (media >= 2.1 && media <= 4.9) {
                        System.out.println("Precisa fazer a Sub!!!");
                    }
                    else {
                        System.out.println("Aprovado");
                    }
                }
            else {
                System.out.println("Os pesos ultrapassaram o limite!!!");
            }
    
            scn.close();
        }
}
