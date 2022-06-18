package groceries;

import util.Input;

import java.util.ArrayList;
import java.util.Collections;

public class GroceryListApplication {

    public static ArrayList<String> generateCategories(){
        ArrayList<String> categories = new ArrayList<>();
        categories.add("dairy");
        categories.add("meat");
        categories.add("fish");
        categories.add("fruit");
        categories.add("vegetable");
        categories.add("drink");
        categories.add("snack");
        categories.add("dessert");
        categories.add("frozen");
        categories.add("grains");
        categories.add("canned");
        Collections.sort(categories);
        return categories;
    }

    public static void outputList(ArrayList<Grocery> groceryList){
        System.out.println("Your list:");
        for (Grocery grocery: groceryList){
            System.out.println("Category: " + grocery.getCategory());
            System.out.println("Item: " + grocery.getName());
            System.out.println("Quantity: " + grocery.getQuantity());
            System.out.println("");
        } // end loop through grocery list
    }

    public static void createItem(ArrayList<Grocery> groceryList, ArrayList<String> categories, Input input){
        System.out.println("Enter a new item:");
        System.out.println("Categories:");
        for (int i = 0; i < categories.size(); i++){
            if (i == categories.size() -1) {
                System.out.println(categories.get(i));
            } else {
                System.out.print(categories.get(i) + ", ");
            }
        } // end for loop through categories list
        String categoryChoice = input.getString("Choose a category:");
        String nameOfItem = input.getString("Enter the name of the item:");
        String quantity = input.getString("Enter the quantity:");
        Grocery grocery = new Grocery(Integer.parseInt(quantity), nameOfItem, categoryChoice);
        groceryList.add(grocery);
    }

    public static ArrayList<Grocery> sortListOfGroceriesByName(ArrayList<Grocery> groceryList){
        ArrayList<Grocery> alphabetizedList = new ArrayList<>();
        ArrayList<String> listOfItemNames = new ArrayList<>();
        for (Grocery grocery: groceryList){
            listOfItemNames.add(grocery.getName());
        }
        Collections.sort(listOfItemNames);
        for (String name: listOfItemNames){
            for(Grocery grocery: groceryList){
                if (grocery.getName().equals(name)){
                    alphabetizedList.add(grocery);
                }
            }
        }
        return alphabetizedList;
    }


    public static void main(String[] args) {
        ArrayList<Grocery> groceryList = new ArrayList<>();
        ArrayList<String> categories = generateCategories();
        Input input = new Input();
        String userChoice = input.getString("Would you like to create a grocery list? (yes/no)");
        if (userChoice.equals("yes")){
            while(true){
                createItem(groceryList, categories, input);
                String chooseToContinue = input.getString("Would you like to enter another item? (yes/no)");
                if (chooseToContinue.equals("no")){
                    break;
                }
            }
        } // if user says "yes" and wants to create grocery list
        outputList(sortListOfGroceriesByName(groceryList));
    } // end main method
}
