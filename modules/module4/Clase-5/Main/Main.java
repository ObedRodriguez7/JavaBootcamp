package Main;
import Operaciones.Operaciones;

public class Main {
    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();
        Menu menu = new Menu(6);
        menu.addNewMenuItem("Calculadora de edad de perros");
        menu.addNewMenuItem("Calculadora de millas a km");
        menu.addNewMenuItem("Calculadora de descuento");
        menu.addNewMenuItem("Calculadora de propinas");
        menu.addNewMenuItem("Juego de adivinar el número");
        menu.addNewMenuItem("Salir");

        try {
            int option;
            boolean flag = true;
            do {
                option = menu.getUserOption();
                switch (option) {
                    case 1:
                        operaciones.CalcularEdadPerro();
                        break;
                    case 2:
                        operaciones.CalcularMillasAKm();
                        break;
                    case 3:
                        operaciones.CalcularDescuento();
                        break;
                    case 4:
                        operaciones.CalcularPropina();
                        break;
                    case 5:
                        operaciones.numeroRandom();
                        break;
                    case 6:
                        flag = false;
                        break;
                    default:
                        System.out.println("Opción  no valida. Intentelo de nuevo");
                }

            } while (flag);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
