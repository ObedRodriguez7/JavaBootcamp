package Main;

import java.util.Scanner;

public class Menu {
    private String[] menuItems;
    private int count = 0;

    public Menu(int size) {
        menuItems = new String[size];

    }
    public void addNewMenuItem(String item) {
        if (count < menuItems.length) {
            menuItems[count++] = item;
        }

    }
    public int getUserOption() {
        System.out.println("************************");
        System.out.println(String.format("%10s", "Menu"));
        int result = 0;
        if (count > 0) {
            for (int i=0; i < count; i++) {
                System.out.println((i+1) + "-" + menuItems[i]);
            }
            System.out.println("************************");
            System.out.println("Seleccione una operacion: ");
            Scanner scanner = new Scanner(System.in);
            result = scanner.nextInt();
        }
        return result;
    }

}
