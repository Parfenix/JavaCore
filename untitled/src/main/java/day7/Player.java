package day7;

public class Player {
    private int stamina;

    private final static int Max_Stamina = 100;
    private final static int Min_Stamina = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;

        if(countPlayers < 6) {
            countPlayers++;
        }

    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run() {
        if (stamina == 0) {
            return;
        }

        stamina--;

        if (stamina == 0) {
            countPlayers--;
        }
    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        } else {
            System.out.println("На поле нет свободных мест");
        }
    }
}