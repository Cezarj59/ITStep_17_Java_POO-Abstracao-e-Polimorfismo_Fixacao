package classroom_17.Aluno;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AlunoMusculacao extends Aluno{


    public static Aluno cadastra(){
        Aluno a = new AlunoMusculacao();
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
        DecimalFormat df2Casas = new DecimalFormat("##,###.00");

        System.out.println("--Aluno Musculação/Crossfit--");
        super.imprime();
        System.out.println("IMC: " + df2Casas.format(super.getIMC()));
    }
}
