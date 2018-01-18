package com.Madpoints;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list.");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ": " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        String oldItem = groceryList.get(position);
        groceryList.set(position, newItem);
        System.out.println("Grocery list updated.");
        System.out.println(oldItem + " replaced by " + groceryList.get(position));
    }

    public void removeGroceryItem(int position) {
        String item = groceryList.get(position);
        groceryList.remove(position);
        System.out.println(item + " removed from grocery list.");
    }

    public String findItem(String searchItem) {
        //boolean exists = groceryList.contains(searchItem);
        int position = groceryList.indexOf(searchItem);
        if (position < 0) {
            return null;
        }

        return groceryList.get(position);
    }
}
