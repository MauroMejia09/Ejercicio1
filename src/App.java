
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Hola, nuevamente yo, haciendo pruebas creo que de una calculadora!");

        // Variables de números
        int numero1 = 10;
        float numero2 = 20.12345678910111213f;
        double numero3 = 10.12345678910111213;

        System.out.println("Int: " + numero1);
        System.out.println("Float: " + numero2);
        System.out.println("Double: " + numero3);

        // Variables de texto
        String NombreconSaltos = "Juanes\tPerez";
        String NombreconSaltos2 = "Gabriel\tMauricio";

        System.out.println(NombreconSaltos);
        System.out.println(NombreconSaltos2);

        // Operaciones matemáticas básicas
        int a = 10;
        double b = 3.5;
        var resultado = a / b;

        System.out.println("Resultado: " + resultado);

        // Jerarquía de operaciones matemáticas
        int resultado2 = (10 + 5) * 2;

        System.out.println("Resultado Jerarquia: " + resultado2);

        // Autoincrementables
        int numeropersona1 = 30;
        ++numeropersona1;

        System.out.println("Incremento de numero: " + numeropersona1);

        // Calculadora de compra
        /*
        final double TASA_IMPUESTO = 0.15;
        Scanner scanner = new Scanner(System.in);

        System.out.print("---Calculadora de compra---\n");
        System.out.print("Ingrese el precio unitario del articulo: ");
        var precioUnitario = scanner.nextDouble();

        System.out.print("Ingrese la cantidad de articulos: ");
        var cantidad = scanner.nextInt();

        System.out.print("Ingrese la cantidad pagada por el cliente: ");
        var cantidadPagada = scanner.nextDouble();

        var subtotal = precioUnitario * cantidad;
        var montoimpuesto = subtotal * TASA_IMPUESTO;
        var totalcompra = subtotal + montoimpuesto;
        var cambio = cantidadPagada - totalcompra;

        System.out.println("\n--- Resumen de la Compra ---");
        System.out.printf("Subtotal: $%.2f%n", subtotal);
        System.out.printf("Impuesto (%.0f%%): $%.2f%n", TASA_IMPUESTO * 100, montoimpuesto);
        System.out.printf("Total de la Compra: $%.2f%n", totalcompra);
        System.out.printf("Cantidad Pagada: $%.2f%n", cantidadPagada);
        System.out.printf("Cambio: $%.2f%n", cambio);

        System.out.println("----------------------------");
        System.out.println("¡Gracias por su compra!");

        scanner.close();
        */

        // Ejercicio adicional: 6 / 2 * (1 + 2)
        /*
        var ResultadoOperacion = 6 / 2 * (1 + 2);

        System.out.println("Resultado de la operacion: " + ResultadoOperacion);
        */

        // Calculadora de precio por kilos
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pernil Iberic D'Engreix Llen. Azuaga porcion de 100 gramos tiene un costo de: 5,95$");
        System.out.println("Cuantos kilos desea llevar: ");

        var kilosdeseados = scanner.nextInt();

        var precioUnitario = 5.95;
        var kilosEnGramos = kilosdeseados * 1000;
        var subtotal = precioUnitario * kilosEnGramos / 100;

        System.out.printf("Subtotal: $%.2f%n", subtotal);

        scanner.close();
    }
}

