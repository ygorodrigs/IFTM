package lista03;

import java.util.Scanner;

public class Main {

    public static Scanner s = new Scanner(System.in);

    public static Pessoa dadosPessoais;
    public static Formacao dadosFormacao;

    public static Pessoa lePessoa() {
        s.nextLine();
        System.out.print("Nome: ");
        String nome = s.nextLine();

        System.out.print("Sexo: (M/F) ");
        char sexo = s.next().charAt(0);

        System.out.print("Idade: ");
        int idade = s.nextInt();

        return new Pessoa(nome, sexo, idade);
    }

    public static Formacao leFormacao() {
        s.nextLine();
        System.out.print("Nível: ");
        String nivel = s.nextLine();

        System.out.print("Concluído (Sim/Nao): ");
        String resp = s.nextLine();
        boolean concluido = resp.equalsIgnoreCase("sim"); // é um método das Strings em Java. Ele compara o texto que está em resp com a palavra "sim", ignorando letras maiúsculas ou minúsculas (daí o Ignore Case).

        System.out.print("Instituição: ");
        String instituicao = s.nextLine();

        System.out.print("Ano: ");
        int ano = s.nextInt();

        return new Formacao(nivel, concluido, instituicao, ano);
    }

    public static String exibePessoa(Pessoa p) {
        if (p == null) {
            return "Nenhuma pessoa cadastrada.";
        }
        return "Nome: " + p.nome + "\nSexo: " + p.sexo + "\nIdade: " + p.idade;
    }

    public static String exibeFormacao(Formacao f) {
        if (f == null) {
            return "Nenhuma formação cadastrada.";
        }
        /* 
        * Operador ternário: funciona como um atalho para if/else.
        * Estrutura: condição ? valor_se_verdade : valor_se_falso
        * Se a formação estiver concluída (true), a string recebe "Sim". Senão, recebe "Não".
         */

        String status = f.concluido ? "Sim" : "Não"; // Operador ternário (if/else resumido): Se f.concluido for true, recebe "Sim", senão recebe "Não".
        return "Nível: " + f.nivel + "\nConcluído: " + status + "\nInstituição: " + f.instituicao + "\nAno: " + f.ano;
    }

    public static void main(String[] args) {
        int op;

        do {
            System.out.println("\n___ | MENU | ___");
            System.out.println("1 - Ler dados pessoais");
            System.out.println("2 - Ler dados de formação");
            System.out.println("3 - Exibir dados pessoais");
            System.out.println("4 - Exibir dados de formação");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");
            op = s.nextInt();

            switch (op) {
                case 1:
                    dadosPessoais = lePessoa();
                    break;
                case 2:
                    dadosFormacao = leFormacao();
                    break;
                case 3:
                    System.out.println(exibePessoa(dadosPessoais));
                    break;
                case 4:
                    System.out.println(exibeFormacao(dadosFormacao));
                    break;
                case 5:
                    System.out.println("Programa encerrado");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (op != 5);
    }
}
