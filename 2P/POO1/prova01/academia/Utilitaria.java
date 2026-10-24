package academia;

import java.util.Random;

public class Utilitaria {

    public static String geraCodigo() {
        Random random = new Random();
        StringBuilder codigo = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            char letra = (char) ('a' + random.nextInt(26));
            codigo.append(letra);
        }

        for (int i = 0; i < 2; i++) {
            int digito = random.nextInt(10);
            codigo.append(digito);
        }

        return codigo.toString();
    }

    public static boolean validaTel(String tel) {
        if (tel == null) {
            return false;
        }
        
        String regex = "^\\(3[1-57-9]\\) 9[89][0-9]{3}-[0-9]{4}$";
        return tel.matches(regex);
    }
}