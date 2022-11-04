package classroom_17.Menu;

import classroom_17.Aluno.Aluno;
import classroom_17.Aluno.AlunoLuta;
import classroom_17.Aluno.AlunoMusculacao;
import classroom_17.Aluno.AlunoNatacao;

import java.util.Scanner;

public class Menu {
    public static void run(){
        Aluno[] alunos;
        int quantidade = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Quantos alunos serão cadastrados?");
        quantidade = leia.nextInt();

        alunos = new Aluno[quantidade];

        for(int i = 0; i < alunos.length; i++){
            System.out.println("Deseja cadastrar aluno de: ");
            System.out.println("(1) Luta");
            System.out.println("(2) Musculação/Crossfit");
            System.out.println("(3) Natação");
            int opcao = leia.nextInt();

            switch (opcao){
                case 1:
                    alunos[i] = AlunoLuta.cadastra();
                    break;
                case 2:
                    alunos[i] = AlunoMusculacao.cadastra();
                    break;
                     case 3:
                    alunos[i] = AlunoNatacao.cadastra();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    i--;//cancelar a volta atual
                    break;
            }
        }

        System.out.println("\n===========Alunos Cadastrados==============\n");

        for(Aluno a : alunos){
            a.imprime();
            System.out.println("\n-----------------------\n");
        }
    }
}
