import java.util.Scanner;

import Guerra.Aliado;
import Guerra.Casa;

public class Principal {

	public static void main(String[] args) {
		int opcMenu, qtdeSoldados;
		String nomeCasa, nomeResp;
		Scanner scanner = new Scanner(System.in);
		Aliado aliado = new Aliado();
		do {
			System.out.print(
					"=========MENU=========\n1 - Cadastrar nova Casa\n2 - Mostrar Casas aliadas\n3 - Mostrar total de soldados aliados\nDigite a opção: ");
			opcMenu = scanner.nextInt();
			switch (opcMenu) {
			case 1:
				System.out.print("==========CADASTRAR NOVA CASA=========\n");
				System.out.print("Informe o nome da Casa: ");
				nomeCasa = scanner.next();
				System.out.print("Informe o nome da responsável: ");
				nomeResp = scanner.next();
				System.out.print("Informe a quantidade de soldados: ");
				qtdeSoldados = scanner.nextInt();
				Casa casa = new Casa(nomeCasa, nomeResp, qtdeSoldados);
				casa.calcularMoeda();
				System.out.print("Número prometido de moedas de ouro: " + casa.getMoedas() + "\n");
				aliado.cadastrarCasa(casa);
				break;
			case 2:
				System.out.print("==========MOSTRAR CASAS ALIADAS=========\n");
				for (Casa c : aliado.getCasa()) {
					System.out.print("Nome da casa: " + c.getNomeCasa() + "\n");
					System.out.print("Nome do responsável: " + c.getNomeResp() + "\n");
					System.out.print("Quantidade de soldados: " + c.getQtdeSoldados() + "\n");
					//System.out.print("Quantidade de soldados: " + c.getMoedas() + "\n");
					System.out.print("=============================================\n");
				}
				break;
			case 3:
				System.out.print("==========MOSTRAR TOTAL DE SOLDADOS ALIADOS===========\n");
				aliado.somaSoldados();
				System.out.print("O número atual de soldados aliados é: " + aliado.getTotalSoldados() + "\n");
				
				break;
			}
		} while (opcMenu != 0);
		scanner.close();
	}

}
