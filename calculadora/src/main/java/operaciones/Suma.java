package operaciones;

public class Suma implements ICalculo{
    @Override
    public Integer calcular(int a, int b) {
        return a+b;
    }

    public boolean verificar(int n){
        return 5 == n;
    }

}


