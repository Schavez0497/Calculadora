import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerString=new Scanner(System.in);


        int opcion =0;

        while (true){

            mostrarMenu();
            opcion=scanner.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Sumar:");
                    break;
                case 2:
                    System.out.println("Resta");
                    break;
                case 3:
                    System.out.println("multi");
                    break;
                case 4:
                    System.out.println("division");
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
