package devs_pizza;

import java.text.NumberFormat;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		NumberFormat nfMoeda = NumberFormat.getCurrencyInstance();

		int opcao;

		int pedido, quantidade, borda = 0, saborBorda = 0;
		float preco = 0;
		char adicionarPedido = 'S';
		boolean maisPedido = true;

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
				do {

					System.out.println("\n••••••••••••••••• Cardápio •••••••••••••••••\n");
					System.out.println("1\tPizza Mussarela" + " Preço: R$ 45,00");
					System.out.println("2\tPizza Calabresa" + " Preço: R$ 45,00");
					System.out.println("3\tFrango Com Catupiry" + " Preço: R$ 51,50");
					System.out.println("4\tMilho com Queijo" + " Preço: R$ 51,50");
					System.out.println("5\tNutella" + " Preço: R$ 51,00");
					System.out.println("6\tChocolate Branco" + " Preço: R$ 45,50");

					System.out.println("\nDigite o Código Desejado: ");
					pedido = leia.nextInt();
					System.out.println("\nDigite a quantidade: ");
					quantidade = leia.nextInt();

					switch (pedido) {
					case 1:
						preco += quantidade * 45.0f;
						System.out.println("Pedido: Pizza de Mussarela - Valor R$: " + nfMoeda.format(preco));
						break;
					case 2:
						preco += quantidade * 45.0f;
						System.out.println("Pedido: Pizza de Calabresa - Valor R$: " + nfMoeda.format(preco));
						break;
					case 3:
						preco += quantidade * 51.5f;
						System.out.println("Pedido: Frango com Catupiry - Valor R$: " + nfMoeda.format(preco));
						break;
					case 4:
						preco += quantidade * 51.5f;
						System.out.println("Pedido: Milho Com Queijo - Valor R$: " + nfMoeda.format(preco));
						break;
					case 5:
						preco += quantidade * 51.0f;
						System.out.println("Pedido: Nutella - Valor R$: " + nfMoeda.format(preco));
						break;
					case 6:
						preco += quantidade * 45.5f;
						System.out.println("Pedido: Chocolate Branco - Valor R$: " + nfMoeda.format(preco));
						break;
					default:
						System.out.println("Opção Inválida!");
					}

					System.out.println("\nDeseja Adicionar Borda Recheada? (S/N): ");
					borda = leia.next().toUpperCase().charAt(0);

					if (borda == 'S') {
						System.out.println("\nSabores de Bordas");
						System.out.println("1\tBorda de Catupiry" + " Preço: R$ 12,00");
						System.out.println("2\tBorda de Cheddar" + " Preço: R$ 13,00");
						System.out.println("3\tBorda de Chocolate" + " Preço: R$ 15,50");
						System.out.println("4\tBorda de Doce de Leite" + " Preço: R$ 15,50");
						saborBorda = leia.nextInt();

						switch (saborBorda) {
						case 1:
							preco += 12.0f;
							System.out.println("\n•Você adicionou Borda de Catupiry ao seu pedido!");
							break;
						case 2:
							preco += 13.0f;
							System.out.println("\n•Você adicionou Borda de Cheddar ao seu pedido!");
							break;
						case 3:
							preco += 15.5f;
							System.out.println("\n•Você adicionou Borda de Chocolate ao seu pedido!");
							break;
						case 4:
							preco += 13.0f;
							System.out.println("\n•Você adicionou Borda de Doce de Leite ao seu pedido!");
							break;
						default:
							System.out.println("\n•Opção Inválida!");
						}
						System.out.println("\nDeseja adicionar outro pedido?(S/N): ");
						adicionarPedido = leia.next().toUpperCase().charAt(0);
						if (adicionarPedido == 'S') {
							maisPedido = true;
						} else {
							maisPedido = false;
						}

					} else {
						System.out.println("\nDeseja adicionar outro pedido?(S/N): ");
						adicionarPedido = leia.next().toUpperCase().charAt(0);
						if (adicionarPedido == 'S') {
							maisPedido = true;
						} else {
							maisPedido = false;

						}
					}

				} while (maisPedido);

				System.out.println("\nSeu pedido ficou no total de R$: " + nfMoeda.format(preco));
				System.out.println("\n•••••••••• Obrigada Pelo Pedido! ••••••••••");

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

		} while (opcao != 9);

		leia.close();
	}

}
