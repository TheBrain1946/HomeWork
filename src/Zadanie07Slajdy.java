import java.util.Scanner;

public class Zadanie07Slajdy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj aktualną godzinę?");
        int hours = input.nextInt();

        if (hours <= 8)
        System.out.println("Wstajemy kolego");
    }
}
x