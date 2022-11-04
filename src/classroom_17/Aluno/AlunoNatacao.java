package classroom_17.Aluno;

import java.util.Scanner;

public class AlunoNatacao extends Aluno {

    public static Aluno cadastra() {
        Aluno a = new AlunoNatacao();
        Scanner leia = new Scanner(System.in);

        System.out.print("\nInforme o nome: ");
        a.setNome(leia.nextLine());

        System.out.print("Idade: ");
        a.setIdade(leia.nextInt());

        System.out.print("Peso(KG): ");
        a.setPeso(leia.nextDouble());

        System.out.print("Altura(m): ");
        a.setAltura(leia.nextDouble());

        return a;
    }

    @Override
    public void imprime() {
        System.out.println("\n--Aluno Natação--\n");
        super.imprime();

        if (super.getIdade() < 18) {
            System.out.println("Menor de Idade - Piscina 1");
        } else {
            System.out.println("Maior de Idade - Piscina 2");
        }
    }
}
