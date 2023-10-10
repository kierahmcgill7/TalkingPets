package animals;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How Many pets do you have?");
        int numberOfPets = scanner.nextInt();

        List<Pets> pets = new ArrayList<>();

        for (int i = 0; i < numberOfPets; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("What type of pet do you have? ");
            String petType = scanner1.next();
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("What is your pets name? ");
            String petName = scanner2.next();
            switch (petType.toLowerCase()) {
                case "dog" -> {
                    Dog dog = new Dog(petName, petType);
                    pets.add(dog);
                }
                case "cat" -> {
                    Cat cat = new Cat(petName, petType);
                    pets.add(cat);
                }
                case "snake" -> {
                    Snake snake = new Snake(petName, petType);
                    pets.add(snake);
                }
                default -> System.out.println("Pet Unsupported ");
            }

        }
        for (Pets pet : pets) {
            System.out.println(pet.getName());
            System.out.println(pet.getType());
            pet.petSpeak();
        }
    }
}
