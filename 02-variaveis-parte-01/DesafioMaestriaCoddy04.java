/*
Você está criando uma interface de jogo baseada em texto. Crie múltiplas variáveis char para representar diferentes símbolos do jogo:

Crie estas variáveis char com os valores especificados:
player com valor '+'
enemy com valor '*'
coin com valor '$'
heart com valor '3'
arrow com valor '>'
wall com valor '#'
Preste atenção a:
Usando aspas simples (não aspas duplas)
Símbolos exatos conforme especificado
Sintaxe correta de declaração char
O programa exibirá estes símbolos do jogo em uma exibição de status.
*/


public class Main {
	public static void main(String[] args){
		char player = '+';
		char enemy = '*';
		char coib = '$';
		char heart = '3';
		char arrow = '>';
		char wall = '#';


		System.out.println("Game Symbols:");
		System.out.println("-------------");
		System.out.println("Player: " +player);
		System.out.println("Enemy: " +enemy);
		System.out.println("Coin: " +coin);
		System.out.println("Life: " +heart);
		System.out.println("Direction: " +arrow);
		System.out.println("Wall: " +wall);
	}
}