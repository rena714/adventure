import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Variables
        int health = 100;
        String playerName = "";
        boolean isPlaying = true;
        boolean hasKnife = false;

        System.out.println("Welcome to the Adventure Game");
        System.out.print("Enter your name: ");
        playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + ". You are walking down the street");

        while (isPlaying) {
            System.out.println("You see three people in front of you, which one do you want to kidnap? (1) an old grandma (2) a buff guy or (3) a 3-year-old girl");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("The old grandma hit your leg with her cane");
                health -= 20;
                System.out.println("Health: " + health);
            } else if (choice == 2) {
                System.out.println("You're too weak, you got kidnapped by him instead");
                health -= 30;
                System.out.println("Health: " + health);
            } else if (choice == 3) {
                System.out.println("You approach the little girl");
                break;
            }
        }

        while (isPlaying) {
            System.out.println("Do you want to (1) offer her a candy or (2) grab her and force her to go with you?");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Yay, she's willing to go with you");
                break;  
            } else if (choice == 2) {
                System.out.println("Oh no! She starts screaming and kicking u");
                System.out.println("quick u need to find something to calm her down");
                health -= 10;
                System.out.println("Health: " + health);

            } 
        }

        System.out.println("You guys arrived at your house");
        
        while (isPlaying) {
            System.out.println("Do you want to (1) dissect her or (2) cook her alive?");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("You need a cleaver knife");
                break; 
            } else if (choice == 2) {
                System.out.println("Too bad, you need to dissect her first in order to cook her");
            }
        }

        System.out.println("You go to the kitchen and look for the knife.");
        while (!hasKnife) {
            System.out.println("Do you want to look into (1) the drawer or (2) the fridge?");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("The knife is not here");
            } else if (choice == 2) {
                System.out.println("YAY! You found the knife");
                hasKnife = true; 
            }
        }
        System.out.println("now u may dissect her");
        
        //Dissection
        while (isPlaying) {
            System.out.println("do you want to (1) dismember her or (2) chop off her head ");
            int choice = scanner.nextInt();
            
            if (choice == 1) {
                System.out.println("easy peasy");
                System.out.println("she fits perfectly in the big pot as if she's made for it");
                System.out.println("the pot is filled with gore and ground meat");
                break;
            } else if (choice == 2) {
                System.out.println("C'est parfait");
                System.out.println("her eyes never leave you even after her head is chopped off");
                System.out.println("you put her head on the shelf and take a step back to admire the collections");
                System.out.println("then you throw the rest in a big pot");
                break;
            }
        }
        System.out.println("The water is boiled and the room is permeated with the rich aroma of fresh meat");
       
        System.out.println("do u want to add some (1) salts or (2) sugars");
        int choice = scanner.nextInt();
            if (choice == 1) {
                System.out.println("hehe salt increases the rate of decomposition");
            }else {
                System.out.println("Mmm she's such a sweetie");
                
            }

        System.out.println("then yay it's done");
        System.out.println("u store it in the containers");
        System.out.println("and decide to share some with the neighbours");
        System.out.println("you watch them with a content smile as they close the door and say");

        System.out.println("bon appetit!");
        for (int i = 0; i <= 5; i+=2) {
            System.out.println("hehe");
        }
        scanner.close();
    }
}
