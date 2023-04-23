
package com.mycompany.exerciciosedd;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Exercicio4 {
    public static Queue<Integer> Exercicio4(Queue<Integer> fila) {
        Queue<Integer> novaFila = new LinkedList<>();
        Stack<Integer> pilha = new Stack<>();

        while (!fila.isEmpty()) {
            pilha.push(fila.poll());
        }

        while (!pilha.isEmpty()) {
            novaFila.offer(pilha.pop());
        }

        return novaFila;
    }
}
