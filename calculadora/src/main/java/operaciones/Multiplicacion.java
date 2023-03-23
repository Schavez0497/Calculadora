package operaciones;

public class Multiplicacion implements ICalculo{
    @Override
    public Integer calcular(int a, int b) {
        return a*b;
    }

    public Integer calcular2(int a, int b) {
        return a+b;
    }

}
