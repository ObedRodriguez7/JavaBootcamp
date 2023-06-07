package Operaciones;

import java.util.Random;
import java.util.Scanner;

public class Operaciones {
    private static final Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public void CalcularEdadPerro() {
        System.out.print("Digite la edad del Perro: ");
        int edad = scanner.nextInt();
        int edadPerro = edad * 7;
        System.out.println("La edad del perro en  anos humanos es: " + edadPerro);
    }

    public void CalcularMillasAKm() {
        System.out.println("Digite la cantidad en millas");
        double mi = scanner.nextDouble();
        double km = mi * 1.60934;
        System.out.println("La cantidad equivalente a kilometros es: " + km + "km");
    }

    public void CalcularDescuento() {
        System.out.println("Digite el precio del producto:");
        double precio = scanner.nextDouble();
        System.out.println("Digite el descuento del producto: ");
        double descuento = (scanner.nextDouble() / 100);
        double precioConDescuento = precio - (precio * descuento);
        System.out.println("El Precio con descuento es: " + String.format("%,.2f", precioConDescuento));
    }

    public void CalcularPropina() {
        System.out.println("Digite la cantidad total de la cuenta: ");
        double importeTotal = scanner.nextDouble();
        System.out.println("Digite el porcentaje de propina que deseas dar: ");
        double porcentajePropina = scanner.nextDouble();
        double propina = importeTotal * (porcentajePropina / 100);
        System.out.println("La propina es:" + String.format("%,.2f", propina));
    }

    public void numeroRandom() {
        int numeroRandom = random.nextInt(100) + 1;
        System.out.println("Intenta adivina un número del 1 - 100 ");
        int numero = scanner.nextInt();
        if (numero != numeroRandom) {
            System.out.println("Perdistes!! el numero era: " + numeroRandom);
        } else {
            System.out.println("Ganastes!!");
        }
    }
}
