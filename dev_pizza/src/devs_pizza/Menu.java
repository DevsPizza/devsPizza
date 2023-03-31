package devs_pizza;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

import devs_pizza.util.Cores;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		NumberFormat nfMoeda = NumberFormat.getCurrencyInstance();

		int opcao;

		int pedido, quantidade, borda = 0, saborBorda = 0, formaDePagamento, pagamento = 0;
		float preco = 0;
		char adicionarPedido = 'S';
		boolean maisPedido = true;

		do {

			System.out.println("	_____                 _____  _	");
			System.out.println("	|  __ \\               |  __ (_)	");
			System.out.println("	| |  | | _____   _____| |__) | __________ _	");
			System.out.println("	| |  | |/ _ \\ \\ / / __|  ___/ |_  /_  / _` |	");
			System.out.println("	| |__| |  __/\\ V /\\__ \\ |   | |/ / / / (_| |	");
			System.out.println("	|_____/ \\___| \\_/ |___/_|   |_/___/___\\__,_|	");
			System.out.println("		");
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
				System.out.println("***************************************************************");
				System.out
						.println("*                                                             *");
				System.out
						.println("*                   Devs Bebidas                              *");
				System.out
						.println("*                                                             *");
				System.out.println("***************************************************************");
				System.out
						.println("*                                                             *");
				System.out
						.println("*                  Refrigerantes                              *");
				System.out.println("***************************************************************");
				System.out
						.println("*                                                             *");
				System.out.println("*           1 - Coca Cola          350 ML      R$ 8,00        *");
				System.out.println("*           2 - Coca Cola          2L          R$ 14,00       *");
				System.out.println("*           3 - Coca Cola Zero     1,5L        R$ 16,00       *");
				System.out.println("*           4 - Pepsi              2L          R$ 10,00       *");
				System.out.println("*           5 - Sprite             2L          R$ 11,00       *");
				System.out.println("*           6 - Guaraná Antartica  2L          R$ 12,00       *");
				System.out.println("*           7 - Fanta Laranja      2L          R$ 12,00       *");
				System.out
						.println("*           8 - Fanta Uva          2L          R$ 12,00       *");
				System.out.println("***************************************************************");
				System.out
						.println("*                                                             *");
				System.out.println("*                      Água                                   *");
				System.out.println("***************************************************************");
				System.out
						.println("*           9 - Água com gás 1L - R$ 12,00                    *");
				System.out.println("*          10 - Água sem gás 1L - R$ 08,00                    *");
				System.out
						.println("*                                                             *");
				System.out.println("***************************************************************");

				System.out.print("\nEntre com a bebida desejada:  ");
				opcao = leia.nextInt();
				System.out.println("\nDigite a quantidade: ");
				quantidade = leia.nextInt();

				if (opcao == 11) {
					leia.close();
					System.exit(0);
				}

				switch (opcao) {

				case 1 -> {
					System.out.println("\nCoca Cola 350 ML - R$ 8,00.");
					System.out.println("Seu pedido foi adicionado com sucesso!");
					preco += quantidade * 8.00f;

				}
				case 2 -> {
					System.out.println("\nCoca Cola 2L - R$ 14,00.");
					System.out.println("Seu pedido foi adicionado com sucesso!");
					preco += quantidade * 14.00f;

				}
				case 3 -> {
					System.out.println("\nVocê escolheu Coca Cola Zero 1,5L - R$ 16,00.");
					System.out.println("Seu pedido foi adicionado com sucesso!");
					preco += quantidade * 16.00f;

				}
				case 4 -> {
					System.out.println("\nVocê escolheu Pepsi 2L - R$ 10,00.");
					System.out.println("Seu pedido foi adicionado com sucesso!");
					preco += quantidade * 10.00f;

				}
				case 5 -> {
					System.out.println("\nVocê escolheu Sprite 2L - R$ 11,00.");
					System.out.println("Seu pedido foi adicionado com sucesso!");
					preco += quantidade * 11.00f;

				}
				case 6 -> {
					System.out.println("\nVocê escolheu  Guaraná Antartica 1,5L - R$ 12,00.");
					System.out.println("Seu pedido foi adicionado com sucesso!");
					preco += quantidade * 12.00f;

				}
				case 7 -> {
					System.out.println("\nVocê escolheu Fanta Laranja 2L - R$ 12,00.");
					System.out.println("Seu pedido foi adicionado com sucesso!");
					preco += quantidade * 12.00f;

				}
				case 8 -> {
					System.out.println("\nVocê escolheu Fanta Uva  2L - R$ 12,00  .");
					System.out.println("Seu pedido foi adicionado com sucesso!");
					preco += quantidade * 12.00f;

				}
				case 9 -> {
					System.out.println("\nVocê escolheu  Água com gás 500L - R$ 12,00.");
					System.out.println("Seu pedido foi adicionado com sucesso!");
					preco += quantidade * 12.00f;

				}
				case 10 -> {
					System.out.println("\nVocê escolheu Água sem gás 500L - R$ 08,00 .");
					System.out.println("Seu pedido foi adicionado com sucesso!");
					preco += quantidade * 8.00f;

					System.out.println("\nDeseja adicionar outro pedido?(S/N): ");
					adicionarPedido = leia.next().toUpperCase().charAt(0);
					if (adicionarPedido == 'S') {
						maisPedido = true;
					} else {
						maisPedido = false;
					}
				}
				default -> {
					System.out.println("\nOpção inválida!");
					System.out.println("Por favor, digite um número inteiro.");
				}
				}
				System.out.println("\nSeu pedido ficou no total de R$: " + nfMoeda.format(preco));
				System.out.println("\n•••••••••• Obrigada Pelo Pedido! ••••••••••");
				// System.exit(0);
				System.out.println("\nSeu pedido ficou no total de R$: " + nfMoeda.format(preco));
				System.out.println("\n•••••••••• Obrigada Pelo Pedido! ••••••••••");

				break;

			case 2:

				System.out.println("\n••••••••••••••••• Forma de pagamento •••••••••••••••••\n");
				System.out.println("1 - Cartão de Crédito");
				System.out.println("2 - Cartão de Débito");
				System.out.println("3 - Pix");
				System.out.println("4 - Vale Refeição");
				System.out.println("5 - Dinheiro");
				System.out.println("0 - Sair");

				formaDePagamento = leia.nextInt();

				switch (formaDePagamento) {
				case 1 -> {
					System.out.println(nfMoeda.format(preco) + " pago no Cartão de Crédito, pressione 0 para sair");
					pagamento = leia.nextInt();

				}
				case 2 -> {
					System.out.println(nfMoeda.format(preco) + " pago no Cartão de Débito, pressione 0 para sair");
					pagamento = leia.nextInt();

				}
				case 3 -> {
					System.out.println(nfMoeda.format(preco) + " pago no Pix, pressione 0 para sair");
					pagamento = leia.nextInt();

				}
				case 4 -> {
					System.out.println(nfMoeda.format(preco) + " pago no Vale Refeição, pressione 0 para sair");
					pagamento = leia.nextInt();

				}
				case 5 -> {
					System.out.println(nfMoeda.format(preco) + " pago em Dinheiro, pressione 0 para sair");
					pagamento = leia.nextInt();

				}
				default -> System.out.println("Opção inválida!");
				}

				break;

			case 3:
				System.out.println("Faturamento");
				break;

			case 4:
				sobre();

			case 9:
				System.out.println("\nAgradecemos a sua preferência! ");
				System.out.println("*****************************************************");
				System.out.println("	⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣤⣶⣶⣦⣄⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀	");
				System.out.println("	⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢰⣿⣿⣿⣿⣿⣿⣿⣷⣦⡀⠀⠀⠀⠀⠀⠀	");
				System.out.println("	⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣷⣤⠀⠈⠙⢿⣿⣿⣿⣿⣿⣦⡀⠀⠀⠀⠀	");
				System.out.println("	⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣿⣿⣿⠆⠰⠶⠀⠘⢿⣿⣿⣿⣿⣿⣆⠀⠀⠀	");
				System.out.println("	⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣼⣿⣿⣿⠏⠀⢀⣠⣤⣤⣀⠙⣿⣿⣿⣿⣿⣷⡀⠀	");
				System.out.println("	⠀⠀⠀⠀⠀⠀⠀⠀⢠⠋⢈⣉⠉⣡⣤⢰⣿⣿⣿⣿⣿⣷⡈⢿⣿⣿⣿⣿⣷⡀	");
				System.out.println("	⠀⠀⠀⠀⠀⠀⠀⡴⢡⣾⣿⣿⣷⠋⠁⣿⣿⣿⣿⣿⣿⣿⠃⠀⡻⣿⣿⣿⣿⡇	");
				System.out.println("	⠀⠀⠀⠀⠀⢀⠜⠁⠸⣿⣿⣿⠟⠀⠀⠘⠿⣿⣿⣿⡿⠋⠰⠖⠱⣽⠟⠋⠉⡇	");
				System.out.println("	⠀⠀⠀⠀⡰⠉⠖⣀⠀⠀⢁⣀⠀⣴⣶⣦⠀⢴⡆⠀⠀⢀⣀⣀⣉⡽⠷⠶⠋⠀	");
				System.out.println("	⠀⠀⠀⡰⢡⣾⣿⣿⣿⡄⠛⠋⠘⣿⣿⡿⠀⠀⣐⣲⣤⣯⠞⠉⠁⠀⠀⠀⠀⠀	");
				System.out.println("	⠀⢀⠔⠁⣿⣿⣿⣿⣿⡟⠀⠀⠀⢀⣄⣀⡞⠉⠉⠉⠉⠁⠀⠀⠀⠀⠀⠀⠀⠀	");
				System.out.println("	⠀⡜⠀⠀⠻⣿⣿⠿⣻⣥⣀⡀⢠⡟⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀	");
				System.out.println("	⢰⠁⠀⡤⠖⠺⢶⡾⠃⠀⠈⠙⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀	");
				System.out.println("	⠈⠓⠾⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀	");
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

	public static void sobre() {

		System.out.println("*********************************************************");
		System.out.println("                                                         ");
		System.out.println("Daisy Kelly Viana - daisyviana96@gmail.com               ");
		System.out.println("github.com/Daisyviana                                    ");
		System.out.println("linkedin.com/in/daisy-viana-6a299716b                    ");
		System.out.println("                                                         ");
		System.out.println("Bianca Luna - Kadu_300@live.com                          ");
		System.out.println("Github.com/r4inha                                        ");
		System.out.println("linkedin.com/in/bianca-luna-88aaa7116                    ");
		System.out.println("                                                         ");
		System.out.println("Michelle Greghi - michelle.neves23@gmail.com             ");
		System.out.println("github.com/MichelleGreghi                               ");
		System.out.println("linkedin.com/in/michellegreghi/                          ");
		System.out.println("                                                         ");
		System.out.println("Gabriel Lopes Barbosa - lopesgabriel810@gmail.com        ");
		System.out.println("github.com/Gabriellopesg9                                ");
		System.out.println("linkedin.com/in/gabriel-lopes-98591924b/                 ");
		System.out.println("                                                         ");
		System.out.println("Carolina Correa da Silva - carolina.unila@gmail.com      ");
		System.out.println("github.com/krolcorrea                                    ");
		System.out.println("linkedin.com/in/carolina-correa-da-silva-120b2b268/      ");
		System.out.println("                                                         ");
		System.out.println("Deiziane Rodrigues - Deizianesantos.rodrigues15@gmail.com");
		System.out.println("github.com/deizirrs/Java                                 ");
		System.out.println("linkedin.com/in/deiziane-r-b687aa140                     ");
		System.out.println("                                                         ");
		System.out.println("*********************************************************");

	}
}
