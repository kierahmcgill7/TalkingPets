package scannerSwitch;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner aScannerObject = new Scanner(System.in);

        System.out.println("how many pets do you have? ");
        int petsAmount = aScannerObject.nextInt();
        aScannerObject.nextLine();

        System.out.println("What kind of pets are they? ");
        String petKind = aScannerObject.nextLine();
    }
}
