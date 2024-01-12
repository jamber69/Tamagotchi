import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    ArrayList<String> words = new ArrayList<String>();

    public Game() {
        start();
    }

    private void start() {
        Tamagotchi mytamagotchi = new Tamagotchi();
        boolean alive = true;
        while (alive) {
            System.out.println("Hej! Här är din tamagotchi");
            System.out.println(" ");
            System.out.println("1: Lär din tamagotchi ett nytt ord");
            System.out.println("2: Din tamagotchi säger ett ord");
            System.out.println("3: Vill du mata din tamagotchi");
            System.out.println("4. Vill du se din tamagotchis stats");


            System.out.println("Tryck k om du vill döda din tamagotchi");


            Scanner myScanner = new Scanner(System.in);
            boolean bool = false;
            String yes = myScanner.nextLine();
            if (yes.equals("1")) {
                mytamagotchi.Teach();
            }
            if (yes.equals("2")) {
                mytamagotchi.Hi();
            }
            if (yes.equals("3")) {
                mytamagotchi.Feed();
            }
            if (yes.equals("4")) {
                mytamagotchi.PrintStats();
            }

            if (yes.equals("k")) {
                alive = false;
            }

        }
        System.out.println("Din tamagotchi är död :(");
    }


}