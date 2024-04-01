/*2. Faça um programa para executar as operações abaixo em uma árvore binária.
Menu
1 - Inserir número
2 - Mostrar todos
Ex. Dado que tenha a árvore:

Faça a seguinte representação:

6(2(1 4(3)) 8)

3 - Mostrar a subárvore da direita
4 - Mostrar a subárvore da esquerda
5 - Mostrar o nó pai e os nós filhos de um nó
6 - Sair */

import java.util.Scanner;

class No {
    int valor;
    No esquerda, direita;

    public No(int item) {
        valor = item;
        esquerda = direita = null;
    }
}