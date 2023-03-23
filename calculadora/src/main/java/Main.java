
import operaciones.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerint = new Scanner(System.in);
        Scanner scannerString=new Scanner(System.in);
        ICalculo multiplicar = new Multiplicacion();
        ICalculo restar = new Resta();
        ICalculo sumar = new Suma();
        ICalculo dividir = new Division();
        int a = 0, b = 0;


        int opcion =0;

        while (true){

            mostrarMenu();
            opcion=scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Sumar:");
                    System.out.println("Ingrese el Primer Numero: ");
                    a = scannerint.nextInt();
                    System.out.println("Ingrese el segundo Numero: ");
                    b = scannerint.nextInt();
                    System.out.println("La suma es: " +sumar.calcular(a,b));
                    break;
                case 2:
                    System.out.println("Resta");
                    System.out.println("Ingrese el Primer Numero: ");
                    a = scannerint.nextInt();
                    System.out.println("Ingrese el segundo Numero: ");
                    b = scannerint.nextInt();
                    System.out.println("La Resta es: " + restar.calcular(a,b));
                    break;
                case 3:
                    System.out.println("multi");
                    System.out.println("Ingrese el Primer Numero: ");
                    a = scannerint.nextInt();
                    System.out.println("Ingrese el segundo Numero: ");
                    b = scannerint.nextInt();
                    System.out.println("La Multiplicacion es: " + multiplicar.calcular(a,b));
                    break;
                case 4:
                    System.out.println("division");
                    System.out.println("Ingrese el Primer Numero: ");
                    a = scannerint.nextInt();
                    System.out.println("Ingrese el segundo Numero: ");
                    b = scannerint.nextInt();
                    System.out.println("La Division es: " + dividir.calcular(a,b));
                default:
                    break;

            }

            String salir="";
            System.out.println("Desea Continuar (S/N:)");
            salir= scannerString.nextLine();

            if (!salir.equalsIgnoreCase("S")){
                System.exit(0);
            }
        }
    }
    public static void mostrarMenu(){
        System.out.println("******************************");
        System.out.println("Menu Calculadora");
        System.out.println("*******************************");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("*******************************");

    }
}
