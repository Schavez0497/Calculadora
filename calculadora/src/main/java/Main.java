
import calculadora.Calculadora;
import operaciones.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);

        int opcion = 0;
        int num1, num2;
        while (true) {

            mostrarMenu();
            mostrar();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Digite primer numero: ");
                    num1 = scanner.nextInt();
                    System.out.println("Digite segundo numero: ");
                    num2 = scanner.nextInt();
                    Suma suma = new Suma();
                    Calculadora calculadora = new Calculadora(suma);
                    System.out.println("El resultado de la suma es: " + calculadora.calcular(num1, num2));
                    System.out.println("El resultado de la suma es: " + calculadora.calcular(num1, num2));
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
                    break;
                case 3:
                    System.out.println("Digite primer numero: ");
                    num1 = scanner.nextInt();
                    System.out.println("Digite segundo numero: ");
                    num2 = scanner.nextInt();

                    Calculadora calculadora3 = new Calculadora(new Multiplicacion());
                    System.out.println("El resultado de la multiplicacion es: " + calculadora3.calcular(num1, num2));
                    break;
                case 4:
                    System.out.println("Digite primer numero: ");
                    num1 = scanner.nextInt();
                    System.out.println("Digite segundo numero: ");
                    num2 = scanner.nextInt();

                    Calculadora calculadora4 = new Calculadora(new Division());
                    System.out.println("El resultado de la prueba es: " + calculadora4.calcular(num1, num2));
                default:
                    break;

            }

            String salir = "";
            System.out.println("Desea Continuar (S/N:)");
            salir = scannerString.nextLine();

            if (!salir.equalsIgnoreCase("S")) {
                System.exit(0);
            }
        }
    }

    public static void mostrarMenu() {
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
