import calculadora.Calculadora;
import operaciones.Suma;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(new Suma());
        System.out.println(calculadora.calcular(2,5));
    }
}
