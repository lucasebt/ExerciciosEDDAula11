
package com.mycompany.exerciciosedd;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class ControlePistaExercicio3 {
    public static void main(String[] args) {
        Queue<AviaoExercicio3> fila = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 6) {
            System.out.println("Escolha uma opção: ");
            System.out.println("1 - Listar número de aviões aguardando na fila ");
            System.out.println("2 - Autorizar decolagem do primeiro avião da fila ");
            System.out.println("3 - Adicionar avião à fila de espera ");
            System.out.println("4 - Listar todos os aviões na fila de espera ");
            System.out.println("5 - Listar características do primeiro avião da fila ");
            System.out.println("6 - Encerrar programa ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Número de aviões aguardando na fila: " + fila.size());
                    break;
                case 2:
                    if (!fila.isEmpty()) {
                        AviaoExercicio3 primeiroAviao = fila.poll();
                        System.out.println("Decolagem autorizada para o avião " + primeiroAviao.getNome() + " (número " + primeiroAviao.getNumero() + ")");
                    } else {
                        System.out.println("Não há aviões aguardando na fila de decolagem!");
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome do avião: ");
                    String nome = scanner.next();
                    System.out.print("Digite o número do avião: ");
                    int numero = scanner.nextInt();
                    fila.offer(new AviaoExercicio3(nome, numero));
                    System.out.println("Avião adicionado à fila de espera!");
                    break;
                case 4:
                    System.out.println("Aviões na fila de espera:");
                    for (AviaoExercicio3 aviao : fila) {
                        System.out.println(aviao.getNome() + " (número " + aviao.getNumero() + ")");
                    }
                    break;
                case 5:
                    if (!fila.isEmpty()) {
                        AviaoExercicio3 primeiroAviao = fila.peek();
                        System.out.println("Características do primeiro avião na fila:");
                        System.out.println("Nome: " + primeiroAviao.getNome());
                        System.out.println("Número: " + primeiroAviao.getNumero());
                    } else {
                        System.out.println("Não há aviões aguardando na fila de decolagem!");
                    }
                    break;
                case 6:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
        
    
