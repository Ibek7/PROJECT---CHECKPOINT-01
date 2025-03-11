import java.util.Scanner;

public class Driver {
    private static Location currLocation;

    public static void main(String[] args) {
        // Assign currLocation to a new Location object
        currLocation = new Location("Kitchen", "A dark kitchen whose lights are flickering");
        
        // Adding items
        currLocation.addItem(new Item("Knife"));
        currLocation.addItem(new Item("Turkey"));
        currLocation.addItem(new Item("Plate"));

        // Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // Enter an infinite loop
        while (true) {
            // Prompt the user to enter a command
            System.out.println("Enter a command (type 'quit' to exit): ");
            
            // Use the nextLine() method to read the command
            String command = scanner.nextLine();

            // Check if the user wants to quit
            if (command.equalsIgnoreCase("quit")) {
                break;
            }

            // Split the command into individual words
            String[] commandParts = command.split(" ");

            // Use a switch-case structure to handle different commands
            switch (commandParts[0].toLowerCase()) {
                case "look":
                    System.out.println("You are in " + currLocation.getName() + ": " + currLocation.getDescription());
                    break;
                case "examine":
                    if (commandParts.length > 1) {
                        String itemName = commandParts[1];
                        Item item = currLocation.getItem(itemName);
                        if (item != null) {
                            System.out.println(item.toString());
                        } else {
                            System.out.println("Cannot find that item.");
                        }
                    } else {
                        System.out.println("Examine what?");
                    }
                    break;
                case "take":
                    if (commandParts.length > 1) {
                        String itemName = commandParts[1];
                        Item item = currLocation.removeItem(itemName);
                        if (item != null) {
                            System.out.println("You took the " + item.getName());
                        } else {
                            System.out.println("There is no " + itemName + " here.");
                        }
                    } else {
                        System.out.println("Take what?");
                    }
                    break;
                default:
                    System.out.println("I don't know how to do that.");
                    break;
            }
        }

        // Close the scanner
        scanner.close();
    }
}