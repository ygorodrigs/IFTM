package AppSobrecarga;

public class Triangulo {
    
    private double base;
    private double altura;

    public Triangulo (double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double area() {
        return (this.base * this.altura)/2;
    }

    public String exibe() {
        return "A área do triângulo de base = " + this.base + " e a altura " + this.altura + " = " + area();
    }
}
