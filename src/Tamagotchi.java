import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Tamagotchi {
    //Attributes
    private int hunger;
    private int boredom = 0;
    private ArrayList<String> words = new ArrayList<String>();
    private boolean isAlive;
    private Random generator = new Random();
    Scanner wordScanner = new Scanner(System.in);
    public String name;


    //Constructers
    Tamagotchi() {

    }

    //Methods
    public void Feed() {

    }

    public void Hi() {
        //   Collections.shuffle(words);
        while (true) {

            if (words.size() > 0) {
                System.out.println(words.get(generator.nextInt(words.size())));
            } else {
                System.out.println("gagabogo!");
            }

            System.out.println("Vill du att din tamagotchi säger ett annat ord? y/n");
            String no = wordScanner.nextLine();
            if (no.equals("n")) {
                break;
            }
        }

    }

    public void Teach() {

        while (true) {
            System.out.println("Vilket nytt ord vill du lära din tamagotchi?");

            String newWord = wordScanner.nextLine();
            words.add(newWord);

            System.out.println(words);

            System.out.println("Vill du lära tamagotchin ett till ord? y/n");
            String no = wordScanner.nextLine();
            if (no.equals("n")) {
                break;
            }
        }


    }

    public void Tick() {

    }

    public void PrintStats() {
        System.out.println(hunger);
        System.out.println(boredom);
    }

    private void ReduceBoredom() {

    }

    // Setters & getters

}