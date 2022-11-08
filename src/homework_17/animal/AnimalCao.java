package homework_17.animal;

import java.util.Scanner;

public class AnimalCao extends Animal {

    public static Animal cadastra() {

        Animal a = new AnimalCao();
        Scanner leia = new Scanner(System.in);

        System.out.print("\nInforme o nome: ");
        a.setNome(leia.nextLine());

        System.out.print("Raça: ");
        a.setRaca(leia.nextLine());

        System.out.print("Idade: ");
        a.setIdade(leia.nextInt());

        return a;

    }

    @Override
    public void imprime() {
        System.out.println("--Animal Cão--");
        super.imprime();

        System.out.println("Acompanha coleira e pote de ração;");

    }

}
