package AppSobrecarga;

public class Quadrado {
    private double lado;

    public Quadrado (double lado) {
        this.lado = lado;
    }

    public double area() {
        return this.lado * this.lado;
    }

    public String exibe() {
        return "A área do quadrado de lado = " + lado + " vale " + area();
    }
}
