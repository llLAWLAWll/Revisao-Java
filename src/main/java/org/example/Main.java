package org.example;

import org.example.controle.CirculoControle;
import org.example.controle.JogoControle;
import org.example.modelo.Circulo;
import org.example.modelo.Jogo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Classe responsável por exibir os menus e navegar entre as opções.
 */
public class Main {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        JogoControle jogoControle = new JogoControle();
        List<Jogo> listaJogos = new ArrayList<>();
        Jogo jogo = null;
        Integer classificacaoEtaria;
        double percentual;

        while (option != 6) {
            System.out.println("\nMenu Exercício 2 - Jogo:");
            System.out.println("1. Inserir jogo");
            System.out.println("2. Aplicar desconto no jogo");
            System.out.println("3. Aumentar preço do jogo");
            System.out.println("4. Atualizar classificação etária do jogo");
            System.out.println("5. Mostrar detalhes dos jogos");
            System.out.println("6. Voltar ao menu principal");
            System.out.print("Escolha uma opção: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:

                    jogo = new Jogo();

                    System.out.println("Insira o nome do jogo:");
                    String nome = scanner.next();
                    jogo.setTitulo(nome);

                    System.out.println("Insira a classificação Etária do jogo (Número Inteiro):");
                    classificacaoEtaria = scanner.nextInt();
                    jogo.setClassificacaoEtaria(classificacaoEtaria);

                    System.out.println("Insira o preço do jogo (Valor com '.'):");
                    double preco = scanner.nextDouble();
                    jogo.setPreco(preco);

                    listaJogos.add(jogo);
                    break;

                case 2:
                    System.out.println("Insira o percentual de desconto do jogo (%):");
                    percentual  = scanner.nextDouble();

                    jogoControle.aplicarDesconto(jogo, percentual);
                    System.out.println("Jogo atualizado com sucesso:\n " + jogo);
                    break;
                case 3:
                    System.out.println("Insira o percentual de Aumento do jogo (%):");
                     percentual = scanner.nextDouble();

                    jogoControle.aumentarPreco(jogo, percentual);
                    System.out.println("Jogo atualizado com sucesso!");
                    break;
                case 4:
                    System.out.println("Insira a nova classificação etária do jogo:");
                    classificacaoEtaria = scanner.nextInt();

                    jogoControle.atualizarClassificacao(jogo, classificacaoEtaria);
                    System.out.println("Jogo atualizado com sucesso!");
                    break;
                case 5:

                    if (listaJogos.size() > 0) {System.out.println("Mostrando detalhes dos jogos...");}
                    else {
                        System.out.println(" Nenhum Jogo Encontrado");
                    }

                    listaJogos.forEach(System.out::println);

                    break;
                case 6:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }
}
