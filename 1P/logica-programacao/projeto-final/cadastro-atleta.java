import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int quantidade = 0;
		int quantidadeMAX = 100000;

		String nome = "";
		String nomes[] = new String[quantidadeMAX];

		int idade = 0;
		int idades[] = new int[quantidadeMAX];

		double salario = 0;
		double salarios[] = new double[quantidadeMAX];

		double pontos = 0;

		double mediaPontos = 0;
		double mediasPontos[] = new double[quantidadeMAX];

		int MAXPartidas = 100;
		double pontosPartidas [][] = new double [quantidadeMAX][MAXPartidas];
		int quantidadePartidas [] = new int [quantidadeMAX];

		int op = 0;
		double contador = 0;

		while (op != 5) {
			System.out.println();
			System.out.println("\t_______ | Menu | _______ ");
			System.out.println();
			System.out.println("\t1 - Novo cadastro");
			System.out.println("\t2 - Relatorio");
			System.out.println("\t3 - Atualizar dados");
			System.out.println("\t4 - Deletar registro");
			System.out.println("\t5 - Sair do sistema");
			System.out.println("\t________________________");
			System.out.println();
			System.out.print("\tDigite o número da operação desejada: ");
			op = s.nextInt();
			s.nextLine();
			if (op==1) {
				System.out.println();
				System.out.println("\t_______ | Cadastro do " + (quantidade+1) + "º Atleta | _______");
				System.out.println();
				System.out.print("\tInforme o nome ou apelido: ");
				nome = s.nextLine();
				System.out.print("\tInforme a idade: ");
				idade = s.nextInt();
				while (idade < 14 || idade > 45) {
					System.out.print("\tInválida! É necessário ter entre 14 e 45 anos. Digite uma idade: ");
					idade = s.nextInt();
				}
				System.out.print("\tInforme o salário desejado: R$ ");
				salario = s.nextDouble();
				while (salario<0) {
					System.out.print("\tInválido! Informe salário desejado: R$ ");
					salario = s.nextDouble();
				}
				System.out.print("\tDe quantas partidas o atleta participou? ");
				int x = s.nextInt();
				System.out.println();
				quantidadePartidas[quantidade] = x;
				contador = 0;
				pontos = 0;
				mediaPontos = 0;
				for (int i = 0; i < x ; i++ ) {
					System.out.print("\tNa " + (i+1) + "ª partida, informe o número de pontos marcados: ");
					pontos = s.nextDouble();
					pontosPartidas[quantidade][i] = pontos;
					contador = contador + pontos;
					mediaPontos = contador/x;
				}
				System.out.printf("\tMédia de pontos de: %.2f ", mediaPontos);
				System.out.println();
				System.out.println("\tCadastro realizado com sucesso!");

				nomes[quantidade] = nome;
				idades[quantidade] = idade;
				salarios[quantidade] = salario;
				mediasPontos[quantidade] = mediaPontos;
				quantidade ++;

			}

			if (op==2) {
				System.out.println();
				System.out.println("\t_______ Relatório dos Atletas _______");
				System.out.println();
				for (int o = 0; o < quantidade; o++) {
					if (!nomes[o].equals("")) {
						System.out.println("\t" + (o + 1) + "º Atleta Cadastrado");
						System.out.println("\t\tNome: " + nomes[o]);
						System.out.println("\t\tIdade: " + idades[o]);
						System.out.println("\t\tSalário pretendido: R$" + salarios[o]);
						System.out.printf("\t\tMédia de pontos por partida: %.2f\n ", mediasPontos[o]);
						System.out.print("\t\tHistórico de pontos: ");
						for (int c = 0; c < quantidadePartidas[o]; c++) {
							System.out.print(pontosPartidas[o][c] + " | ");
						}
						System.out.println("\n");
					}
				}
			}

			if (op==3) {
				System.out.println();
				System.out.println("\t_______ Atletas Cadastrados _______");
				System.out.println();
				for (int i = 0; i < quantidade; i++) {
					if (!nomes[i].equals("")) {
						System.out.println("\t\t" + (i+1) + " - " + nomes[i]);
					}
				}
				System.out.println();
				System.out.print("\tDigite o número relacionado ao atleta: ");
				int numero = s.nextInt();
				numero --;

				int opAlterar = 0;
				while (opAlterar != 5) {
					System.out.println();
					System.out.println("\t_______ Atualização de Cadastro _______");
					System.out.println();
					System.out.println("\t1 - modificar o nome;");
					System.out.println("\t2 - modificar a idade;");
					System.out.println("\t3 - modificar o salário pretendido;");
					System.out.println("\t4 - modificar pontos marcados;");
					System.out.println("\t5 - voltar.");
					System.out.println();
					System.out.print("\tDigite o número referente da operação que deseja alterar: ");
					opAlterar = s.nextInt();
					s.nextLine();

					if (opAlterar == 1) {
						System.out.print("\tAtualize o nome: ");
						nome = s.nextLine();
						nomes[numero] = nome;
						System.out.println("\tAtualizado!");
					}
					if (opAlterar == 2) {
						System.out.print("\tAtualize a idade: ");
						idade = s.nextInt();
						while (idade < 14 || idade > 45) {
							System.out.print("\tInválida! É necessário ter entre 14 e 45 anos. Informe uma idade: \n");
							idade = s.nextInt();
						}
						idades[numero] = idade;
						System.out.println("\tAtualizado!");
					}
					if (opAlterar == 3) {
						System.out.print("\tAtualize o salário pretendido: R$ ");
						salario = s.nextDouble();
						salarios[numero] = salario;
						System.out.println("\tAtualizado!");
					}
					if (opAlterar == 4) {
						System.out.print("\tAtualize o número de partidas: ");
						int x = s.nextInt();
						quantidadePartidas[numero] = x;
						contador = 0.0;
						for (int i = 0; i < x; i++) {
							System.out.print("\tNa " + (i+1) + "ª partida, informe o número de pontos marcados: ");
							pontos = s.nextDouble();
							pontosPartidas[numero][i] = pontos;
							contador += pontos;
						}
						mediaPontos = contador/x;
						System.out.printf("\tMédia de pontos por partida: %.2f", mediaPontos);
						System.out.println();
						mediasPontos[numero] = mediaPontos;
						System.out.println("\tAtualizado!");
					}
					if (opAlterar == 5) {
						System.out.println("\tVoltando ao menu inicial.");
					}
				}
			}
			if (op==4) {
				System.out.println();
				System.out.println("\t_______ Deletar Registro _______");
				System.out.println();
				System.out.println("\tAtletas Cadastrados");
				for (int i = 0; i < quantidade; i++) {
					if (!nomes[i].equals("")) {
						System.out.println("\t\t" + (i+1) + " - " + nomes[i]);
					}
				}
				System.out.println();
				System.out.print("\tDigite o número relacionado ao atleta: \n");
				int numero = s.nextInt();
				numero --;
				System.out.println("\tDados do " + (numero+1) + "º atleta:");
				System.out.println("\tNome: " + nomes[numero]);
				System.out.println("\tIdade: " + idades[numero]);
				System.out.println("\tSalário pretendido: R$" + salarios[numero]);
				System.out.println("\tMédia de pontos por partida: " + mediasPontos[numero]);
				System.out.println();
				System.out.println("\tDeseja excluir os dados?");
				System.out.print("\tDigite 1 para SIM ou 2 para NÃO: \n");
				int opExcluir = s.nextInt();
				if (opExcluir == 1) {
					nomes[numero] = "";
					idades[numero] = 0;
					salarios[numero] = 0;
					mediasPontos[numero] = 0;

					System.out.println();
					System.out.println("\tDados excluidos!");
				}
				if (opExcluir == 2) {
					System.out.println();
					System.out.println("\tDados mantidos!");
				}
			}
		}
	}
}
