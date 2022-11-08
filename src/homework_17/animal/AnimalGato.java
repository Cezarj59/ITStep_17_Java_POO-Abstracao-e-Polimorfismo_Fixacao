package homework_17.animal;

import java.util.Scanner;

public class AnimalGato extends Animal {

    public static Animal cadastra() {
        Animal a = new AnimalGato();
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
        System.out.println("--Animal Gato--");
        super.imprime();

        System.out.println("Acompanha caixa de transporte;");

    }

}
