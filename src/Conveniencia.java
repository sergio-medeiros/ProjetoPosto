import java.util.Scanner;

public class Conveniencia {
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		BombaCombustivel gas = new BombaCombustivel();
		double pedido;
		int tipo;
		
		gas.Bomba("Gasolina",4,50);
		gas.Bomba("Alcool",2,70);
		
		System.out.println("Que vai ser patrao/madame: ");
		pedido = teclado.nextDouble();

			System.out.println(gas.Menu());
			tipo = teclado.nextInt();
	}
}
