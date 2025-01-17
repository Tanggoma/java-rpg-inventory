import java.util.Scanner;

public class Inventory {
    public static void main(String[] args) {
        // show intro

        System.out.println("Welcome to RPG Inventory");

        String[] backpack = new String[8];

        Scanner console = new Scanner(System.in);

        // loop menu

        String input;

        do {
            System.out.println("Main Menu");
            System.out.println("1. Add an item");
            System.out.println("2. Display Backpack");
            System.out.println("3. Exit");

            System.out.print("Select [1-3]:");
            input = console.nextLine();

            if(input.equals("1")){
                addItem(console, backpack);
            } else if(input.equals("2")){
                displayBackpack(backpack);
            } else if(input.equals("3")){
                System.out.println("Goodbye! ");
            } else{
                System.out.println("Error, please input valid value [1-3]. ");
            }

        } while(!input.equals("3"));


    } // main close

    // 1. Add item

    public static void addItem(Scanner console, String[] backpack){

        System.out.println("Add an item");
        System.out.print("Slot #: ");
        int slot = Integer.parseInt(console.nextLine());
        if(slot <0 || slot > backpack.length){
            return;
        }
        System.out.print("Item: ");
        String item = console.nextLine();
        backpack[slot-1] = item;
    }

    //2. Display backpack

    public static void displayBackpack(String[] backpack){
        System.out.println("Items");
        for (int i = 0; i < backpack.length; i++) {
            System.out.printf("Slot #%s: %s%n",
                    i+1, backpack[i] == null ? "[empty]" : backpack[i]);
        }
    }
} //
