package devs_pizza;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int opcao;
		do {

		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("                    DEV PIZZA                        ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("            1 - Adicionar Pedido                     ");
		System.out.println("            2 - Forma de Pagamento                   ");
		System.out.println("            3 - Faturamento                          ");
		System.out.println("            4 - Sobre                                ");
		System.out.println("            9 - Sair                                 ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("Entre com a opção desejada:                          ");

		opcao = leia.nextInt();
		
		switch (opcao) {
		case 1:
			System.out.println("Selecione o sabor da Pizza que deseja");
			break;

		case 2:
			System.out.println("Forma de Pagamento");
			break;

		case 3:
			System.out.println("Faturamento");
			break;

		case 4:
//				System.out.println();
			
		case 9:
			System.out.println("\nAgradecemos a sua preferência! !!");
			System.exit(0);
			break;
			
		default:		
			System.out.println("\nOpção Inválida!\n");
			System.exit(0);
			break;
		}
		
		}while(opcao !=9);
		
		leia.close();
	}

}
