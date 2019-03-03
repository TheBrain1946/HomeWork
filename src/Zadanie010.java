import java.util.Scanner;

public class Zadanie010 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Ile mam lat, Zgadnij 18 |  20 | 40 ");
        int wiek = input.nextInt();

        if (wiek == 18){
            System.out.println("Brawo zgadłeś");
        }else if (wiek == 20){
            System.out.println("Lipa nie zgadłes");
        }else{

            System.out.println("Próbuj dalej");

        }
    }
}
