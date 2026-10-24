package aplicacao;

import academia.Academia;
import academia.Utilitaria;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    // o private é um Encapsulamento | restringe o acesso a esses vetores para que sejam visiveis e acessiveis apenas dentro da propria classe App

    private static final String[] USUARIOS = {"aquila", "ygor", "gustavo"}; // atributo, uma qualidade da classe App
    private static final String[] SENHAS = {"123", "123", "123"};

    public static void menu() {
        System.out.println("\n---- | Menu | ---- ");
        System.out.println("1 - Academia");
        System.out.println("2 - Personal");
        System.out.println("3 - Sair");
        System.out.print("Digite a opção: ");
    }

    private static boolean autenticarFuncionario(Scanner s) {
        int tentativas = 0;
        while (tentativas < 3) {
            System.out.print("Digite seu usuario: ");
            String login = s.nextLine();
            System.out.print("Digite sua senha: ");
            String senha = s.nextLine();

            for (int i = 0; i < USUARIOS.length; i++) {
                if (USUARIOS[i].equals(login) && SENHAS[i].equals(senha)) {
                    return true;
                }
            }

            tentativas++;
            System.out.println("Login invalido! Senha ou usuário incorreta.");
            if (tentativas >= 3) {
                System.out.println("Numero de tentativas esgotadas!");
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Aluno> listaAlunos = new ArrayList<>();
        Academia academia = new Academia();
        char opcao = '0';

        do {
            menu();
            String entrada = s.nextLine();
            if (entrada.isEmpty()) continue;
            opcao = entrada.charAt(0);

            switch (opcao) {
                case '1':
                    if (autenticarFuncionario(s)) {
                        char opSub = '0';
                        do {
                            System.out.println("\n---- | Sub Menu | ----");
                            System.out.println("1 - Cadastro");
                            System.out.println("2 - Relatório");
                            System.out.println("3 - Voltar");
                            System.out.print("Digite a opção: ");

                            String entSub = s.nextLine();
                            if (entSub.isEmpty()) continue;
                            opSub = entSub.charAt(0);

                            if (opSub == '1') {
                                String nome = "";
                                boolean nomeValido = false;

                                while (!nomeValido) {
                                    System.out.print("Nome do aluno: ");
                                    nome = s.nextLine();
                                    boolean existe = false;

                                    for (Aluno a : listaAlunos) {
                                        if (a.getNome().equalsIgnoreCase(nome)) {
                                            existe = true;
                                            break;
                                        }
                                    }

                                    if (existe) {
                                        System.out.println("Nome já cadastrado! Tente outro.");
                                    } else {
                                        nomeValido = true;
                                    }
                                }

                                System.out.print("Telefone do aluno no formato (xx) xxxxx-xxxx: ");
                                String telefone = s.nextLine();

                                if (!Utilitaria.validaTel(telefone)) {
                                    System.out.println("Violacao: Telefone com formato ou regras invalidas!");
                                    continue;
                                }

                                System.out.print("Categoria do aluno (1, 2 ou 3): ");
                                int categoria = 0;
                                try {
                                    categoria = Integer.parseInt(s.nextLine());
                                } catch (NumberFormatException e) {
                                    categoria = 0;
                                }

                                if (categoria < 1 || categoria > 3) {
                                    System.out.println("Violacao: Categoria deve ser 1, 2 ou 3!");
                                    continue;
                                }

                                String codigo = Utilitaria.geraCodigo();
                                Aluno novoAluno = new Aluno(codigo, nome, telefone, 0, categoria);
                                listaAlunos.add(novoAluno);
                                academia.atualiza(1);

                                System.out.println("Aluno cadastrado com sucesso! Codigo gerado: " + codigo);

                            } else if (opSub == '2') {
                                System.out.println("\nRELATÓRIO\n");
                                for (Aluno al : listaAlunos) {
                                    if (al.categoria == 1) {
                                        System.out.println(al.exibe1());
                                    } else {
                                        System.out.println(al.exibe2(al.getAcessos()));
                                    }
                                }
                                System.out.println("TOTAL DE ALUNOS = " + academia.getAlunos());
                                System.out.println("ACESSOS = " + Academia.getAcessos());
                            }

                        } while (opSub != '3');
                    }
                    break;

                case '2':
                    if (autenticarFuncionario(s)) {
                        if (Academia.getAcessos() >= 5) {
                            System.out.println("Numero maximo de 5 aulas com personal na academia ja foi atingido este mes!");
                            break;
                        }

                        System.out.print("Digite o codigo do aluno: ");
                        String codBusca = s.nextLine();

                        Aluno alunoEncontrado = null;
                        for (Aluno al : listaAlunos) {
                            if (al.getCodigo().equalsIgnoreCase(codBusca)) {
                                alunoEncontrado = al;
                                break;
                            }
                        }

                        if (alunoEncontrado == null) {
                            System.out.println("Aluno nao foi cadastrado ainda!");
                            break;
                        }

                        int limiteGratuito = 0;
                        if (alunoEncontrado.categoria == 2) {
                            limiteGratuito = 1;
                        } else if (alunoEncontrado.categoria == 3) {
                            limiteGratuito = 2;
                        }

                        if (alunoEncontrado.categoria == 1) {
                            System.out.println("Alunos da categoria 1 nao possuem direito a aulas com personal!");
                        } else if (alunoEncontrado.getAcessos() >= limiteGratuito) {
                            System.out.println("O aluno ja utilizou o limite de aulas gratuitas com personal para a categoria " + alunoEncontrado.categoria + "!");
                        } else {
                            alunoEncontrado.setAcessos(alunoEncontrado.getAcessos() + 1);
                            Academia.adicionaAcesso();
                            System.out.println("Acesso contabilizado com sucesso! Acessos do aluno: " + alunoEncontrado.getAcessos());
                        }
                    }
                    break;

                case '3':
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opcao invalida!");
                    break;
            }

        } while (opcao != '3');

        s.close();
    }
}