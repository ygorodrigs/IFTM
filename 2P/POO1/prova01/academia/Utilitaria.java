package academia;

import java.util.Random; // classe para fazer sorteios númericos 

public class Utilitaria {
    public static String geraCodigo() {
        Random random = new Random();
        StringBuilder codigoGerado = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            char codLetra = (char) ('A' + random.nextInt(26)); // na tabela ASCI o A vale 65, entao eu somo ao numero sorteado entre 0 e 25, que vira 65-90;
            codigoGerado.append(codLetra);
        }

        for (int j = 0; j < 2; j++) {
            int codNumero = random.nextInt(10);
            codigoGerado.append(codNumero);
        }

        return codigoGerado.toString();
    }

    public static boolean validaTel(String tel) {
        String regex = "3([1-5]|[7-9])9[8-9][0-9]{7}";
        return tel.matches(regex);
    }
}