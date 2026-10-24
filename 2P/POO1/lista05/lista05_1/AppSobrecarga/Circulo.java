package AppSobrecarga;

public class Circulo {
    private double raio; // sem static porque cada circulo tem sua característica
    private double xcentro;
    private double ycentro;

    public Circulo(double raio, double xcentro, double ycentro) {
        this.raio = raio;
        this.xcentro = xcentro;
        this.ycentro = ycentro;
    }

    public Circulo(double xcentro, double ycentro) {
        this.xcentro = xcentro;
        this.ycentro = ycentro;
        this.raio = 0.0;
    }

    public double area() {
        return Math.PI * Math.pow(this.raio, 2);
    }

    public double area(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public String exibe() {
        return "A área do círculo de centro (" + xcentro + ", " + ycentro + ") e de raio = " + raio + " vale: " + area();
    }

    public String exibe(double areaCalculada) {
        return "A área do círculo de centro (" + xcentro + ", " + ycentro + ") e de raio = " + raio + " vale: " + areaCalculada;
    }
}