
package com.mycompany.exerciciosedd;
import java.util.Scanner;
import java.util.Stack;

public class Exercicio1 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite uma sequência de caracteres: ");
        String input = entrada.nextLine();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            stack.push(c);
        }

        System.out.print("Ordem inversa: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println();

        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        reversed = reversed.replaceAll("\\s+|\\.", "");

        String inputNoSpaceOrDot = input.replaceAll("\\s+|\\.", "");

        if (reversed.equalsIgnoreCase(inputNoSpaceOrDot)) {
            System.out.println("A sequência de caracteres é um palíndromo.");
        } else {
            System.out.println("A sequência de caracteres não é um palíndromo.");
        }
    }
}

