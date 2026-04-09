import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        miniCalculadora Calculadora = new miniCalculadora();

        System.out.println("1. Raíz cuadrada");
        System.out.println("2. Valor absoluto");
        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();

        System.out.print("Introduce un número: ");
        double numero = sc.nextDouble();

        switch (opcion) {
            case 1:
                System.out.println("Resultado: " + Calculadora.raizCuadrada(numero));
                break;
            case 2:
                System.out.println("Resultado: " + Calculadora.valorAbsoluto(numero));
                break;
            default:
                System.out.println("Opción no válida");
        }

        sc.close();
    }
}
