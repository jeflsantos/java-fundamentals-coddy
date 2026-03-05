/*
Você está desenvolvendo um sistema de pontuação para um jogo. O programa contém múltiplas sequências de operações usando pré e pós-incremento/decremento. Sua tarefa é acompanhar a execução do código e verificar seu entendimento.

Comece com estes valores iniciais:
points = 5
bonus = 10
lives = 3
Estude estas sequências e preveja os resultados:

result1 = points++; // Pós-incremento
result2 = ++bonus;  // Pré-incremento  
result3 = --lives;  // Pré-decremento
result4 = lives--;  // Pós-decremento
Complete o código de verificação para verificar se suas previsões estão corretas.
*/

public class Main {
    public static void main(String[] args) {
        // Initial values
        int points = 5;
        int bonus = 10;
        int lives = 3;
        
        // Execute the operations
        int result1 = points++;
        int result2 = ++bonus;
        int result3 = --lives;
        int result4 = lives--;
        
        // Correct predictions
        boolean check1 = (result1 == 5); // Post-increment returns original value
        boolean check2 = (result2 == 11); // Pre-increment returns new value
        boolean check3 = (result3 == 2); // Pre-decrement returns new value
        boolean check4 = (result4 == 2); // Post-decrement returns original value
        
        boolean check5 = (points == 6); // points was incremented
        boolean check6 = (bonus == 11);  // bonus was incremented
        boolean check7 = (lives == 1);  // lives was decremented twice
        
        // Verification output
        if (check1 && check2 && check3 && check4 && check5 && check6 && check7) {
            System.out.println("All predictions correct!");
        } else {
            System.out.println("Some predictions are incorrect. Review pre/post increment rules.");
        }
    }
}