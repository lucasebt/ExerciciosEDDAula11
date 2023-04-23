
package com.mycompany.exerciciosedd;
import java.util.Stack;
import java.util.Scanner;

public class Exercicio2 {
    public static void retirarItem(Stack<Integer> pilha, int chave) {
      Stack<Integer> aux = new Stack<>();
      boolean encontrado = false;

      
      while (!pilha.isEmpty()) {
         int item = pilha.pop();
         if (item == chave) {
            encontrado = true;
            break;
         } else {
            aux.push(item);
         }
      }

     
      while (!aux.isEmpty()) {
         pilha.push(aux.pop());
      }

      if (!encontrado) {
         System.out.println("Chave não encontrada! ");
      } else {
         System.out.println("Item removido com sucesso! ");
      }
   }

   public static void main(String[] args) {
      Stack<Integer> pilha = new Stack<>();
      Scanner scanner = new Scanner(System.in);

     
      pilha.push(3);
      pilha.push(7);
      pilha.push(1);
      pilha.push(5);

      System.out.print("Digite a chave do item a ser removido: ");
      int chave = scanner.nextInt();

      retirarItem(pilha, chave);

     
      System.out.println("Pilha atualizada: " + pilha);
   }
}

