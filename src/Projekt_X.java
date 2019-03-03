
import java.sql.SQLOutput;
import java.util.Scanner;

public class Projekt_X {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Siema Jak masz na Imię ?");
        String imie = input.nextLine();

        System.out.println("Wow ale imię, Naprawdę Asia ?");
        String dobre = input.nextLine();

        System.out.println("Ale jak to ?");
        String sure = input.nextLine();


        System.out.println("Zazdroszcze ci :(");
        input.nextLine();

        System.out.println("No przecież imienia :(");
        input.nextLine();

        System.out.println("A ile masz lat ?");
        int wiek = input.nextInt();

        boolean old = wiek >= 18;
        System.out.println("Pełnoletnia i pachnąca\n");
        String wait = input.nextLine();

        System.out.println("To wpadasz na ostre ruchanko ?");
        String tak = input.nextLine();

        System.out.println("I to rozumiem !!!!");
        input.nextLine();
    }
}
