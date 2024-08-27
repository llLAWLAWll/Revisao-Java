package org.example;

import org.example.controle.CirculoControle;
import org.example.modelo.Circulo;
import org.example.modelo.Jogo;

import java.util.Scanner;

/**
 * Classe responsável por exibir os menus e navegar entre as opções.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Jogo jogo = new Jogo();
        int opcaoMenu = 0;

        while (opcaoMenu != 3) {
            System.out.println("\nMenu Principal:");
            System.out.println("1. Exercício 1 - Círculo");
            System.out.println("2. Exercício 2 - Jogo");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcaoMenu = sc.nextInt();

            switch (opcaoMenu) {
                case 1:
                    menuExercicio1(sc);
                    break;
                case 2:
                    menuExercicio2(sc);
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }

    /**
     * Exibe o menu para o Exercício 1 - Círculo.
     * @param scanner Scanner para leitura das entradas do usuário.
     */
    public static void menuExercicio1(Scanner scanner) {
        int option = 0;
        Circulo circulo = new Circulo();
        CirculoControle circuloControle = new CirculoControle();
        while (option != 3) {
            System.out.println("\nMenu Exercício 1 - Círculo:");
            System.out.println("1. Calcular Area");
            System.out.println("2. Calcular Raio");
            System.out.println("3. Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Calcular Area");

                    System.out.println("Insira o raio do circulo:");
                    circulo.setRadius(scanner.nextDouble());

                    System.out.printf("\nÁrea do circulo: %.4f", circuloControle.getArea(circulo));

                    break;
                case 2:
                    System.out.println("Calcular Raio");

                    System.out.println("Insira a área do circulo:");
                    circulo.setArea(scanner.nextDouble());

                    System.out.printf("\nRaio do circulo: %.4f", circuloControle.getRadius(circulo));
                    break;
                case 3:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }

    /**
     * Exibe o menu para o Exercício 2 - Jogo.
     * @param scanner Scanner para leitura das entradas do usuário.
     */
    public static void menuExercicio2(Scanner scanner) {
        int option = 0;

        while (option != 5) {
            System.out.println("\nMenu Exercício 2 - Jogo:");
            System.out.println("1. Aplicar desconto no jogo");
            System.out.println("2. Aumentar preço do jogo");
            System.out.println("3. Atualizar classificação etária do jogo");
            System.out.println("4. Mostrar detalhes dos jogos");
            System.out.println("5. Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    // Código para aplicar desconto no jogo
                    System.out.println("Aplicando desconto no jogo...");
                    break;
                case 2:
                    // Código para aumentar preço do jogo
                    System.out.println("Aumentando preço do jogo...");
                    break;
                case 3:
                    // Código para atualizar classificação etária do jogo
                    System.out.println("Atualizando classificação etária do jogo...");
                    break;
                case 4:
                    // Código para mostrar detalhes dos jogos
                    System.out.println("Mostrando detalhes dos jogos...");
                    break;
                case 5:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}
