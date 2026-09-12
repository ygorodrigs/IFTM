import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);

    // --- EXERCÍCIO 01 ---
    public static int[] lerNumerosEx01() {
        int[] numero = new int[2];
        System.out.println();
        System.out.print("Informe o primeiro número: ");
        numero[0] = s.nextInt();
        System.out.print("Informe o segundo número: ");
        numero[1] = s.nextInt();
        return numero;
    }
    public static int compararEx01(int a, int b) {
        if (a < b) return -1;
        if (a == b) return 0;
        return 1;
    }
    public static void exibirResultadoEx01(int resultado) {
        System.out.println();
        if (resultado == -1) System.out.println("O primeiro número é menor que o segundo");
        else if (resultado == 0) System.out.println("Os dois números são iguais");
        else if (resultado == 1) System.out.println("O primeiro número é maior que o segundo");
        System.out.println();
    }

    // --- EXERCÍCIO 02 ---
    public static int[] lerRaizesEx02() {
        int[] raizes = new int[3];
        System.out.println();
        System.out.print("Informe A (equação 2º grau): ");
        raizes[0] = s.nextInt();
        System.out.print("Informe B (equação 2º grau): ");
        raizes[1] = s.nextInt();
        System.out.print("Informe C (equação 2º grau): ");
        raizes[2] = s.nextInt();
        return raizes;
    }
    public static double montarEquacaoEx02(int a, int b, int c) {
        return Math.pow(b, 2) - (4 * a * c);
    }
    public static void exibirEquacaoEx02(double delta, int a, int b) {
        System.out.println();
        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("x1 = " + x1 + " e x2 = " + x2);
        } else if (delta == 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("x1 = " + x1);
        } else {
            System.out.println("Não existe raízes reais");
        }
        System.out.println();
    }

    // --- EXERCÍCIO 03 ---
    public static double[] lerMediaAritmeticaEx03() {
        double[] numero = new double[2];
        System.out.println();
        System.out.print("Informe o primeiro número: ");
        numero[0] = s.nextDouble();
        System.out.print("Informe o segundo número: ");
        numero[1] = s.nextDouble();
        return numero;
    }
    public static double realizarMediaEx03(double a, double b) {
        return (a + b) / 2;
    }
    public static void exibirResultadoEx03(double media) {
        System.out.println("\nA média aritmética é: " + media + "\n");
    }

    // --- EXERCÍCIO 04 ---
    public static int[] lerLadosTrianguloEx04() {
        int[] lados = new int[3];
        System.out.println();
        for (int i = 0; i < 3; i++) {
            System.out.print("Informe o " + (i + 1) + "º lado: ");
            lados[i] = s.nextInt();
        }
        return lados;
    }
    public static int analisarLadosTrianguloEx04(int a, int b, int c) {
        if (a < (b + c) && b < (a + c) && c < (b + a)) {
            if (a == b && b == c) return 0;
            else if (a == b || b == c || a == c) return 1;
            else return 2;
        }
        return 3;
    }
    public static void exibirResultadoEx04(int tipoTriangulo) {
        System.out.println();
        if (tipoTriangulo == 0) System.out.println("Triângulo equilátero.");
        else if (tipoTriangulo == 1) System.out.println("Triângulo isósceles.");
        else if (tipoTriangulo == 2) System.out.println("Triângulo escaleno.");
        else System.out.println("Não formam um triângulo.");
        System.out.println();
    }

    // --- EXERCÍCIO 05 ---
    public static int[] lerValoresEx05() {
        int[] valores = new int[100];
        int i = 0;
        System.out.println("\nInforme os valores (0 encerra): ");
        do {
            System.out.print("Valor " + (i + 1) + ": ");
            valores[i] = s.nextInt();
            i++;
        } while (valores[i - 1] != 0);
        return valores;
    }
    public static int[] analisarValoresEx05(int[] numeros5) {
        int soma = 0;
        int[] tipoDeValor = new int[2];
        for (int i = 0; numeros5[i] != 0; i++) {
            soma += numeros5[i];
            if (soma >= 0) tipoDeValor[0]++;
            else tipoDeValor[1]++;
        }
        return tipoDeValor;
    }
    public static void exibirResultado05(int[] tipoDeValor) {
        System.out.println("\nSomas positivas: " + tipoDeValor[0]);
        System.out.println("Somas negativas: " + tipoDeValor[1] + "\n");
    }

    // --- EXERCÍCIO 06 ---
    public static int lerNumeroEx06() {
        System.out.print("\nInforme um número natural: ");
        return s.nextInt();
    }
    public static String obterFatores06(int a) {
        StringBuilder fatores = new StringBuilder();
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) fatores.append(i).append(" ");
        }
        return fatores.toString();
    }
    public static void exibirResultado06(int a) {
        String fatores = obterFatores06(a);
        System.out.println("Os fatores de " + a + " são: " + fatores);
    }
    public static boolean repetirProcesso06() {
        System.out.print("\nDeseja repetir o processo? (s/n): ");
        char resposta = s.next().charAt(0);
        return resposta == 's' || resposta == 'S';
    }

    // --- EXERCÍCIO 07 ---
    public static int lerNumeroAvulso() {
        return s.nextInt();
    }
    public static int[] processarCalculosEx07() {
        // Posições: 0:QtdPares, 1:SomaPares, 2:QtdImpares, 3:SomaImpares, 4:QtdPositivos, 5:SomaPositivos, 6:QtdNegativos, 7:SomaNegativos
        int[] resultados = new int[8];
        int num;
        System.out.println("\nDigite números inteiros (0 para finalizar):");
        do {
            System.out.print("Número: ");
            num = lerNumeroAvulso();
            if (num != 0) {
                if (num % 2 == 0) { resultados[0]++; resultados[1] += num; } 
                else { resultados[2]++; resultados[3] += num; }
                
                if (num > 0) { resultados[4]++; resultados[5] += num; } 
                else if (num < 0) { resultados[6]++; resultados[7] += num; }
            }
        } while (num != 0);
        return resultados;
    }
    public static void exibirResultadoEx07(int[] r) {
        System.out.println("\n--- Resultados ---");
        System.out.println("Pares     -> Qtd: " + r[0] + " | Soma: " + r[1]);
        System.out.println("Ímpares   -> Qtd: " + r[2] + " | Soma: " + r[3]);
        System.out.println("Positivos -> Qtd: " + r[4] + " | Soma: " + r[5]);
        System.out.println("Negativos -> Qtd: " + r[6] + " | Soma: " + r[7] + "\n");
    }

    // --- EXERCÍCIO 08 ---
    public static int lerNumeroEx08() {
        System.out.print("\nInforme um número inteiro: ");
        return s.nextInt();
    }
    public static int verificarNumeroPrimoEx08(int a) {
        if (a <= 1) return 1;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) return 1;
        }
        return 0;
    }
    public static void exibirResultadoEx08(int resultado) {
        System.out.println();
        if (resultado == 0) System.out.println("O número informado é primo.");
        else System.out.println("O número informado não é primo.");
        System.out.println();
    }

    // --- EXERCÍCIO 09 ---
    public static int lerNumeroEx09() {
        System.out.print("\nInforme um número natural: ");
        return s.nextInt();
    }
    public static int calcularFatorialEx09(int a) {
        int fatorial = 1;
        for (int i = 1; i <= a; i++) fatorial *= i;
        return fatorial;
    }
    public static void exibirResultadoEx09(int resultado) {
        System.out.println("\nO fatorial é: " + resultado + "\n");
    }

    // --- EXERCÍCIO 10 ---
    public static int[] lerDoisNumerosEx10() {
        int[] num = new int[2];
        System.out.print("\nInforme o primeiro número natural (>0): ");
        num[0] = s.nextInt();
        System.out.print("Informe o segundo número natural (>0): ");
        num[1] = s.nextInt();
        return num;
    }
    public static int calcularMMCEx10(int a, int b) {
        int tempA = a, tempB = b;
        while (tempB != 0) {
            int resto = tempA % tempB;
            tempA = tempB;
            tempB = resto;
        }
        return a * (b / tempA); 
    }
    public static void exibirResultadoEx10(int mmc) {
        System.out.println("\nO MMC é: " + mmc + "\n");
    }

    // --- EXERCÍCIO 11 ---
    public static int[] lerDoisNumerosEx11() {
        int[] num = new int[2];
        System.out.print("\nInforme o primeiro número natural (>0): ");
        num[0] = s.nextInt();
        System.out.print("Informe o segundo número natural (>0): ");
        num[1] = s.nextInt();
        return num;
    }
    public static int calcularMDCEx11(int a, int b) {
        while (b != 0) {
            int resto = a % b;
            a = b;
            b = resto;
        }
        return a;
    }
    public static void exibirResultadoEx11(int mdc) {
        System.out.println("\nO MDC é: " + mdc + "\n");
    }

    // --- EXERCÍCIO 12 ---
    public static int lerTamanhoEx12() {
        System.out.print("\nQuantos termos da sequência de Fibonacci deseja exibir? ");
        return s.nextInt();
    }
    public static int[] gerarFibonacciEx12(int n) {
        if (n <= 0) return new int[0];
        int[] fib = new int[n];
        if (n > 0) fib[0] = 0;
        if (n > 1) fib[1] = 1;
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        return fib;
    }
    public static void exibirSequenciaEx12(int[] seq) {
        System.out.print("\nSequência de Fibonacci: ");
        for (int val : seq) System.out.print(val + " ");
        System.out.println("\n");
    }

    // --- EXERCÍCIO 13 ---
    public static int[] lerParametrosPAEx13() {
        int[] param = new int[3];
        System.out.print("\nInforme o termo inicial da PA: ");
        param[0] = s.nextInt();
        System.out.print("Informe a razão da PA: ");
        param[1] = s.nextInt();
        System.out.print("Informe a quantidade de termos: ");
        param[2] = s.nextInt();
        return param;
    }
    public static int[] gerarPAEx13(int a1, int r, int n) {
        int[] pa = new int[n];
        for (int i = 0; i < n; i++) {
            pa[i] = a1 + (i * r);
        }
        return pa;
    }
    public static void exibirPAEx13(int[] pa) {
        System.out.print("\nPA gerada: ");
        for (int val : pa) System.out.print(val + " ");
        System.out.println("\n");
    }

    // --- EXERCÍCIO 14 ---
    public static int[] lerParametrosPGEx14() {
        int[] param = new int[3];
        System.out.print("\nInforme o termo inicial da PG: ");
        param[0] = s.nextInt();
        System.out.print("Informe a razão da PG: ");
        param[1] = s.nextInt();
        System.out.print("Informe a quantidade de termos: ");
        param[2] = s.nextInt();
        return param;
    }
    public static double calcularSomaPGEx14(int a1, int q, int n) {
        if (q == 1) return (double) a1 * n;
        return a1 * (Math.pow(q, n) - 1) / (q - 1);
    }
    public static void exibirSomaPGEx14(double soma) {
        System.out.println("\nA soma dos elementos da PG é: " + soma + "\n");
    }

    // --- EXERCÍCIO 15 ---
    public static int lerNumeroFixoEx15() {
        return 10; // Tabuada fixa até 10
    }
    public static void calcularEExibirLinhaTabuadaEx15(int base, int multiplicador) {
        System.out.println(base + " x " + multiplicador + " = " + (base * multiplicador));
    }
    public static void processarTabuadasEx15() {
        int limite = lerNumeroFixoEx15();
        System.out.println("\n--- Tabuadas de 1 a " + limite + " ---");
        for (int i = 1; i <= limite; i++) {
            System.out.println("Tabuada do " + i + ":");
            for (int j = 1; j <= 10; j++) {
                calcularEExibirLinhaTabuadaEx15(i, j);
            }
            System.out.println();
        }
    }

    // --- EXERCÍCIO 16 ---
    public static int lerNumeroEx16() {
        System.out.print("\nInforme um número natural: ");
        return s.nextInt();
    }
    public static boolean verificarNumeroPerfeitoEx16(int n) {
        int somaDivisores = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) somaDivisores += i;
        }
        return (somaDivisores == n) && (n != 0);
    }
    public static void exibirResultadoEx16(boolean ehPerfeito, int n) {
        if (ehPerfeito) System.out.println("\nO número " + n + " é PERFEITO.\n");
        else System.out.println("\nO número " + n + " NÃO é perfeito.\n");
    }

    // --- MAIN ---
    public static void main(String[] args) {
        int op;
        do {
            System.out.println("_____ | Menu | _____");
            System.out.println("1 - Comparar dois números");
            System.out.println("2 - Calcular raízes de uma equação");
            System.out.println("3 - Média aritmética");
            System.out.println("4 - Verificação de triângulo");
            System.out.println("5 - Analisar valores e somar");
            System.out.println("6 - Exibir fatores (divisores)");
            System.out.println("7 - Estatísticas de números (Pares, Ímpares, etc)");
            System.out.println("8 - Verificação de número primo");
            System.out.println("9 - Calcular fatorial");
            System.out.println("10 - Calcular MMC");
            System.out.println("11 - Calcular MDC");
            System.out.println("12 - Sequência de Fibonacci");
            System.out.println("13 - Exibir Progressão Aritmética (PA)");
            System.out.println("14 - Soma da Progressão Geométrica (PG)");
            System.out.println("15 - Tabuadas de 1 a 10");
            System.out.println("16 - Verificar Número Perfeito");
            System.out.println("0 - Sair\n");
            System.out.print("Escolha uma opção: ");
            op = s.nextInt();

            switch (op) {
                case 1:
                    int[] numeros1 = lerNumerosEx01();
                    exibirResultadoEx01(compararEx01(numeros1[0], numeros1[1]));
                    break;
                case 2:
                    int[] raizes2 = lerRaizesEx02();
                    exibirEquacaoEx02(montarEquacaoEx02(raizes2[0], raizes2[1], raizes2[2]), raizes2[0], raizes2[1]);
                    break;
                case 3:
                    double[] numeros3 = lerMediaAritmeticaEx03();
                    exibirResultadoEx03(realizarMediaEx03(numeros3[0], numeros3[1]));
                    break;
                case 4:
                    int[] lados = lerLadosTrianguloEx04();
                    exibirResultadoEx04(analisarLadosTrianguloEx04(lados[0], lados[1], lados[2]));
                    break;
                case 5:
                    exibirResultado05(analisarValoresEx05(lerValoresEx05()));
                    break;
                case 6:
                    boolean repetir;
                    do {
                        int num = lerNumeroEx06();
                        exibirResultado06(num);
                        repetir = repetirProcesso06();
                    } while (repetir);
                    break;
                case 7:
                    exibirResultadoEx07(processarCalculosEx07());
                    break;
                case 8:
                    exibirResultadoEx08(verificarNumeroPrimoEx08(lerNumeroEx08()));
                    break;
                case 9:
                    exibirResultadoEx09(calcularFatorialEx09(lerNumeroEx09()));
                    break;
                case 10:
                    int[] nums10 = lerDoisNumerosEx10();
                    exibirResultadoEx10(calcularMMCEx10(nums10[0], nums10[1]));
                    break;
                case 11:
                    int[] nums11 = lerDoisNumerosEx11();
                    exibirResultadoEx11(calcularMDCEx11(nums11[0], nums11[1]));
                    break;
                case 12:
                    exibirSequenciaEx12(gerarFibonacciEx12(lerTamanhoEx12()));
                    break;
                case 13:
                    int[] paramPA = lerParametrosPAEx13();
                    exibirPAEx13(gerarPAEx13(paramPA[0], paramPA[1], paramPA[2]));
                    break;
                case 14:
                    int[] paramPG = lerParametrosPGEx14();
                    exibirSomaPGEx14(calcularSomaPGEx14(paramPG[0], paramPG[1], paramPG[2]));
                    break;
                case 15:
                    processarTabuadasEx15();
                    break;
                case 16:
                    int num16 = lerNumeroEx16();
                    exibirResultadoEx16(verificarNumeroPerfeitoEx16(num16), num16);
                    break;
                case 0:
                    System.out.println("\nPrograma encerrado.\n");
                    break;
                default:
                    System.out.println("\nOpção inválida!\n");
                    break;
            }
        } while (op != 0);
    }
}