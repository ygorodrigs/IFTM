package etapa2;

public class Retas {
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    public static int contador = 0;

    public Retas(double x1, double y1, double x2, double y2) { // metodo construtor não tem retorno
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        contador ++;
    }

    public double comprimento() {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); // nao precisa criar uma variavel resultado, porque o return vai retornar um resultado, que voce ja declarou que vai ser do tipo double 
    }

    public static boolean valida(double x1, double x2, double y1, double y2) {
        return (x1 > 0 && x2 > 0 && y1 > 0 && y2 > 0); // como retorna boolean, ele vai retornar true ou false
    } 

    public String exibe() {
        return "Ponto 1: (" + x1 + ", " + y1 + ") | Ponto 2: (" + x2 + ", " + y2 + ")"; 
    }
}


