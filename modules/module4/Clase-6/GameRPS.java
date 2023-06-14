import java.util.Random;
import java.util.Scanner;

public class GameRPS {
    /*
    Escribe un programa que permita al usuario jugar el juego clásico de "piedra, papel, tijeras" contra la computadora.
    El programa debe solicitar al usuario que ingrese su elección (piedra, papel o tijeras) y luego generar una elección aleatoria para la computadora.
    Después de eso, el programa debe determinar el ganador según las reglas del juego y mostrar el resultado.
     */
    private static Scanner sc = new Scanner(System.in);
    private static Random random = new Random();
    public static void main(String[] args) {
        startGame();

    }
    public static void startGame() {
        String[] optionsRPS = {"rock","paper","scissors"};
        System.out.println("choose an option");
        System.out.println("1. Rock \n" + "2. Paper \n"+"3. Scissors");
        int option = sc.nextInt();
        int numberRandom = random.nextInt(3) + 1 ;
        String optionUser = optionsRPS[option - 1];
        String optionComputer = optionsRPS[numberRandom -1];

        switch (optionUser) {
            case "rock":
                System.out.println(rock(optionComputer));
                break;
            case "paper":
                System.out.println(paper(optionComputer));
                break;
            case "scissors":
                System.out.println(scissors(optionComputer));
                break;
            default:
                System.out.println("no match");
        }
    }

    public static String rock(String optionComputer) {
        String result = "";
        if (optionComputer.equals("rock")){
            result = "Draw";
        } else if (optionComputer.equals("paper")) {
            result = "You Lose";
        } else {
            result = "You Win!!!!!!";
        }
        return result;
    }

    public static String paper(String optionComputer) {
        String result = "";
        if (optionComputer.equals("paper")) {
            result = "Draw";
        } else if (optionComputer.equals("scissors")) {
            result = "You Lose";
        } else {
            System.out.println("You Win!!!!!!");
        }
        return result;
    }

    public static String scissors(String optionComputer) {
        String result = "";
        if (optionComputer.equals("scissors")) {
            result = "Draw";
        } else if (optionComputer.equals("rock")) {
            result = "You Lose";
        } else {
            result = "You Win!!!!!!";
        }
        return result;
    }
}
