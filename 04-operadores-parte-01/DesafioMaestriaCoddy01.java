/*
Você está construindo uma calculadora de compras simples. Siga estes passos:

Crie estas variáveis com os valores dados:
itemPrice (double): 12.99
quantity (int): 5
taxRate (double): 0.08
discount (double): 2.50
Usando operadores aritméticos, calcule e armazene:
subtotal (double): itemPrice * quantity
taxAmount (double): subtotal * taxRate
discountedAmount (double): subtotal - discount
finalTotal (double): discountedAmount + taxAmount
O programa exibirá os valores calculados.
*/

public class Main {
    public static void main(String[] args) {
        
        double itemPrice = 12.99;
        int quantity = 5;
        double taxRate = 0.08;
        double discount = 2.50;
        
        
        double subTotal = itemPrice * quantity;
        double taxAmount = subTotal * taxRate;
        double discountedAmount = subTotal - discount;
        double finalTotal = discountedAmount + taxAmount;
        

        System.out.println("Shopping Calculator Results:");
        System.out.println("-------------------------");
        System.out.println("Item Price: $" + itemPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Subtotal: $" + subTotal);
        System.out.println("Tax Amount: $" + taxAmount);
        System.out.println("Discounted Amount: $" + discountedAmount);
        System.out.println("Final Total: $" + finalTotal);
    }
}