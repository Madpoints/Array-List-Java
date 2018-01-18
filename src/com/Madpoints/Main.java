package com.Madpoints;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList= new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter you choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }

    }

    public static void printInstructions() {
        System.out.println("0 - options");
        System.out.println("1 - print");
        System.out.println("2 - add item");
        System.out.println("3 - modify item");
        System.out.println("4 - remove item");
        System.out.println("5 - search item");
        System.out.println("6 - quit");
    }

    public static void addItem() {
        System.out.print("Enter grocery item to add: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter item number to modify: ");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter new item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNumber - 1, newItem);
    }

    public static void removeItem() {
        System.out.print("Enter item number to remove: ");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNumber-1);
    }

    public static void searchForItem() {
        System.out.print("Enter a item name: ");
        String searchItem = scanner.nextLine();
        String item = groceryList.findItem(searchItem);

        if (item != null) {
            System.out.println(item + " found.");
        } else {
            System.out.println(searchItem + " not found.");
        }
    }
}
