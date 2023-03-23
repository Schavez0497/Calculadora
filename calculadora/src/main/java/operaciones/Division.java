package operaciones;

public class Division implements ICalculo{
    @Override
    public Integer calcular(int a, int b) {
        return a / b;
    }
}
