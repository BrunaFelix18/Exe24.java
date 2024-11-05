//Exe24
import java.util.Scanner;
public class Exe24 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double valor_carro;
		double custo_final;
		
		System.out.print("informe o custo de fabrica do carro: ");
		valor_carro = scanner.nextDouble();
		
		custo_final = (valor_carro * 0.28) + (valor_carro * 0.45);
		
		System.out.print("O custo final ao consumidor sera de:"+ custo_final);
	}

}
