/*
Você recebe um código com a inicialização de count. (Não apague esta linha!)

Sua tarefa é adicionar as seguintes operações, nesta ordem:

Use o operador de incremento (++) quatro vezes para adicionar 4 ao count
Use o operador de multiplicação (*) para multiplicar count por 2
Use o operador de decremento (--) uma vez para subtrair 1 do count
*/

public class Main {
    public static void main(String[] args) {
        int count = 0;
       
        count++;
        count++;
        count++;
        count++;

        count = count * 2;

        count--;
       
        System.out.println("count = " + count);
    }
}