package homework_17.animal.menu;


import homework_17.animal.*;
import java.util.Scanner;

public class Menu {

    public static void run() {
        Animal[] Animal;
        int quantidade = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("Quantos Animais serão cadastrados?");
         System.out.print("Digite:");
        quantidade = leia.nextInt();
      
        Animal = new Animal[quantidade];

        for (int i = 0; i < Animal.length; i++) {
            System.out.println("\nDeseja cadastrar qual tipo de Animal?\n");
            System.out.println("(1) Cão");
            System.out.println("(2) Gato");
            System.out.println("(3) Peixe");
            System.out.print("\nDigite a opção: ");
            int opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    Animal[i] = AnimalCao.cadastra();
                    break;
                case 2:
                    Animal[i] = AnimalGato.cadastra();
                    break;
                case 3:
                    Animal[i] = AnimalPeixe.cadastra();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    i--;//cancelar a volta atual
                    break;
            }
        }

        System.out.println("\n===========Animals Cadastrados==============\n");

        for (Animal a : Animal) {
            a.imprime();
            System.out.println("\n-----------------------\n");
        }
    }
}
