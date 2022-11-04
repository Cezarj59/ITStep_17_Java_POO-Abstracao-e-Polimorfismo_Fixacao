package classroom_17.Aluno;


import java.util.Scanner;

public class AlunoLuta extends Aluno {


    public static Aluno cadastra(){
        Aluno a = new AlunoLuta();
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
        System.out.println("--Aluno LUTA--");
        super.imprime();

        if(super.getPeso()<65)
            System.out.println("Categoria: Peso Galo");

         else if(super.getPeso() < 75)
            System.out.println("Categoria: Peso Leve");

         else if(super.getPeso() < 85)
            System.out.println("Categoria: Peso Médio");

        else
            System.out.println("Categoria: Peso Pesado");
    }
}
