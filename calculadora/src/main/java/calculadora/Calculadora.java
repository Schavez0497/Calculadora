package calculadora;

import operaciones.ICalculo;

public class Calculadora {
    private ICalculo calculo;

    public Calculadora(ICalculo calculo) {
        this.calculo = calculo;
    }

    public Integer calcular(int a, int b) {
        return calculo.calcular(a, b);
    }
}
