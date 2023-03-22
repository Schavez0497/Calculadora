package operaciones;

public class Resta implements ICalculo{
    @Override
    public Integer calcular(int a, int b) {
        return a-b;
    }
}