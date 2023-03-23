
<<<<<<< HEAD
=======
import calculadora.Calculadora;
>>>>>>> 8c3c92f1e3871482e5546bcaba8395457afda487
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
<<<<<<< HEAD
            opcion=scanner.nextInt();
=======
            mostrar();
            opcion = scanner.nextInt();
>>>>>>> 8c3c92f1e3871482e5546bcaba8395457afda487

            switch (opcion){
                case 1:
<<<<<<< HEAD
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
=======
                    System.out.println("Digite primer numero: ");
                    num1 = scanner.nextInt();
                    System.out.println("Digite segundo numero: ");
                    num2 = scanner.nextInt();
                    Suma suma = new Suma();
                    Calculadora calculadoras = new Calculadora(suma);

                    System.out.println("El resultado de la suma es: " + calculadoras.calcular(num1, num2));
                    System.out.println("El resultado de la suma es: " + calculadoras.calcular(num1, num2));
                    if (suma.verificar(5)){
                        System.out.println("Iguales");
                    }else{
                        System.out.println("Diferentes");
                    }
                    break;
                case 2:
                    System.out.println("Digite primer numero: ");
                    num1 = scanner.nextInt();
                    System.out.println("Digite segundo numero: ");
                    num2 = scanner.nextInt();

                    Calculadora calculadora2 = new Calculadora(new Resta());
                    Calculadora conflicto = new Calculadora(new conflicto());
                    System.out.println("El resultado de la resta es: " + calculadora2.calcular(num1, num2));
>>>>>>> 8c3c92f1e3871482e5546bcaba8395457afda487
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
<<<<<<< HEAD
                    System.out.println("division");
                    System.out.println("Ingrese el Primer Numero: ");
                    a = scannerint.nextInt();
                    System.out.println("Ingrese el segundo Numero: ");
                    b = scannerint.nextInt();
                    System.out.println("La Division es: " + dividir.calcular(a,b));
=======
                    System.out.println("Digite primer numero: ");
                    num1 = scanner.nextInt();
                    System.out.println("Digite segundo numero: ");
                    num2 = scanner.nextInt();

                    Calculadora calculadora4 = new Calculadora(new Division());
                    System.out.println("El resultado de la prueba es: " + calculadora4.calcular(num1, num2));
>>>>>>> 8c3c92f1e3871482e5546bcaba8395457afda487
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

    public static void mostrar() {
        System.out.println("******************************");
        System.out.println("soy otro Menu Calculadora");
        System.out.println("*******************************");
        System.out.println("1. SumaX");
        System.out.println("2. RestaX");
        System.out.println("3. MultiplicacionX");
        System.out.println("4. DivisionX");
        System.out.println("*******************************");

    }
}
