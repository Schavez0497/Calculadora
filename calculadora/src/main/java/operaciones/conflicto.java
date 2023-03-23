package operaciones;

public class conflicto implements ICalculo{
    @Override
    public Integer calcular(int a, int b) {
        return a+b;
    }
}
