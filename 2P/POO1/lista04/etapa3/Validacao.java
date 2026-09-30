package etapa3;

public class Validacao {

    public static boolean isQuadOne(double x1, double x2, double y1, double y2) {
        return (x1 > 0 && x2 > 0 && y1 > 0 && y2 > 0); // como retorna boolean, ele vai retornar true ou false
    }
    
    public static boolean valida(double x1, double x2, double y1, double y2) {
        return isQuadOne(x1, x2, y1, y2);
    }         
}


// O uso de public static | Ao declarar os métodos como static, eles passam a pertencer à classe e não a um objeto individual. Isso permite chamá-los diretamente no código usando Validacao.valida(...), sem a necessidade de criar uma instância com new Validacao().