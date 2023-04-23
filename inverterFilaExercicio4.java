
package com.mycompany.exerciciosedd;

import java.util.LinkedList;
import java.util.Queue;

public class inverterFilaExercicio4 {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();

        for (int i = 1; i <= 100; i++) {
            fila.offer((int) (Math.random() * 100));
        }

        System.out.println("Fila original: " + fila);

        Queue<Integer> novaFila = inverterFilaExercicio4(fila);

        System.out.println("Fila invertida: " + novaFila);
    }
}
